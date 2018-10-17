
package fivecardpoker;

import java.util.Random;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class FiveCardPoker {
    
    public static void main(String[] args) {
        //create array with ranks each suit hearts, spades, diamonds, clubs
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int counter = 0;
        List hand = new ArrayList();
        while (counter < 5) {   
            Random deal = new Random();
            int suit = deal.nextInt(suits.length);
            int rank = deal.nextInt(ranks.length);
            hand.add(ranks[rank] + " of " + suits[suit]);
            counter++; 
        }        
        JOptionPane.showMessageDialog(null, hand);              
        for(int i = 0; i<hand.size(); i++){
                for(int j = 0; j<hand.size(); j++){
                    if (hand.get(i) == hand.get(j)){
                        JOptionPane.showMessageDialog(null, "You have a pair");        
  
                    } else {
                        JOptionPane.showMessageDialog(null, "You do not have a pair");        
                    } 
                }
            }
    }
}


