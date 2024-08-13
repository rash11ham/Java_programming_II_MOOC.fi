
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> unitItems;

    public StorageFacility() {
        this.unitItems = new HashMap();
    }
    
    public void add(String unit, String item){
        this.unitItems.putIfAbsent(unit, new ArrayList());
        this.unitItems.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> emptyUnit = new ArrayList();
        if(this.unitItems.containsKey(storageUnit)){
            return this.unitItems.get(storageUnit);
        }
        return emptyUnit;
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> tempUnit = this.unitItems.get(storageUnit);
        for(int i=0; i<tempUnit.size(); i++){
            if(tempUnit.get(i).equals(item)){
                tempUnit.remove(i);
            }
        }
        if(this.contents(storageUnit).isEmpty()){
            this.unitItems.remove(storageUnit);
        } 
            
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnit = new ArrayList();
        for(String s: this.unitItems.keySet()){
            storageUnit.add(s);
        }
        return storageUnit;
    }
}
