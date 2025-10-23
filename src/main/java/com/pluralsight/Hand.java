package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    public Hand(){
        cards = new ArrayList<>();
    }
    // A Card is dealt to the Hand and the Hand is responsible
// to store the card
    public void deal(Card card){
        cards.add(card);
    }
    public int getSize(){
        return cards.size();
    }
    // The Hand uses the methods of each card to determine
// the value of each card - and adds up all values
    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }

    public static Hand dealHand(int numberOfCards, Deck deck) {
        Hand hand = new Hand();

        for (int i = 0; i < numberOfCards; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand.deal(card);
        }
        return hand;
    }

}
