/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rashe
 */
public class SaveableDictionary {
    private Map<String, String> values;
    private Map<String, String> keys;
    private String file;

    public SaveableDictionary() {
        this.values = new HashMap();
        this.keys = new HashMap();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    
    public void add(String words, String translation){
        this.keys.putIfAbsent(words, translation);
        this.values.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
              
        String string = null;
        if(this.isKey(word)){
            string = this.keys.get(word);
        }
        if(this.isValue(word)){
            string = this.values.get(word);
        }
        
        return string;
    }
    
    public void delete(String word){
        if(this.keys.containsKey(word)){
            String val = this.keys.get(word);
            this.values.remove(val);
            this.keys.remove(word);
            
        } 
        if(this.values.containsKey(word)){
            String val = this.values.get(word);
            this.keys.remove(val);
            this.values.remove(word);
            
        }
    }
    
    public boolean load(){
        List<String> list = new ArrayList();
        try{
            Files.lines(Paths.get(this.file))
                    .forEach(a -> list.add(a));
            for(String str: list){
                String[] string = str.split(":");
                this.add(string[0], string[1]);
            }
            return true;
        } catch(Exception e){
            System.out.println("error: file not accessable! "+e.getLocalizedMessage());
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.file));
            for(String key: this.keys.keySet()){
                writer.println(this.printToDictionary(key));
                
            }
            writer.close();
            return true;
        } catch(Exception e){
            System.out.println("File not reachable! "+e.getLocalizedMessage());
            return false;
        }
    }
    
    public String printToDictionary(String key){
        return key+":"+this.keys.get(key);
    }
    
    public boolean isKey(String string){
        
        for(String str: this.keys.keySet()){
            if(str.equals(string)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isValue(String string){
        
        for(String str: this.values.keySet()){
            if(str.equals(string)){
               return true;
            }
        }
        return false;
    }
    
    
    
}
