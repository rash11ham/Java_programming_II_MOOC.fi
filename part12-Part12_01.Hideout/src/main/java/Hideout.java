
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
public class Hideout<T> {
    private ArrayList<T> hidouts;

    public Hideout() {
        this.hidouts = new ArrayList();
    }
    
    public void putIntoHideout(T toHide){
        if(!this.hidouts.contains(toHide)){
            this.hidouts.add(toHide);
        }
    }
    
    public T takeFromHideout(){
        T t = null;
        if(this.isInHideout()){
            t = this.hidouts.remove(0);
        }
        return t;
    }
    
    public boolean isInHideout(){
        if(this.hidouts.size() > 0){
            return true;
        }
        return false;
    }
    
    
}
