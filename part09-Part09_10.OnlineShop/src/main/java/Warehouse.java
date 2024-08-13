
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Warehouse {
    
    private Map<String, Integer> mapPrice;
    private Map<String, Integer> mapStock;
  
    public Warehouse() {
        this.mapPrice = new HashMap();
        this.mapStock = new HashMap();
    }
    public void addProduct(String product, int price, int stock){
        this.mapPrice.put(product, price);
        this.mapStock.put(product, stock);
    }
    
    public int price(String product){
        int price = this.getValue(mapPrice, product);
        if(price > 0){
            return price;
        }
        return -99;
    }
    
    public int stock(String product){
        return this.getValue(mapStock, product);
    }
    
    public int getValue(Map<String, Integer> map, String product){
        int value = 0;
        for(String str: map.keySet()){
            if(str.equals(product)){
                value = map.get(str);
            }
        }
        return value;
    }
    
    public boolean take(String product){
        for(String str: this.mapStock.keySet()){
            if(str.equals(product) && mapStock.get(str) > 0 ){
                int value = mapStock.get(str) - 1;
                addProduct(product, this.getValue(mapPrice, product), value);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> keys = this.mapPrice.keySet();
        return keys;
    }
}
