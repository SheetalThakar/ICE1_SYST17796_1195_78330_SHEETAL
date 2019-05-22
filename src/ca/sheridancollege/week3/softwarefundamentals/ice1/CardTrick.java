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
 * @modifier: Venkatesh Sritharan
 * ID: 991558154
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random rand = new Random();
            int value = rand.nextInt((13-1) +1) + 1;
            c.setValue(value);
            
            int suitNo  = rand.nextInt((3 - 0) +1) + 0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suitNo]);
            System.out.println(c.getSuit() + " " + c.getValue());
            
            magicHand[i]=c;  //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a Card value and suit: ");
        int ValCard = input.nextInt();
        input.nextLine();
        String ValSuit = input.nextLine();
        
        for (int i=0; i<magicHand.length; i++) {
            if ((magicHand[i].getValue()== ValCard) && (magicHand[i].getSuit()== ValSuit))
            {
                System.out.println("Card is matched");
            }
            else {
                    System.out.println("Card is not matched");
                    }
          Card luckyCard=new Card();
         luckyCard.setValue(7);
         luckyCard.setSuit("Hearts");
        }
        
        
        
    
        
        
        
        
        // and search magicHand here
        //Then report the result here
    }
    
}
