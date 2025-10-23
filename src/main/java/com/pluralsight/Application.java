package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        players();

        Deck deck = new Deck();
        Hand hand1 = new Hand();
// deal 5 cards
        for (int I = 0; I < 5; I++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand1.Deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }

    public static List<String> players() {
        Scanner scanner = new Scanner(System.in);
        List<String> playerList = new ArrayList<>();

        System.out.println("Enter number of players: " );
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < playerCount; i++) {

            System.out.print("Enter player names" + (i + 1) + ": ");
            String playerName = scanner.nextLine();

            playerList.add(playerName);

        } return playerList;
    }
}
