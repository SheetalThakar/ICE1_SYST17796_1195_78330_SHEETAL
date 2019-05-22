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
 * @modifier najim 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
          
            Random rand = new Random();
            int value = rand.nextInt((13-1)+1)+1;
            
            c.setValue(value);
            //genereate random number from 0 -3
            
            int suit = rand.nextInt((3-0)+1)+0;
             c.setValue(value);
            
            c.setSuit(Card.SUITS[suit]);
            magicHand[i]= c;
            
        }   
           System.out.println(" pick a card ");
        Scanner input = new Scanner(System.in);
        
       
        int value1 = input.nextInt();
         System.out.println(" now pick another ");
        Scanner in = new Scanner(System.in);
        
        String suit1 = in.nextLine();
      
        
      for(int i = 0; i<magicHand.length;i++) {
          
      if((magicHand[i].getSuit() == suit1) && (magicHand[i].getValue()==value1)){
             
           System.out.println("Your cards are here");
       }
      else {
             System.out.println("your cards arn't here sorry");
         }
      break;
       }
       
      
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
