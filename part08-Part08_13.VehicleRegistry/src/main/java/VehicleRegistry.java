
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        if(this.get(licensePlate) == null){
            this.hashmap.put(licensePlate, owner);
            return true;
        }
               
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        String plateOwner = null;
        for(LicensePlate lp: this.hashmap.keySet()){
            if(lp.equals(licensePlate)){
                plateOwner = this.hashmap.get(lp);
            }   
        }
        return plateOwner;
    }
    
    public boolean remove(LicensePlate licensePlate){
       for(LicensePlate lp: this.hashmap.keySet()){
            if(lp.equals(licensePlate)){
                this.hashmap.remove(lp);
                return true;
            }   
        } 
       return false;
    }

    public HashMap<LicensePlate, String> getHashmap() {
        return hashmap;
    }
    
    public void printLicensePlates(){
        for(LicensePlate lp: this.hashmap.keySet()){
            System.out.println(lp); 
        }
    }
    public void printOwners(){
        for(String str: this.countOwners().keySet()){
            System.out.println(str);
        }
    }
    
    public HashMap<String, Integer> countOwners(){
        int count = 0;
        HashMap<String,Integer> temp = new HashMap();
        for(LicensePlate lp: this.hashmap.keySet()){
             if(this.hashmap.containsValue(this.hashmap.get(lp))){
                 temp.put(this.hashmap.get(lp), count+1);
             }
        }
        return temp;
    }
    
}
