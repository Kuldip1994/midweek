package midweek7;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among
//them.
public class Oldest_Youngest {
    public static void main(String [] args){ //main method
        Scanner sc=new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("First Person"); //print statement
        int a = sc.nextInt();  //value of user input
        System.out.println("Second Person"); //print statement
        int b = sc.nextInt(); //value of user input
        System.out.println("Third Person");//print statement
        int c = sc.nextInt(); //value of user input

        if(a<b && a<c){ //if state b is greater than a and c greater than a then the youngest person will be first person
            System.out.println("First Person is the youngest"); //print statement
        } else if (b<a && b<c) { //if state a is greater than b and c greater than b then the youngest person will be second person
            System.out.println("Second Person is the youngest");//print statement
        } else if (c<a && c<b) {  //if state a is greater than c and b greater than c then the youngest person will be Third person
            System.out.println("Third Person is the youngest");//print statement
        }
        else { // if all enters same age then this would look into
            System.out.println("same age");//print statement
        }
        if(a>b && a>c){ //if state a is greater than b and a greater than c then the oldest person will be first person
            System.out.println("First Person is the oldest");//print statement
        } else if (b>a && b>c) { //if state b is greater than a and b greater than c then the oldest person will be Second person
            System.out.println("Second Person is the oldest");//print statement
        } else if (c>a && c>b) { //if state c is greater than a and c greater than b then the oldest person will be Third person
            System.out.println("Third Person is the oldest");//print statement
        }
        else { //if all enters same age then this would look into
            System.out.println("same age");//print statement
        }


    }

}
