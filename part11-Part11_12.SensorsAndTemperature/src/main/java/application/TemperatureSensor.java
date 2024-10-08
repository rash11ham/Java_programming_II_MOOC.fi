/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author rashe
 */
public class TemperatureSensor implements Sensor{
 
    private boolean sensor;

    public TemperatureSensor() {
        this.sensor = false;
    }   
    
    @Override
    public boolean isOn(){   
        return this.sensor;
    }
    
    @Override
    public void setOn(){
        this.sensor = true;
    }
    
    @Override
    public void setOff(){
        this.sensor = false;
    }
    
    public int read(){
        if(isOn()){
            return returnRandom();
        } else {
            throw new IllegalStateException("The sensor is off");
        }
    }
    
    public int returnRandom(){
        Random r = new Random();
        int lower = -30;
        int upper = 30;
        int result = r.nextInt(upper - lower) + lower;
        return result;
    }
}
