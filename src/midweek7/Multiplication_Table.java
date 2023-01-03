package midweek7;

import java.util.Scanner;

//Print multiplication table of 24, 50 and 29 using loop.
public class Multiplication_Table {

    public static void main(String[] args) {

        int sum = 24; // declared local variable
        for (int i = 1; i <= 10; i++) //loop starting at 1 and end at 10 as value will be more than
            System.out.println(sum + " * " + i + " = " + sum * i); // print statement
        System.out.println("End of Timetable");

        int sum2 = 50; // declared local variable
        for (int l = 1; l <= 10; l++) //loop starting at 1 and end at 10 as value will be more than
            System.out.println(sum2 + " * " + l + " = " + sum2 * l); // print statement
        System.out.println("End of TimeTable");

        int sum1 = 29;// declared local variable
        for (int p = 1; p <= 10; p++) //loop starting at 1 and end at 10 as value will be more than
            System.out.println(sum1 + " * " + p + " = " + sum1 * p); // print statement
    }
}