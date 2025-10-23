package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test

    void dealHand_givesCorrectNumberOfCards() {
        Deck deck = new Deck();
        int expectedNumberOfCards = 5;
        Hand hand = Hand.dealHand(expectedNumberOfCards, deck);

        assertEquals(expectedNumberOfCards, hand.getSize());

    }
}