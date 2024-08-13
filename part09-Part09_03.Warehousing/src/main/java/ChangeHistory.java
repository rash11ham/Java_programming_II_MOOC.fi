
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
public class ChangeHistory{

    private ArrayList<Double> products;

    public ChangeHistory() {
        this.products = new ArrayList();
    }
    
    public void add(double status){
        this.products.add(status);
    }
    
    public void clear(){
        this.products.clear();
    }

    public double maxValue(){
        double max = 0;
        for(Double d: products){
            if(max < d){
                max = d;
            }
        }
        return max;
    }
    
    public double minValue(){
        //expecting the warehouse capcity will never go higher then that.
        double min = 10000.0;
        for(Double d: products){
            if(min > d){
                min = d;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        int count = 0;
        for(Double d: products){
            sum+=d;
            count++;
        }
        return sum/count;
    }
    
    @Override
    public String toString() {
        return ""+products;
    }
    
    
    
    
}
