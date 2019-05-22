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
 * @author sheetal
 */
public class CardTrick {
    
    public static void main(String[] args, int Value1)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand= new Random();
            int value;
            value = 1+rand.nextInt((13-1)+1);
            c.setValue(value);
            
            
            //c.setValue(insert call to random number generator here)
           
          int suit = 1+rand.nextInt((3-1)+1);
            
            c.setSuit(Card.SUITS[suit]);
          
         System.out.println(c.getSuit());
         System.out.println(c.getValue());
         magicHand[i]=c;
        
        }
        Scanner sq = new Scanner (System.in);
        int value1= sq.nextInt();
        String suit1 = sq.nextLine();
        
        for (int i=0; i<magicHand.length; i++)
        {
        
          if( magicHand[i].getSuit().equalsIgnoreCase(suit1) && Value1== magicHand[i].getValue()){
           System.out.println("YES! card is here ");
           
       } else
          {System.out.println("Card isn't here !!");
        
       }
        Card lucky_card =new Card();
            lucky_card.setSuit("heart");
            lucky_card.getValue(7);
            
            
            
        }
    }
}
        
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

