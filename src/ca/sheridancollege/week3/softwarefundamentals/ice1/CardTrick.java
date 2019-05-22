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
 *
 * @author sheetal
 * @modifier Jasleen Kaur Chahal
 * Student ID-991548892
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      System.out.println("Enter card value");
      System.out.println("Enter a suite");
      Scanner scan = new Scanner(System.in);
      int value1 = scan.nextInt();
      scan.nextLine();
      String suite1 = scan.nextLine();
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         //random number fro 1 to13
         Random rand = new Random();
         int value = rand.nextInt((13 - 1) + 1) + 1;

         c.setValue(value);
         //c.setValue(insert call to random number generator here)
         int suitNo = rand.nextInt((3 - 0) + 1) + 0;
         c.setSuit(Card.SUITS[suitNo]);

         //print the suit and value of card
         System.out.println(c.getSuit() + " " + c.getValue());
         //Add it to MagicHand Array of card
         magicHand[i] = c;
         for (int a = 0; a < magicHand.length; a++) {

            if ((value1 == magicHand[a].getValue()) && (suite1 == magicHand[a].getSuit())) {
               System.out.println("card present");
            }
            else {
               System.out.println("card do not match");
               break;
            }

         }
       Card luckyCard=new Card();
         luckyCard.setValue(7);
         luckyCard.setSuit("Hearts");
         //insert code to ask the user for Card value and suit, create their card
         // and search magicHand here
         //Then report the result here
      }
   }
}
