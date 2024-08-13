
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
public class IOU {
    
    private HashMap<String, Double> hashMap;

    public IOU() {
        this.hashMap = new HashMap();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double money = 0;
        for(String name: hashMap.keySet()){
            if(name.equals(toWhom)){
                 money = this.hashMap.get(name);
            }
        }
        return money;
    }
}
