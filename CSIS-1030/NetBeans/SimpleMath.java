/*
 Project: <Mk2 Wk4 Assignment 2>;
File: <SimpleMath>;
Name: <Bradford Anderson>;
Date: <6/9/2018>

Desciption: User input 5 digit values. The system prints out the sum, 
average, product, smallest digit, largest digit, the quotient and the remainder
of the numbers. 


 */
package simplemath;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        //this is a scanner object
        Scanner sc = new Scanner(System.in);
        int numOne, numTwo, numThree, numFour, numFive;
        int smallest, largest;
        int sum, average, product, quotient, remainder;
        
        System.out.println("Please Enter the first number: ");
        numOne = sc.nextInt();
        
        System.out.println("Please Enter the second number: ");
        numTwo = sc.nextInt();
        
        System.out.println("Please Enter the three number: ");
        numThree = sc.nextInt();
        
        System.out.println("Please Enter the four number: ");
        numFour = sc.nextInt();
        
        System.out.println("Please Enter the five number: ");
        numFive = sc.nextInt();
        
        sum = (numOne + numTwo + numThree + numFour + numFive);
        average = ((numOne + numTwo + numThree + numFour + numFive)/ 5);
        product = (numOne * numTwo * numThree * numFour * numFive);
        quotient = numOne / numTwo;
        
        smallest = numOne;
        if (numTwo < smallest) 
            smallest = numTwo;
        if (numThree < smallest) 
            smallest = numThree;
        if (numFour < smallest)
            smallest = numFour;
        if (numFive < smallest) 
            smallest = numFive;
        
        
        largest = numOne;
        if (numTwo > largest)
            largest = numTwo;
        if (numThree > largest) 
            largest = numThree;
        if (numFour > largest) 
            largest = numFour;
        if (numFive > largest) 
            largest = numFive;
        
       
        System.out.println("sum: " + sum );
        System.out.println("average: " + average);
        System.out.println("product: " + product);
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
        System.out.println("quotient: " + quotient);
        

        remainder = numFour % numFive;
        if(remainder == 0)
            System.out.println("no Remainder");
        if(remainder != 0)
            System.out.println("The remainder is: " + remainder);
    }
}
        
        

