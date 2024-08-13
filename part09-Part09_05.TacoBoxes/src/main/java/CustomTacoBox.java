/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class CustomTacoBox implements TacoBox{
    private int intialTacos;

    public CustomTacoBox(int intialTacos) {
        this.intialTacos = intialTacos;
    }
    
    @Override
    public int tacosRemaining(){
        return this.intialTacos;
    }
    
    @Override
    public void eat(){
        if(tacosRemaining() > 0){
            this.intialTacos -= 1;
        } 
        
    }
}
