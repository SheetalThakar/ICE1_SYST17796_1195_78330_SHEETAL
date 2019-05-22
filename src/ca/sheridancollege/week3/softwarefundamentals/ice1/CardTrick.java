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
 * @modifier preet singh dhaliwal
 */
public class CardTrick {
    
    public static void main(String[] args)
    {       
       
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();   
        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
        
        for (int i=0; i<magicHand.length; i++)
        {
             Card c = new Card();
        
        Random randm =new Random();
          //c.setValue(insert call to random number generator here)
        int value = randm.nextInt((13-1)+1)+1;
        c.setValue(value);
        //generating random suit 
        int suit = randm.nextInt((3-1)+1);
        //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit()+"  "+ c.getValue());
          
           magicHand[i]=c; 
        }
        Card sCard = new Card();
        Scanner in =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("choose card : ");
        int svalue = in.nextInt();
        sCard.setValue(svalue);
        String sSuit= input.nextLine();
        sCard.setSuit(sSuit);
        
        
         // and search magicHand here
         int a=0;
        for(int j=0;j<7;j++){
        if(sCard.getValue()== magicHand[j].getValue()&& sCard.getSuit().equalsIgnoreCase(magicHand[j].getSuit()) ){
           a=1;
        }  
        else{
        a = -1;}
        }
        
        //Then report the result here
        if(a==1){
            System.out.println("Card is found in magicHand");
        }
        else if(a==-1){
            System.out.println("Card is not found in magicHand");
        }
        
         System.out.println("luckyCard" + luckyCard.getValue() + " -" + luckyCard.getSuit()); 
        
        
    }
    
}
