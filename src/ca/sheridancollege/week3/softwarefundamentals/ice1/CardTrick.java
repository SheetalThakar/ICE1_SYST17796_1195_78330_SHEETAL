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
 * @author Riya Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Pick up any card");
        int value1=input.nextInt();
        System.out.println("Enter value of suit");
        input.nextLine();
        String suit1=input.nextLine();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand=new Random();
            int value=rand.nextInt((13-1)+1)+1;
            
            int suit=rand.nextInt((3-0)+1)+0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.println("Value="+c.getValue());
            System.out.println("Suit="+c.getSuit());
            magicHand[i]=c;
        }
        for(int i=0;i<magicHand.length;i++)
        {
        if(magicHand[i].getSuit().equals(suit1)&&magicHand[i].getValue()==value1)
            System.out.println("Card is present in the magic hand");
        else
            System.out.println("Card is not present");
        }
        
        Card luckyCard=new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        
        System.out.println(luckyCard.getValue()+" "+luckyCard.getSuit());
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
