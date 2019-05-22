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
 * @modifier Aabhas
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Hearts");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random rand = new Random();
            int value = rand.nextInt((13-1)+1)+1;
            c.setValue(value);

            int value1 = rand.nextInt((3-0)+1)+0;
            c.setSuit(Card.SUITS[value1]);
            
            //print
            System.out.println(c.getValue() + c.getSuit());
            
            //add to magic array
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("pick any number (1-13)");
        int userNum = input.nextInt();
        
        System.out.println("pick any suit");
        String userSuit = input.next();
        
        System.out.println();
           System.out.println(userNum +" of " + userSuit);
        // and search magicHand here
        boolean flag = true; 
        for(int i=0;i<magicHand.length;i++){
           if(userNum == magicHand[i].getValue() && userSuit.equalsIgnoreCase(magicHand[i].getSuit())){
               System.out.println("Your card is in the HAND");
               break;
           }
           else{
               flag=false;
           }
        }
        
        if(!flag){
            System.out.println("Your Card is NOT in the HAND");
        }
        //Then report the result here
    }
    
}
