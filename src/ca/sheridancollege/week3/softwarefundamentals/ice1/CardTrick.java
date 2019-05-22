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
 * @modifier Prachi
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
         Scanner input = new Scanner(System.in);
            int Value = input.nextInt();
            input.nextInt();
            String Suit = input.next();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           
            
            Random rand = new Random();
            int value = rand.nextInt ((13-1)+1)+ 1;
            c.setValue(value);
            //c.setValue(insert call to random number generator here)
             int suit = rand.nextInt((3-0)+1)+0;
             c.setValue(value);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit() + " " +c.getValue());
            
            
            magicHand[i]=c;
        }
            
            
            for(int j=0;j<magicHand.length;j++)
            { 
            if(magicHand[j].getValue()==Value && magicHand[j].getSuit() .equals(Suit)){
                  System.out.println("The card is present in magic hand");
                          }
              
            else{ 
              System.out.println("The card is not present in magic hand ");
                    }                     
              Card LuckyCard = new Card();
                LuckyCard.setValue(7);
                LuckyCard.setSuit("Diamonds");
            } 
    }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

