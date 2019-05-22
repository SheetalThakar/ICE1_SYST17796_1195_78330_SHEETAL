/**
 * Andy Tran
 * 991551797
 * ICE1
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
        Scanner in = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Hearts");
        System.out.println(luckyCard.getValue());
        System.out.println(luckyCard.getSuit());
        
        boolean present = true; 
        System.out.println("Any Card, Enter Value:");
        int userValue = in.nextInt();
        in.nextLine();
        System.out.println("Any Card, Enter Suit:");
        String userSuit = in.nextLine();
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            Random rand = new Random();
            int value = rand.nextInt((13 - 1) + 1) + 1;
            c.setValue(value);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suit = rand.nextInt((3-0) + 1) + 0;
            c.setSuit(Card.SUITS[suit]);
             magicHand[i] = c;
           
            if (magicHand[i].getValue() == userValue && magicHand[i].getSuit() == userSuit)
            {
                present = true;
                break;
            }
            else
            {
                present = false;
            }
        }
        if (present)
        {
            System.out.println("Your card is present in the magic hand!");
        }
        else
        {
            System.out.println("Your card is not present in the magic hand!");
        }
        }//ends for loop
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result her    
}//ends CardTrick class

