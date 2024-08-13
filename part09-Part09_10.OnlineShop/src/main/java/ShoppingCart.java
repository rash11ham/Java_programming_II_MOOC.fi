
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList();
    }
    
    public void add(String product, int price){
        if(!this.itemName(product)){
            this.items.add(new Item(product, 1, price));
        } else {
            for(Item item:this.items){
                if(product.equals(item.getProduct())){
                    item.increaseQuantity();
                }
            }
        }
    }
    
    public boolean itemName(String product){
        for(Item item:this.items){
            if(product.equals(item.getProduct())){
                return true;
            }
        }
        return false;
    }
    
    public int price(){
        int price = 0;
        for(Item item: this.items){
            price += item.price();
        }
        return price;
    }
    
    public void print(){
        for(Item item: this.items){
            System.out.println(item
            );
        }
    }
}
