package midweek7;

//Take 10 integers from keyboard using loop and print their average value on the
//screen.

import java.util.Scanner;

public class Keyboard_Average {

    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //declared scanner class to input
        int sum = 0; //declared variable 0 becasue I want the loop to start at 0
        for (int i =0; i<10;i++){ //for loop method; to start at 0 and end at 10
            System.out.println("Enter a number:"); // using print statment to ask user to enter 10 times to find value of entered number
            sum=sum+sc.nextInt(); // this will read input from user
        }
        double average = sum/10; // declared double as it will be decimals and average of sum which user entered
        System.out.println("Average is "+average); // this will print the average
    }
}
