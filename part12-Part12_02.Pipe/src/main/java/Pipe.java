
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Pipe<T> {
    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(this.isInPipe()){
            T t = this.pipe.remove(0);
            return t;
        }
        return null;
    }
    
    public boolean isInPipe(){
        if(this.pipe.size()>0){
            return true;
        }
        return false;
    }
}
