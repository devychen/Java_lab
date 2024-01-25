/**
 * Lab 2-2
 * TKRB
 * Task: Read three words and prints the input as required:
 * The first word in capital letters
 * The second word in lower case letters
 * The first two characters of the third word 
 * (we assume that the third word is always at least two characters long)
 */

import java.util.*;

public class Words {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three words: ");
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        String word3 = keyboard.next();

        System.out.println("\n"
                        + "Word one as upper case: " + word1.toUpperCase() + "\n"
                        + "Second word as lower case: " + word2.toLowerCase() + "\n"
                        + "First two characrers of word three: " + word3.substring(0,2));
    

        keyboard.close();


    }
    
}
