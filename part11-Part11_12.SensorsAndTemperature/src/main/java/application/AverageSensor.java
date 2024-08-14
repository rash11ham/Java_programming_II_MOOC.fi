/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rashe
 */
public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList();
        this.readings = new ArrayList();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    
    @Override
    public boolean isOn(){   
        for(Sensor sensor: this.sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void setOn(){
        for(Sensor sensor: this.sensors){
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff(){
        for(Sensor sensor: this.sensors){
            sensor.setOff();
        }
    }
    
    @Override
    public int read(){
        
        if(isOn() || this.sensors.size()> 0){
            double average = this.sensors.stream()
                    .mapToInt(s -> s.read())
                    .average()
                    .getAsDouble();
            this.readings.add((int) average);
            return (int) average;
        } else {
            throw new IllegalStateException("The sensor is off");
        }
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
    
}
