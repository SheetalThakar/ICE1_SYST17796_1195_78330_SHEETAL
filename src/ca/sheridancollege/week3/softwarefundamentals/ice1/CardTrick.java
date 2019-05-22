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
 * @modifier Yashaswi Pandey
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int value;
        int suit;
        boolean check = false;
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(2);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            value = rand.nextInt((13-1)+1)+1;
            suit = rand.nextInt((3-0)+1)+0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            
            System.out.println(c.getSuit() + " " + c.getValue());
            
            magicHand[i]=c;
        }
        
        System.out.println("Enter suit of a card");
        String userSuit =  in.nextLine();
        
        in = new Scanner(System.in);
        System.out.println("Enter value of a card");
        int userValue = in.nextInt();
        
        for(int j = 0; j<magicHand.length; j++){
            if(magicHand[j].getSuit().equals(userSuit)){
                if(magicHand[j].getValue()==userValue){
                    System.out.println("card found");
                    check = true;
                    break;                    
                }
            }
        }
        if(!check){
            System.out.println("card not found");
        }
    
        
        System.out.println("Lucky card is" + luckyCard.getSuit() + " " + luckyCard.getValue());
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
