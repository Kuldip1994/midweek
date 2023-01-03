package midweek7;

//Write a program to print a string entered by user.

import java.util.Scanner;

public class String_Print {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in); // //scanner class to allow user to input the values
        System.out.println("Any word"); // print statement
        String word = sc.next();
        System.out.println("My word is "+word);
    }
}
