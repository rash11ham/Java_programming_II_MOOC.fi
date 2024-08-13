/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Litracy implements Comparable<Litracy>{
    private String country;
    private String gender;
    private int year;
    private double litracyPercentage;

    public Litracy(String country, String gender, int year, double litracyPercentage) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.litracyPercentage = litracyPercentage;
    }

    @Override
    public String toString() {
        return this.country+" ("+this.year+"), "+ this.gender+", "+this.litracyPercentage;
    }

    public double getLitracyPercentage() {
        return litracyPercentage;
    }

    public String getCountry() {
        return country;
    }
    
      
    
    
    @Override
    public int compareTo(Litracy litracy){
        if (this.litracyPercentage > litracy.getLitracyPercentage()) {
            return 1;
        }
        if (this.litracyPercentage < litracy.getLitracyPercentage()) {
            return -1;
        }
        return 0;
//        int litPercent = (int)(this.litracyPercentage*100000);
//        int objPercent = (int)(litracy.getLitracyPercentage()*100000);
//        
//        return litPercent - objPercent;
    }
    
}
