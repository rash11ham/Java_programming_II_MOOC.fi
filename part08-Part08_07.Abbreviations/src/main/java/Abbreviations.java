
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
public class Abbreviations {
    HashMap<String, String> abbs;

    public Abbreviations() {
        this.abbs = new HashMap();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbs.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        abbreviation = this.sanitisString(abbreviation);
        if(this.abbs.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return this.abbs.get(abbreviation);
        }
        return null;
    }
    
    public String sanitisString(String string){
        if(string == null){
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
    
}
