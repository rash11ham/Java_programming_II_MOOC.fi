/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author rashe
 */
public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }
    
     public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String answer = scanner.nextLine();
            if (answer.equals("x")) {
                break;
            }
            if (answer.equals("1")) {
                addPlaneDetails();
            } 
            if (answer.equals("2")) {
                addFlight();
            } 
            
            
        }
    }
    
    public void addPlaneDetails(){
        System.out.println("Give the airplane id:");
        String planeId = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        this.flightControl.addAirplane(planeId, capacity);
        
    }
    
    private void addFlight() {
        System.out.println("Give the airplane id: ");
        Airplane airplane = this.askPlaneDetails();
        System.out.println("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }
    
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printPlaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }
    
    public void printAirplanes(){
        for(Airplane plane: this.flightControl.getAirplanes()){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for(Flight flight: this.flightControl.getFlights()){
            System.out.println(flight);
        }
    }
    
    public void printPlaneDetails(){
        System.out.println("Give the airplane id:");
        Airplane plane = this.askPlaneDetails();
        System.out.println(plane);
    }
    
    
    public Airplane askPlaneDetails(){
        Airplane plane = null;
        while(plane == null){
            String planeId = scanner.nextLine();
            plane = this.flightControl.getAirplane(planeId);
            
            if(plane == null){
                System.out.println("No airplane with the id " + planeId + ".");   
            }
        }
        
        return plane;
    }
}
