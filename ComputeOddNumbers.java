/**
 * Lab 4-2 (Optional)
 * TKRB
 * Task: Write a program to the user to enter a positive integer n, 
 * computes the sum of the first n positive odd integers and prints the sum. 
 * For example, if n is 5, you should compute 1 + 3 + 5 + 7 + 9.
 * Don't forget to check whether n is a valid input before using it.
 */

import java.util.*;

public class ComputeOddNumbers {
    
    public static void main(String[] args) {
        
        System.out.print("Enter a positive integer:");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int sum = 0;
        int odd = 1;

        if(n <= 0){
            System.out.println("Invalid input. Enter a positive integer!");
        } else {
            for (int i = 0; i < n; i++){
                sum += odd;
                odd += 2;
            }
            System.out.println("The sum: " + sum);
        }

        keyboard.close();
    }
    
}
