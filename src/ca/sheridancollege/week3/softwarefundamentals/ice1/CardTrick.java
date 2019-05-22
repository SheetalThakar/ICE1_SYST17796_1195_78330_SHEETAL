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
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(13);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random rand = new Random();
            
            int value = rand.nextInt((13-1)+1)+1;
            
            
            c.setValue(value);
            
            int suit = rand.nextInt((3-0)+1)+0;
            
            c.setSuit(Card.SUITS[suit]);
            
            //print the suit and value of card
            //Add it to MagicHand Array of card
            
            System.out.println(c.getSuit());
            System.out.println(c.getValue());
            magicHand[i] = c;
        }
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the card value");
        
        int cardValue = input.nextInt();
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the suit value");
        
        String suitName = input.next();
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
        if(magicHand[i].getValue()==cardValue && magicHand[i].getSuit().equalsIgnoreCase(suitName)){
            System.out.println("User's card is here in the magic hand of random cards");
            break;
    }
        else{
            System.out.println("Card is not here");
        }
           
    
}
        System.out.println("Lucky card was "+luckyCard.getValue()+" "+luckyCard.getSuit());
    }
}
