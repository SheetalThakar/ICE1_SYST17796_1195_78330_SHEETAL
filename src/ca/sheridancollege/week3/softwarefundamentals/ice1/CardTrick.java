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
 * @author Dipal Sorathiya
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input=new Scanner(System.in);
        System.out.print("your card value is:");
        int userCardValue=input.nextInt();
        
        input.nextLine();
        
        System.out.print("your card suit is:");
        String userCardSuit=input.nextLine();
      
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random rand=new Random();
            int value=rand.nextInt((13-1)+1)+1;
            c.setValue(value);
            
            int suitNo=rand.nextInt((3-0)+1)+0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suitNo]);
            System.out.print("Suit is: "+c.getSuit()+" ");
            System.out.print("Value is: "+c.getValue()+" ");
            System.out.println();
            
            magicHand[i]=c;
        }
        
        for(int j=0;j<magicHand.length;j++){
            if(magicHand[j].getValue()==userCardValue && magicHand[j].getSuit().equals(userCardSuit)){
                System.out.println("The card id present in magic hand.");
            }
            else
                System.out.println("The card is not present in magic hand.");
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
