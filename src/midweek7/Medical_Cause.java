package midweek7;
//Modify the above question to allow student to sit if he/she has medical cause. Ask
//user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.Scanner;

public class Medical_Cause {
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in); //scanner class to allow user to input the values
        System.out.println("Number of classes held"); //print statement
        double a = sc.nextDouble(); //decalred double as to have input have decimals
        System.out.println("Number of classes attended");
        double b = sc.nextDouble(); //decalred double as to have input have decimals
        double c = (b / a * 100); // formula to work out percentage

        if (c < 75) { // if statement if percentage is less than 75
            System.out.println("Student is allowe to seat in this exam if he/she has medical cause");
            char d = sc.next().charAt(0); // declared char to allow user to put yes or no if they have medical cause
            if (d == 'Y') { // if statement 'Y'
                System.out.println("You can seat in this exam"); //print statement
            } else { // else if they don't have medical condition and attendence  is less than 75
                System.out.println("You cannot seat in this exam");
            }
        }else {
                System.out.println("Student is not allowed to seat in the exam");
            }

        }
    }
