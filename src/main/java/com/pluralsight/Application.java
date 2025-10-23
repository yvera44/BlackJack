package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        List<String> playerNames = getPlayerNames();
        for (String playerName : playerNames) {
            System.out.println(playerName);
        }

        Deck deck = new Deck();
        Hand hand = new Hand();
// deal 5 cards
        for (int I = 0; I < 5; I++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand.Deal(card);
        }
        int handValue = hand.getValue();
        System.out.println("This hand is worth " + handValue);
    }

    public static List<String> getPlayerNames() {
        Scanner scanner = new Scanner(System.in);
        List<String> playerList = new ArrayList<>();

        System.out.println("Enter number of players: " );
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < playerCount; i++) {

            System.out.print("Enter player name " + (i + 1) + ": ");
            String playerName = scanner.nextLine();

            playerList.add(playerName);


        } return playerList;
    }
}
