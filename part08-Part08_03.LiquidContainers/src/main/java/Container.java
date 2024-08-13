
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
public class Container {
    
    private int fstTankLiters;
    private int secTankLiters;

    public Container() {
        
        this.fstTankLiters = 0;
        this.secTankLiters = 0;
    }
    
    public boolean checkHundred(int amount){
        if(this.fstTankLiters+amount > 100){
            return true;
        } else if(this.secTankLiters + this.fstTankLiters > 100){
            return true;
        } else if(this.secTankLiters+amount > 100){
            return true;
        }
        return false;
    }
    
    public int addLiters(int amount){
      
        if(amount > 0 && !checkHundred(amount))
           this.fstTankLiters += amount;
        else if(checkHundred(amount))
           this.fstTankLiters = 100;
        return this.fstTankLiters;
    }
    
    public int moveLiters(int amount){
        if(amount > 0 && amount <= this.fstTankLiters){
            this.fstTankLiters -= amount;
            if(!checkHundred(amount))
                this.secTankLiters += amount;
            else
                this.secTankLiters = 100;
            
        } else if(amount > this.fstTankLiters && !checkHundred(amount)){
            this.secTankLiters+=this.fstTankLiters;
            this.fstTankLiters = 0;
        } else if(checkHundred(amount)){
            this.secTankLiters = 100;
            this.fstTankLiters = 0;
        }
        return this.secTankLiters;
    }
    
    public int removeLiters(int amount){
        if(amount > 100 || (this.secTankLiters - amount) < 0){
            this.secTankLiters = 0;
        } else {
            this.secTankLiters -= amount;
        }
        return this.secTankLiters;
    }

    @Override
    public String toString() {
        
        return "First: "+this.fstTankLiters+"/100\nSecond: "+this.secTankLiters+"/100";
    }
    
    
    
}
