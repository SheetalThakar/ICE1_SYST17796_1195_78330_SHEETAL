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
 * @modifier Suchampreet Singh(991540178)
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand=new Random();
            int value=rand.nextInt((13-1)+1)+1;
            
            
            c.setValue(value);
            
            int suit=rand.nextInt((3-0)+1)+0;
            
            
            c.setSuit(Card.SUITS[suit]);
            
            System.out.print(c.getValue()+" ");
            System.out.print("  "+c.getSuit());
            System.out.println("");
            
            magicHand[i]=c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("\n\nEnter the card suit: Hearts, Diamonds,Spades,Clubs");
        String input1=in.next();
        
        System.out.println("Enter the value of the card from 1-13");
        int input2=in.nextInt();
        // and search magicHand here
        int x=0;
        
       for(int j=0;j<magicHand.length;j++)
       {
           if((magicHand[j].getSuit()).equals(input1) && magicHand[j].getValue()==input2  )
               x++;
          
       }
       if(x==0)
            System.out.println("The selcted card is not available in magic hand");
       else
           System.out.println("The given card is available in magic hand");
        //Then report the result here
    }
    
}
