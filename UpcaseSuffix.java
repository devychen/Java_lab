/**
 * Lab 3-1
 * TKRB
 * Task: 
 * Write a program which reads a word w and an integer l
 * Outputs word w with the last l characters in upper case
 * Make sure that integer l is in the bounds of word w
 * Print an error message if l is outside the bounds of w
 */

 import java.util.*;

public class UpcaseSuffix {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word:");
        String w = keyboard.nextLine();
        System.out.println("Enter a number:");
        int l = keyboard.nextInt();
        String toUpper, remain;

        if(w.length()>=l){
            remain = w.substring(0, w.length()-l);
            toUpper = w.substring(w.length()-l, w.length());
            System.out.println(remain + toUpper.toUpperCase());
        } else {
            System.out.println("Number outside the word bounds");
        }

        keyboard.close();

    }
    
}
