package midweek7;
//Write a program to find the length of the string "refrigerator".
import java.util.Scanner;

public class Lenght_String {
    public static void main (String []args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.nextLine();
        int length = word.length();
        System.out.println("Lenght of String is "+length);

        // or//
//        String name = "refrigerator";
//        System.out.println("Lenght of String is "+name.length());
    }
}
