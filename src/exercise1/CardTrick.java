package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Sinan Aldulaimi Feb 03, 2023
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            Random random = new Random();
            int randomValue = random.nextInt(13) + 1;
            card.setValue(randomValue);
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random.nextInt(4)]);
                        hand[i] = card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        // insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of card from 1 to 13  : ");
        int valueUser = input.nextInt();
         System.out.println("Please enter the number of suit from 1 to 4 : ");
         int suitUser = input.nextInt() -1;
        
        
        
        
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)       
        boolean choose = false;
        for (Card card : hand) {
            
            if (card.getValue()== valueUser && card.getSuit().equals(Card.SUITS[suitUser])) {
                choose = true;
                break;
                }
            }
                if (choose) {
            printInfo();
        } else {
            System.out.println("Sorry, your guess is incorrect.");
        }
    }

        
        
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Sinan Aldulaimi Feb 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sinan Aldulaimi, but you can call me Sinan, or sir");
        System.out.println();
        
        System.out.println("This is my info contact");
        System.out.println("-- My phone number is : 4373326181");
        System.out.println("-- My Email is : aldulasi@sheridancollege.ca");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Swiming");
        System.out.println("-- Cooking");
        System.out.println("-- Playing Games");
        System.out.println("-- Reading stories");

        System.out.println();
        
    
    }

}
