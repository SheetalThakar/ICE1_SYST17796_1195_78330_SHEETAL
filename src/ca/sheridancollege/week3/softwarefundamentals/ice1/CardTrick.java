/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Prince Preet Kaur
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        System.out.println("Pick a card and Enter a suit?");
        Scanner in = new Scanner(System.in);
        int card = in.nextInt();
        in.nextLine();
        String card1 = in.nextLine();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Card luckycard = new Card();
            
            Random rand = new Random();
            int value = rand.nextInt((13 - 1) + 1) + 1;
            c.setValue(value);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            int suit = rand.nextInt((3 - 1) + 1) + 0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            
            System.out.println(c.getValue() + " " + c.getSuit());
           
            magicHand[i] = c;
            System.out.println(luckycard.getValue() + " " + luckycard.getSuit());
                    
        }
        for(int a=0; a<magicHand.length; a++)
        {
            if((magicHand[a].getSuit() == card1)&&(magicHand[a].getValue() == card)) 
                System.out.println("Card is present");
            else
                System.out.println("Card is not present");
       
                break;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
    }
    
}
