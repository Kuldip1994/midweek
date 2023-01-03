package midweek7;

import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class Take_Two_Int {
    public static void main(String [] args){  //main method

        Scanner sc = new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("Enter the First number "); //print statement for user asking to input value of lenght
        int a = sc.nextInt(); //value of user input
        System.out.println("Enter the Second number"); //print statement for user asking to input value of lenght
        int b = sc.nextInt(); //value of user input

        if (a>b){ // if statment stating a value is bigger then b value enterd by user
            System.out.println("Greatest number   :" +a); // this statment will be printed if a is bigger then b
        } else if (a<b) { //else if statement if a is less then b to print this statment
            System.out.println("Greatest number  :" +b); // this statement will be printed.
        }else{

        }

    }

}
