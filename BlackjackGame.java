package Blackjacks;

/**
 * 2nd Class Project 
 * 
 * @author (Esperanza Joya) 
 * @version (09.25.17)
 */
import java.util.Random ; 
import java.util.Scanner;
public class BlackjackGame
{
    public static void BlackjackGame() { 

        Hand player;
        Hand dealer;
        player = new Hand();
        dealer = new Hand();
        System.out.println("Welcome to Blackjack!");
        System.out.println("You drew a " + player.getCard1() + " and a " + player.getCard2());
        System.out.println("Your total is " + player.getTotal());
        System.out.println("The dealer drew a " + dealer.getCard1() + " and a " + dealer.getCard2());
        System.out.println("Your total is " + player.getTotal ());
        
        
    } 
    public void getRandNum () {
       
        if ( player.getTotal = 21){
            System.out.println ("You Win");
        }
    }
        
}
