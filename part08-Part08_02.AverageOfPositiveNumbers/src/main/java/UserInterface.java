
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Integer> list;

    public UserInterface(Scanner scanner, ArrayList<Integer> list) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            Average avg = new Average();
            int number = scanner.nextInt();
            if(number == 0){
                System.out.println(avg.averageOfNumbers(this.list));
                break;
            }
            this.list.add(number);
        }
        
    }
    
    
}
