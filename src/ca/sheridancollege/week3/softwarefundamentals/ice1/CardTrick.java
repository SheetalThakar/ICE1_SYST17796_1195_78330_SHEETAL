/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Siddharth Patel
 * student number-991538414
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard=new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("spade");
      
        
                        //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
       
        
       
           
            
           
            
            for (int j = 0; j < magicHand.length; j++) 
            {
                Card c=new Card();
                 int value =(int)((Math.random() * 12) +1);
            c.setValue(value);
            int suit=(int)((Math.random() * 3)  +1 );
            c.setValue(suit);
            c.setSuit(Card.SUITS[suit]);
            System.out.println("The card is "+ c.getValue()+ "of" +c.getSuit());
            magicHand[j]=c;
            }
            
              Scanner input=new Scanner(System.in);
         System.out.println("Choose any card:\n Enter the suit first and then value. ");
           String valueSuit=luckyCard.getSuit();
           int valueUser=luckyCard.getValue();
           Card c =new Card();
            
           for (int j = 0; j < magicHand.length; j++) 
           {
                if(valueSuit.equalsIgnoreCase(magicHand[j].getSuit())){
                    if(valueUser==c.getValue()){
                        System.out.println("You got one of the magic card.");
                        break;
                    }
                    
                    else 
                    continue;
                }
                else 
                    continue;
               
                
             
        }
            
            
            
         
    }
          
}
       
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

