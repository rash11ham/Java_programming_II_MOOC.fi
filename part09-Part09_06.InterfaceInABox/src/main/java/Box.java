
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
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> packables;

    public Box(double capacity) {
        this.capacity = capacity;
        this.packables = new ArrayList();
    }
    
    public void add(Packable packable){
        if(isMaxCapacityReach(packable.weight())){
            this.packables.add(packable);
        }
    }
    
    public boolean isMaxCapacityReach(double weight){
        if((this.getBoxWeight()+weight) < this.capacity){
            return true;
        }
        return false;
    }
    

    
    public double getBoxWeight(){
        double weight = 0;
        for(Packable pack: this.packables){
            weight += pack.weight();            
        }
        return weight;
    }
    
    
    public double weight(){
        return this.getBoxWeight();
    }

    @Override
    public String toString() {
        return "Box: "+this.packables.size()+" items, total weight "+this.getBoxWeight()+" kg";
    }
    
    
    
    
    
    
}
