
/**
 * Use s.replace (string, string)
 */

import java.util.Scanner;

public class LoveHateReplace {
    public static void main(String[] args) {
        /*
         * Create a new Scanner object 'keyboard' and connect it to stream
         * System.in
         */
        Scanner keyboard = new Scanner(System.in);

        /*
         * Print prompt.
         */
        System.out.println("Enter a line that contains the word \"hate\", all in lowercase :");

        /*
         * Read a line from 'keyboard' and store it in variable 'sentence'
         */
        String sentence = keyboard.nextLine();

        /*
         * Search for the first occurence of substring 'hate' in 'sentence'
         * Replace the substring we have just found with string 'love' and
         * print the changed sentence to System.out.
         */
        String newSentence = sentence.replaceFirst("hate", "love");
        System.out.println(newSentence);

        keyboard.close();
    }
}
