/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.entity;

import solitaire.adt.ArrayQueue;
import solitaire.adt.QueueInterface;

public class DrawDeckQueue {
    private QueueInterface<Cards> cards = new ArrayQueue<>();
    
    public QueueInterface<Cards> getCards(){
        return cards;
    }
    
    //
    
     public void initDeck(Deck deck) {
        //for each cards in deck
        //cards.enqueue(deck.getcards.pop());
        /*for (int set = 0; set < 7; set++) {
            for (int card = 1; card <= 13; card++) {
                cards.enQueue(new Cards(card));
            }
        }*/
    }
     
//    public void shuffle() {
//        for (; !cards.isEmpty();) {
//            int swapIndex = (int)((Math.random() * ((51 - 1) + 1)) + 1);
//            Cards temp 
//        }
//    }
     
     public void displayAll() {
        for (; !cards.isEmpty();) {
            System.out.println(cards.deQueue());
        }
    }
     
      public static void main(String[] args) {
        Deck dd = new Deck();
        
        dd.initDeck();
        //dd.shuffle();
        //dd.displayAll();
    }
}
