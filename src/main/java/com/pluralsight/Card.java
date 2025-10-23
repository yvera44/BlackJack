package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
// only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
// only return the value if the card is face up
        if(isFaceUp){
// this is the string value of the card
// i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue() { // <--- CHANGE THE RETURN TYPE TO int
        if (!isFaceUp) {
            return 0; // Return 0 if the card is hidden
        }
        // Actual implementation to convert String value to int score
        switch (value) {
            case "A":
                return 11;
            case "K, Q, J":
                return 10;
            default:
                return Integer.parseInt(value);
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
