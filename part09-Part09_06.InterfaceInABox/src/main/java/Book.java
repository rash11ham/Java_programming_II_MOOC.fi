/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Book implements Packable{
    private String author;
    private String book;
    private double weight;

    public Book(String author, String book, double wieght) {
        this.author = author;
        this.book = book;
        this.weight = wieght;
    }


    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author+": "+this.book;
    }
    
    
    
}
