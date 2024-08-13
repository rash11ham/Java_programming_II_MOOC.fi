
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;
            
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList();
    }
    
    
    
    @Override
    public void add(Item item){
        if(!this.maxWeightReached(item)){           
            this.items.add(item);   
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }
    
    public boolean maxWeightReached(Item item){
        int weight = this.sumItemsWeight() + item.getWeight();
        if( weight > this.capacity){
            return true;
        }
        return false;
    }

    public int sumItemsWeight(){
        int sum = 0;
        if(this.items.size() > 0){
            for(Item item: this.items){
                sum+=item.getWeight();
            }
        }
        return sum;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
    public void printItem(){
        for(Item i: this.items){
            System.out.println(i.getName());
        }
    }

    
    
    
}
