package midweek7;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your
//own method.
public class Sum_Of_Two {
    public static void main(String[] args) { //main method

        Scanner sc = new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("First num is:  "); // print statement
        int a =sc.nextInt(); //value of user input
        System.out.println("Second num is:  "); //print statement
        int b = sc.nextInt(); //value of user input

        int sum = (a+b); // sum = a+b
        System.out.println();
        System.out.println("Sum is "+sum); //print statement
    }
}
