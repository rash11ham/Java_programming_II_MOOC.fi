/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rashe
 */
public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap();
        this.flights = new HashMap();
        this.places = new HashMap();
    }
    
    public void addAirplane(String ID, int capacity){
        Airplane airplane = new Airplane(ID, capacity);
        this.airplanes.put(ID, airplane);
    }
    
    public void addFlight(Airplane plane, String departure, String destination){
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(destination, new Place(destination));
        
        Flight flight = new Flight(plane, this.places.get(departure), this.places.get(destination));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String Id){
        return this.airplanes.get(Id);
    }  
    
    
}
