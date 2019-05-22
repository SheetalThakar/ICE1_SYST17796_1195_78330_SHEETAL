/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier SeungHyun Yun / 991547711
 */
public class CardTrick {
    
/*    public static int Rand (int min, int max) { // Random 
        int num = ((int) Math.random() * (max - min + 1) + min);
        System.out.print(num);
        return ((int) Math.random() * (max- min + 1) + min);
    } */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        Card[] magicHand = new Card[7];
        int user_value;
        String user_suit = "N/A";
        boolean areCardsEqual = false;
        
        for (int i=0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue (rand.nextInt(13) + 1);
            c.setSuit (Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        boolean isSuitValid = false;
        do{
            System.out.print("\nChoose one of the suits (");
            for (int i = 0; i < Card.SUITS.length; i++) System.out.print(" " + (i+1) + ". " + Card.SUITS[i] + " ");
            System.out.print(")\n  Enter a number please: ");
            
            int selection = input.nextInt();
            
            switch (selection) {
                case 1:
                    user_suit = "Hearts";
                    isSuitValid = true;
                    break;
                case 2:
                    user_suit = "Diamonds";
                    isSuitValid = true;
                    break;
                case 3:
                    user_suit = "Spades";
                    isSuitValid = true;
                    break;
                case 4:
                    user_suit = "Clubs";
                    isSuitValid = true;
                    break;
                default: System.out.println("Invalid input!");
            }
        }while(!isSuitValid);
        
        boolean isValueValid = false;
        do{
            System.out.print("\nEnter a number for a card (1 - 13): ");
            user_value = input.nextInt();
            
            if (user_value >= 1 && user_value <= 13) isValueValid = true;
            else System.out.println("Invalid input!");
        }while (!isValueValid);

        Card card = new Card();
        card.setValue(user_value);
        card.setSuit(user_suit);
        
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].equals(card)) {
                areCardsEqual = true;
                break;
            }
        }
        
        if (areCardsEqual == true) System.out.println("Your card" + card + " is present in the 7 cards!");
        else System.out.println("Your card" + card + " is not present in the 7 cards!");
        
    }
    
}
