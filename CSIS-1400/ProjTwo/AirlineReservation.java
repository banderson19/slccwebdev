
package airlinereservation;

import javax.swing.JOptionPane;

public class AirlineReservation {

    public static void main(String[] args) {
        
        String input;
        int status, seat, transfer, firstClassSeat, econClassSeat;
        boolean seated;
        seated = false;
        
        firstClassSeat = 1;
        econClassSeat = 7;
        seat = 0;
        transfer = 0;
        
        int[] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 

        while(seats[0] == 0 || seats[1] == 0 || seats[2] == 0 || seats[3] == 0 || seats[4] == 0 || seats[5] == 0 ||
                seats[6] == 0 || seats[7] == 0 || seats[8] == 0 || seats[9] == 0 || seats[10] == 0 || seats[11] == 0 || seats[12] == 0 || 
                seats[13] == 0 || seats[14] == 0 || seats[15] == 0 || seats[16] == 0 || seats[17] == 0 || seats[18] == 0 || 
                seats[19] == 0 ||seats[20] == 0) {

            input = JOptionPane.showInputDialog(null, 
                "Please type 1 for First\n" +
                "Class and Please type 2 for Economy.");
            status = Integer.parseInt(input);
            
            if (status == 1) {
                for(int i = 0; i < 6; i++) {
                    if(seats[i] == 0) {
                        seats[i] = 1;
                        seated = true;
                        break;
                    } 
                }  
                //first class is full
                if(firstClassSeat > 6 ) {
                    input = JOptionPane.showInputDialog(null, "First class is full, is it okay to put you in economy? 1 for yes, 0 for no.");
                    transfer = Integer.parseInt(input);

                    if(transfer == 1) {
                        JOptionPane.showMessageDialog(null, "Okay you will be added in economy.");
                        for(int i = 6; i < 21; i++) {
                            if(seats[i] == 0) {
                                seats[i] = 1;
                                seated = true;
                                break;
                            }
                        }
                        //plane full
                        if (econClassSeat > 20) {
                            JOptionPane.showMessageDialog(null, "Sorry we are full");
                        } else {
                            JOptionPane.showMessageDialog(null, "You are in the economy class, seat number " + econClassSeat++);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Next flight departs in 3 hours.");
                    } 
                //person got first class like they wanted            
                } else {
                    JOptionPane.showMessageDialog(null, "you are in the first class seaction and your seat number is " + firstClassSeat++ + "\n"
                    + "Enjoy your flight ");
                }
            } else {
                for(int i = 6; i<21; i++) {
                    if(seats[i] == 0) {
                        seats[i] = 1;
                        seated = true;
                        break;
                    }
                }
                //economy full
                if(seated == false){
                   input = JOptionPane.showInputDialog(null, "Economy class is full, is it okay to put you in first class? 1 for yes, 0 for no.");
                   transfer = Integer.parseInt(input); 
                   
                   if (transfer == 1) {
                       JOptionPane.showMessageDialog(null, "Okay you will be placed in first class.");
                       for(int i=0; i<6; i++) {
                           if(seats[i] == 0) {
                               seats[i] = 1;
                               seated = true;
                               break;
                           }
                       }
                       //plane full
                       if(seated == false) {
                           JOptionPane.showMessageDialog(null, "Sorry, it seems were full");
                       } else {
                           JOptionPane.showMessageDialog(null, "You are in the first class, your seat is " + firstClassSeat++ + "\n"
                                   + "Enjoy your flight");
                       }
                   } else {
                       JOptionPane.showMessageDialog(null, "Next flight leaves in 3 hours.");
                   }
                } 
                //person got economy class like they wanted
                else {
                    JOptionPane.showMessageDialog(null, "You are in economy class, your seat number is " + econClassSeat++ + "\n"
                            + "Enjoy your flight");
                }
            }
        }  
    }
}
