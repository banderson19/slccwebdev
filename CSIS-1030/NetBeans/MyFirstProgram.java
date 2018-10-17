/*
Project: <Mk2 Wk4 Assignment 1>;
File: <myfirstprogram>;
Name: <Bradford Anderson>;
Date: <6/9/2018>

Description: 
1) asked user for their name and age.

*/
package myfirstprogram;

import java.util.Scanner;

public class MyFirstProgram {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Please Enter your name and age");
        name = sc.next(); 
        age = sc.nextInt();
        System.out.printf("hello " + name + " you are the age of " + age);    
    }    
}
