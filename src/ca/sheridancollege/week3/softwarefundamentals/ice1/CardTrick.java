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
 * @Kamaljit Singh
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckycard=new Card();
        luckycard.setValue(6);
        luckycard.setSuit("Hearts");
        for (int i=0; i<magicHand.length; i++)
        {
//generate random nos. from 1-13
            Card c = new Card();
            Random rand = new Random();
//generate random nos. from 0-3            
            int value=rand.nextInt((13-1)+1)+1;
            c.setValue(value);
            
            int suit=rand.nextInt((3-0)+1)+0;
            c.setSuit(Card.SUITS[suit]);
//printing            
            System.out.println(c.getSuit() +" " +c.getValue());
//Add value and suit to ARRAY
            magicHand[i]=c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
       
            System.out.println("enter the value of suit ");
            String suit1=in.nextLine();
            System.out.println("enter the value of card");
            int value1=in.nextInt();
               int m=0;
                   
                       for (int j=0;j<7;j++){
                           if (suit1.equals(magicHand[j].getSuit()) && (value1==magicHand[j].getValue())) {
                               System.out.println("CArd is found");
                               
                               break;
                } else System.out.println("Not found");
                       }
                   
                            

        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
