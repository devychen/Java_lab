
/**
 * Lab 0-2 
 * TKRB
 * Task: correct the errors in the given program
 */

import java.util.Scanner; //Import the Scanner class

public class Errors {
    public static void main(String[] args) {
        System.out.println("Can you spot and fix the errors?");

        System.out.println("Enter two numbers and I ");
        System.out.println("add them for you");

        int n1, n2;

        Scanner keyboard = new Scanner(System.in); // add a semicolon at the end of a completed statement

        n1 = keyboard.nextInt(); 
        n2 = keyboard.nextInt(); 

        System.out.println("The sum of the numbers is"); 
        System.out.println(n1 + n2); // sum means add, not minor

        keyboard.close(); // add close
    }
}
