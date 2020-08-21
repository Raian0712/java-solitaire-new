/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.entity;

import solitaire.adt.ArrayQueue;
import solitaire.adt.QueueInterface;

public class DrawDeck {

    private QueueInterface<Cards> cards = new ArrayQueue<>();

    public QueueInterface<Cards> getCards() {
        return cards;
    }

    public void insertDeck(Deck deck) {
        int length = deck.getCards().size();
        for (int i = 0; i < length; i++) {
            cards.enQueue(deck.getCards().pop());
        }
    }

    public void takeDeck() {
        cards.deQueue();
    }

    public void displayAll() {
        for (; !cards.isEmpty();) {
            System.out.println(cards.deQueue());
        }
    }

    public static void main(String[] args) {
        DrawDeck dd = new DrawDeck();

        //dd.initDeck(Deck);
        //dd.displayAll(); 
    }
}
