package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static Deck deck = new Deck();
    public static void main(String[] args) {

        List<String> playerNames = getPlayerNames();
        for (String playerName : playerNames) {
            System.out.println(playerName);
        }

        deck.shuffle();
        
        int numberOfCards = 2;

        List<Hand> hands = dealToPlayers(playerNames, numberOfCards);
        displayHands(hands);
        declareWinner(hands);
    }

    private static void displayHands(List<Hand> hands) {
        for (Hand hand : hands){
            displayHand(hand);
        }
    }

    private static void declareWinner(List<Hand> hands) {
        Hand winningHand = null;
        int highestHandValue = 0;

        for (Hand hand : hands){
            int handValue = hand.getValue();

            if (handValue <= 21 && (handValue > highestHandValue)){
                winningHand = hand;
                highestHandValue = handValue;

            }
        }
        System.out.println("The winner is: " + winningHand);
    }

    private static List<Hand> dealToPlayers(List<String> playerNames, int numberOfCards) {
        List<Hand> hands = new ArrayList<>();

        for (int i = 0; i < playerNames.size(); i++) {

            Hand hand = Hand.dealHand(numberOfCards, deck);
            hands.add(hand);

        }
        return hands;
    }

    private static void displayHand(Hand hand) {
        System.out.println(hand);
        int handValue = hand.getValue();
        System.out.println("This hand is worth " + handValue);
    }

    public static List<String> getPlayerNames() {
        Scanner scanner = new Scanner(System.in);
        List<String> playerList = new ArrayList<>();

        System.out.print("Enter number of players: " );
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < playerCount; i++) {

            System.out.print("Enter player name " + (i + 1) + ": ");
            String playerName = scanner.nextLine();

            playerList.add(playerName);

        } return playerList;
    }

}
