/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Bot extends Player{

    public Bot(String name) {
        super(name);
    }
    
    public void play(){
        super.play();
    }
    
    public void addMove(String move){
        super.printName();
        System.out.println(move+"ing");
    }
}
