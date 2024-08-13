
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap();
    }
    
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList());
        this.translations.get(word).add(translation);
   
    }
    
    public ArrayList<String> translate(String word){
        if(this.translations.containsKey(word)){
            return this.translations.get(word);
        }
        ArrayList<String> al = new ArrayList();
        return al;
    }

    public void remove(String word){
        if(this.translations.containsKey(word)){
            this.translations.remove(word);
        }
    }

    public void print() {
        this.translations.forEach((key, value)->{
            System.out.println(key +" "+value);
        });
    }
    
    
    
}
