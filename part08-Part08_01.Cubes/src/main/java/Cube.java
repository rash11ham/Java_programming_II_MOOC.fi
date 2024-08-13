/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Cube {
    private int number;

    public Cube() {
        this.number = 0;
    }
    
    public int cubeNumbers(int number){
        number = number * number * number;
        return number;
    }
    
}
