/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            System.out.println("Pick any card ? ");
            
            Scanner input = new Scanner(System.in);
            int card1 =input.nextInt();
            
            Scanner in = new Scanner(System.in);
            String suit1 =in.nextLine();
            
            
            //random no, from 1-13
            Random rand = new Random();
            int value = rand.nextInt((13-1) + 1) + 1;
            c.setValue(value);
            
            //random no. from 0 to 3.
            int val = rand.nextInt((3-0) + 1) + 0;
            c.setSuit(Card.SUITS[val]);
            
            //print the suit & the value of a card.
            System.out.println(c.getSuit()+" " +c.getValue());
            
            //Add it to MagicHand Array of Card.
            magicHand[i]=c;
            
            for(int a = 0; a<magicHand.length; a++) {
             if (card1 == magicHand[a].getValue())
             {
                System.out.println("This card number is matched");  
             } 
             else 
             { 
                System.out.println("This card number is not matched"); 
             }
             
              if (suit1 == magicHand[a].getSuit())
             { 
                 System.out.println("This suit is matched"); 
             } 
             else 
             { 
                System.out.println("This suit is not matched");
            
             }
            break;
        }
            Card luckyCard = new Card();
            luckyCard.setValue(5);
            luckyCard.setSuit("Clubs");
            System.out.println(luckyCard.getValue()+" "+luckyCard.getsuit());
        
        }
    }
    }
   
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

