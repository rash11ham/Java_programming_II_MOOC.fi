
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Average {
    
    private Integer number;
    
    public Average(){
        this.number = 0;
    }
    
    public double averageOfNumbers(ArrayList<Integer> list){
        int count = 0;
        for(Integer i : list){
            if(i>0){
                count++;
                this.number += i;
            }           
        }
        if(this.number <= 0){
            System.out.println("Cannot calculate the average");
        }
        return 1.0*this.number/count;
    }
}
