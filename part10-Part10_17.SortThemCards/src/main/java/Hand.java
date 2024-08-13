
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        Iterator<Card> iter = this.cards.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int sumOfHand(){
        int sum = this.cards.stream()
                .mapToInt(a -> a.getValue())
                .sum();
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.sumOfHand() - hand.sumOfHand();
    }
   
    public void sortBySuit(){
        this.sort();
        Collections.sort(cards, new SortBySuit());
    }
    
}
