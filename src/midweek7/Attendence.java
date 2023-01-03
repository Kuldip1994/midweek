package midweek7;

import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
public class Attendence {
    public static void main(String[] args) {  //main method
        Scanner sc = new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("Number of classes held"); //print statment
        double a = sc.nextDouble(); //decalred double as to have input have decimals
        System.out.println("Number of classes attended");
        double b = sc.nextDouble(); //decalred double as to have input have decimals
        double c = (b / a * 100); // to work out percentage

        if (c < 75) {
            System.out.println("Student is not allowed to seat in this exam ");
        }
        else{
            System.out.println("Student is allowed to seat in this exam");
        }
    }
}

