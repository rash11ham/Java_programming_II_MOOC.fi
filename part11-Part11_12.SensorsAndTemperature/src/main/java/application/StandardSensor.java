/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author rashe
 */
public class StandardSensor implements Sensor{
    private int number;

    public StandardSensor(int number) {
        this.number = number;
        
    }
    
    @Override
    public boolean isOn(){   
        return true;
    }
    
    @Override
    public void setOn(){
        isOn();
    }
    
    @Override
    public void setOff(){
        isOn();
    }
    
    public int read(){
        return this.number;
    }
    
}
