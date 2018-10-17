/*
 * Class:<CSIS 1400>
 * Assignment: <Homework 2>
 * Name: <Bradford Anderson>
 * Date: <6/18/2018>
 */
package homeworktwo;

/**
 *
 * @author B-rad19
 */
public class HomeworkTwo {
    public static void main(String[] args) {
        int num;
        int square;
        int cube; 
        
        num = 0;
        
        System.out.println("Number Square Cube");

        while(num <= 10) {
            square = num * num; 
            cube = num * num * num;
        
            System.out.println(num + "        " + square + "      " + cube);
            num++;
        }
    }
    
}
