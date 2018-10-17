// CSIS 1400
//Final Project
//Bradford Anderson
//Version 1.0

package rollerdice;


import javax.swing.JOptionPane;

public class RollerDice {

    public static void main(String[] args) {
        String input; // used to parseInt the string into an integer
        int die1, die2, roll, status;
        int count = 0;
        
        // prompts user to enter 1 or 2
        input = JOptionPane.showInputDialog(null, 
                "Please enter 1 if you would like to roll 10000 times\n" +
                "Please enter 2 if you would like to get 3 times");
            status = Integer.parseInt(input);
        
        if (status == 1) { // if status is 1, will list out the 10,000 outcomes
            for(int i=0; i<10000; i++) {
                die1 = (int)(Math.random()*6) + 1;
                die2 = (int)(Math.random()*6) + 1;
                roll = die1 + die2;
                count++;
                
                System.out.println("Outcome number " + count + ": " +  "1st die = " + die1 + ", " +  "2nd die = " + die2 + ", " + "total = " + roll);
            }
        } else if(status == 2) { // if status is 2, will list out the first three
            for(int i=0; i<3; i++) {
                die1 = (int)(Math.random()*6) + 1;
                die2 = (int)(Math.random()*6) + 1;
                roll = die1 + die2;
                count++;
                
                JOptionPane.showMessageDialog(null, count + " Roll count: " + " " +  "1st die = " + die1 + ", " +  "2nd die = " + die2 + ", " + "total = " + roll);
            }   
        }
        JOptionPane.showMessageDialog(null, "Thank you for playing!");
    }
}
