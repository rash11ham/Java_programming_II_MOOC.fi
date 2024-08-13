
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
    private Cube cube;

    public UserInterface(Scanner scanner, Cube cube) {
        this.scanner = scanner;
        this.cube = cube;
    }
    
    public void start(){
        while(true){
            String str = scanner.nextLine(); 
            if(str.equals("end")){
                break;
            }
            int number = Integer.valueOf(str);
            System.out.println(cube.cubeNumbers(number));
        }
    }
}
