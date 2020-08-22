package solitaire.entity;

import solitaire.adt.ArrayStack;
import solitaire.adt.StackInterface;

public class Deck {
    private StackInterface<Cards> cards = new ArrayStack<>();
    //private StackInterface<Integer> cards = new ArrayStack<>();

    public StackInterface<Cards> getCards() {
        return cards;
    }
    
    public void initDeck() {
        for (int set = 0; set < 7; set++) {
            for (int card = 1; card <= 13; card++) {
                cards.push(new Cards(card));
            }
        }
        /*for (int i = 0; i < 51; i++) {
            //cards.push(new Cards());
            //cards.push(i);
        }*/
    }
    
    public void shuffle() {
        //maybe need to rewrite
        for (int i = cards.size() - 1; i >= 0; i--) {
            int swapIndex = (int)((Math.random() * ((91 - 1) + 1)) + 1);
            Cards temp = cards.get(swapIndex); //change to cards later
            cards.set(swapIndex, cards.get(i));
            cards.set(i, temp);
        }
    }
    
}
