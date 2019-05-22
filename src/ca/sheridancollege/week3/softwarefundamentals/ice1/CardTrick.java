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
 * @modifier 
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random rand = new Random();
            int value = rand.nextInt((13 - 1) + 1) + 1;
            
            c.setValue(value);
            
            int suit = rand.nextInt((3 - 0) + 1) + 0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit() + " " + c.getValue());
            magicHand[i] = c;
            
            
            
            
            //print the suit and value of the card
            //add it to MagicHand Array of Card            
                    
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Please pick a suit");
        String suit1 = input.nextLine();        
        System.out.println("Please pick a number");
        int value1 = input.nextInt();
        
        
        for(int i = 0; i < 1; i++){
            if(suit1 == magicHand[i].getSuit() && value1 == magicHand[i].getValue()){
                System.out.println("Your card matches.");
                break;
            }
            else{
                System.out.println("There are no matching cards");
            }
                
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
