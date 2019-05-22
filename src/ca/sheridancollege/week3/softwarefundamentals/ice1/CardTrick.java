/* 991548224
 
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mihir
 **/
 import java.util.Scanner;
import java.util.Random;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner in=new Scanner(System.in);
        System.out.println("enter a suit");
        String Suit1=in.nextLine();
        System.out.println("pack a card");
        int number=in.nextInt();
        
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
          Random rand=new Random();
        int value=rand.nextInt((13-1)+1)+1;
        c.setValue(value);
        
                
        
        int Suit=rand.nextInt((3-0)+1)+0;
        c.setValue(value);
        c.setSuit(Card.SUITS[Suit]);
        System.out.println("value=" + c.getValue());
        System.out.println("Suit=" + c.getSuit());
        magicHand[i]=c;
        
                

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(Suit1) && magicHand[i].getValue() == number) {
                System.out.println("the card is present in the magic hand");
            } 
            else {
                System.out.println("card is not present.");
            }
        }
        
        Card luckyCard=new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Diamonds");
    }
    
}
