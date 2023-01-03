package midweek7;
//Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class Value_Length {
    public static void main (String []args){ //main method
        Scanner sc= new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("Enter Lenght value"); //print statement for user asking to input value of lenght
        int a =sc.nextInt(); //value of user input
        System.out.println("Enter breadth value");//print statemnt
        int b = sc.nextInt(); //value of user input

        if (a==b){ //if statemnt
            System.out.println("its  square"); //if a==b then this message will print (true)
        }
        else {
            System.out.println("Not a square"); //if false then this message
        }
    }
}
