//Bradford Anderson
//CSIS 1400 midterm
package worldpopulation;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class WorldPopulation {

    public static void main(String[] args) {
        String input;
        int currentYear, estimateYear, time, pop, x;
        double rate, e, num, number, estimatedPop, timeRate, yearOfDoublePop;
        BigInteger worldPop;
        Long currentPop = new Long(7632819325L);
        Long y = new Long(15265638650L);
        
        worldPop = BigInteger.valueOf(currentPop);
        
        input = JOptionPane.showInputDialog(null,
            "Assuming growth rate is at 1.09% \n" + 
            "Enter desired year to find predicted population: ");
        // Estimated pop growth: X = Pe^(r)(t)
        
        estimateYear = Integer.parseInt(input);
        
        currentYear = 2018;
        
        x = 2018;
        e = 2.718281828459045;
        rate = .0109;
        
        timeRate = Math.log(e)/Math.log(y);
        yearOfDoublePop = timeRate*rate;
        JOptionPane.showMessageDialog(null, "Year the population will double is " + yearOfDoublePop);

        
        
        while  (x <= 2048) {
            time = x - currentYear;
            
            num = Math.pow(e, (time*rate));
            estimatedPop = (num * currentPop);
            
            x++;
            JOptionPane.showMessageDialog(null, "Year of " + x + " the population will be " + (Math.round(estimatedPop)));
        }
    }   
}
