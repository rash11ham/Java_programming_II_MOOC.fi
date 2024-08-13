


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Container {
    
    private int liters;
    

    public Container() {
        
        this.liters = 0;
 
    }
    
    public int contains(){
        return this.liters;
    }
    
    public int hundredCheck(int li){
        if(li > 100)
            return 100;
        return li;
    }
    
    public void add(int li){
        if(li > 0){
            this.liters += this.hundredCheck(li);
            this.liters = this.hundredCheck(this.liters);
        }
    }
    
    public void move(int li, Container second){
       
        if(li > this.liters){
            second.add(this.liters);
            this.remove(this.liters);
        } else if(li >= 100 ){
            second.add(100);
            this.remove(this.liters);
        } else {
            second.add(li);
            this.remove(li);
        }
         
        
    }
    
    public void remove(int li){
        if(li > this.liters ){
            this.liters = 0;
        } else {
            this.liters -= li;
        }
    }
    
    
     @Override
    public String toString() {
        return String.valueOf(this.liters) + "/100";
    }
    
}
