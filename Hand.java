package Blackjacks;


/**
 * This gives the cards a value and makes the numbers random.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Hand
{
    private int total = 0;
    private int card1;
    private int card2;
    private int hit;
    public Hand(){
        card1 = hit();
        card2 = hit();
    }
    public int hit(){
        int rand = (int)(Math.random() * 10) + 1;
        total += rand;
        return rand;
    }
    public int getTotal(){
        return total;
        
    }
    public int getCard1(){
        return card2;
    }
    public int getCard2(){
        return card1;
    }
    
}
