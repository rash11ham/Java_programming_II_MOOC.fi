/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class List<Type> {
    private Type[] values;
    private int firstIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstIndex = 0;
    }
    
    
    public void add(Type value){
        if(this.values.length == this.firstIndex){
            this.grow();
        }
        this.values[this.firstIndex] = value;
        this.firstIndex++;
    }
    
    private void grow(){
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for(int i = 0; i < this.values.length; i++){
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    public boolean contains(Type value){
        return this.indexOfValue(value) >= 0;
    }
    
    public void remove(Type value){
        int indexOfValue = this.indexOfValue(value);
        if(indexOfValue < 0){
            System.out.println("Not found");
        }
        this.moveToTheLeft(indexOfValue);
        this.firstIndex--;
    }
    
    public int indexOfValue(Type value){
        
        for(int i=0; i<this.firstIndex; i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex){
        for(int i=fromIndex; i < this.firstIndex-1; i++){
            this.values[i] = this.values[i+1];
        }
    }
    
    public void printListSize(){
        System.out.println(this.values.length);
    }
    
    public Type value(int index){
        if(index < 0 || index >= this.firstIndex){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstIndex + "]");
        }

        return this.values[index];
    }
}
