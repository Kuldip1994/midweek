package midweek7;
//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class Grading_System {
    public static void main (String [] args){ //main method

        Scanner sc=new Scanner(System.in); // declared scanner class to input data
        System.out.println("Enter your marks"); //scanner class to allow user to input the values
        int a = sc.nextInt(); //value of user input

        if(a<25) {// if user entered value is less than 25 then Grade F is printed
            System.out.println("Grade F"); //print statement
        } else if ((a>=25)&&(a<45)) { //else if statement for value to be more than 25 and less than 45
            System.out.println("Grade E"); //print statement
        } else if ((a>=45)&&(a<50)) { //else if statement for user to enter value to be more than 45 and less than 50
            System.out.println("Grade D");
        } else if ((a>=50)&&(a<60)) { //else if statement for user to enter value to be more than 50 and less than 60
            System.out.println("Grade C");
        } else if ((a>=60)&&(a<80)){ //else if statement for user to enter value to be more than 60 and less than 80
            System.out.println("Grade B");
        } else if ((a>=80)&& (a<=100)){ //else if statement for user to enter value to be more than 80 and less than 100
            System.out.println("Grade A");
        }
        else {
            System.out.println("Enter marks from 1 to 100"); // this will be printed if user enter marks over 100
        }
    }
    }

