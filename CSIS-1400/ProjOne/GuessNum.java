
package guessnum;

import javax.swing.JOptionPane;

public class GuessNum {

    public static void main(String[] args) {
        int num, guess;
        String input;
        num = (int) (Math.random()* 999 + 1);
        
        do {
            input = JOptionPane.showInputDialog(null, "Enter your guess: ");
            guess = Integer.parseInt(input);
            
            if(guess == num) 
                JOptionPane.showMessageDialog(null, "Your guess matches the computers secret number, Congradulations!");
            else if (guess < num) 
                JOptionPane.showMessageDialog(null, "Your guess is too low, guess again");
            else if (guess > num) 
                JOptionPane.showMessageDialog(null, "Your guess is too high, guess again");
        } while (guess != num);   
    }
}
