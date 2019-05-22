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
        luckyCard.setValue(1);
        luckyCard.setSuit("Clubs");
          
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //Random number generator
            Random rand = new Random();
           // int value =rand.nextInt((max-min)+1)+min;
            int value =rand.nextInt((13-1)+1)+1;
            c.setValue(value);
            
            //generating random number from 0 to 3 

            int suit =rand.nextInt((3-0)+1)+0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            
            System.out.println(c.getValue() +" " +c.getSuit());
                magicHand[i] = c ;        
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("pick a number");
        int value1 = scan.nextInt();
        System.out.println("pick a suit");
        String suit1 = scan.next();
        
         for (int i=0; i<magicHand.length; i++)
         {
      if( suit1.equalsIgnoreCase(magicHand[i].getSuit()) &&  value1== magicHand[i].getValue() ){
      System.out.println("Here is your card");
      break;
      }
      else
      {
          System.out.println("Card does not match ");
              }
         }
        System.out.println("luckeyCard is " + luckyCard.getValue() + " " + luckyCard.getSuit()); 
    }
      
        
      
    }
    

