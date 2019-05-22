/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Arshdeep kaur
 * Student id: 991545648
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new CArd();
        luckyCard.setValue(4);
        luckyCard.setSuit("hearts");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //generating random numbers from 1 to 13
            Random rand = new Random();
            int value = rand.nextInt((13-1) + 1)+1;
            c.setValue(value);
            
            //generate random number from 0 to 3
            int suit = rand.nextInt((3-0)+1) +0;
            c.setSuit(Card.SUITS[suit]);
            //print the suit and value of card
            System.out.println(c.getSuit() + " " +c.getValue());
            //Add it to magic hand array of card
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        int value2 = input.nextInt();
        String suit2 = input.nextLine();
        for(int a = 0; a<7; a++)
        {
          if(magicHand[a].getValue()==value2&&magicHand[a].getSuit().equals(suit2))
          {
              System.out.println("user card is present in the magic hand");
          }
          else
          {
              System.out.println("user card is not present in the magic hand");
          }
         
             System.out.println(" luckyCard" + luckyCard.getValue() + " " + luckyCard.getSuit());  
        }
        // and search magicHand here
        //Then report the result here
    }
    
}
