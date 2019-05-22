
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Lakshya Soin (991542495)
 */
public class CardTrick {
    
    public static void main(String[] args)
    { Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Card");
       String uSuit=input.nextLine();
        int uValue=input.nextInt();
        //System.out.println(uSuit + uValue);
    
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //generate random number from 1 to 13
            Random rand=new Random();
            int value= rand.nextInt((13-1)+1)+1;
            
            c.setValue(value);
            //generate Random number from 0 to 3
            
            int suit=rand.nextInt((3-0)+1)+0;
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit() + " "+c.getValue());
            //print the suit and value of card
            //Add it to MagicHand Array of cards
            magicHand[i]=c;
            
           
        }
        for(int i=0;i<4;i++)
        {
          if(uSuit==magicHand[i].getSuit())
          {
          for(int j=0;j<4;j++)
          {
              if(uValue==magicHand[i].getValue())
              { System.out.println("Your card is there in Magic Hand");
                break;}
              else
              {System.out.println("Your card is not there");
              break;}
          }
          }
          else
          {System.out.println("Your card is not there");
           break;}
        }
         Card luckyCard=new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(1);
        System.out.println(luckyCard.getSuit() +" "+luckyCard.getValue());
        
    }
    
}
