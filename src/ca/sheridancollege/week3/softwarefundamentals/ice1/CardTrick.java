/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * RavikumarMundra
 * 991547363
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);
        System.out.println("enter a suit");
        String Suit1= in.nextLine();
        System.out.println("pick  a card");
        int number =in.nextInt();
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int value = rand.nextInt((13-1) + 1) + 1;
            c.setValue(value);
            
            
                    
           
            int suit = rand.nextInt((3-0) + 1) + 0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit() + " "+c.getValue());
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getSuit().equals(Suit1) && magicHand1.getValue() == number) {
                System.out.println("card is present in magicHand");
            } else {
                System.out.println("card is not present in magicHand");
            }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
