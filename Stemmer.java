
/**
 * Lab 4-1 (4-2 is optional)
 * TKRB
 * Task: 
 * Write a program which uses the above algorithm to create the stem of a word. 
 * The program must read all words on the System.in stream, 
 * create a stem for the word and print word and the stem.
 * Make sure to consider the case in which the length of a input word is smaller than 4.
 * 
 * Tip: work with a line scanner
 * Tip: three character words don't have suffixes
 */
import java.util.*;

public class Stemmer {

    public static void main(String[] args) {

        System.out.println("Enter your words in the following line:");

        Scanner keyboard = new Scanner(System.in);
        String wordList = keyboard.nextLine();
        Scanner wordScan = new Scanner(wordList);
        String stem = "";

        System.out.println("\n");

        while (wordScan.hasNext()) {
            String word = wordScan.next(); 
            // word length > 4
            if (word.length() > 4) {
                // ing, delete ing
                if (word.endsWith("ing")) {
                    stem = word.substring(0, word.length() - 3);
                }
                // sses, delete es
                if (word.endsWith("sses")) {
                    stem = word.substring(0, word.length() - 2);
                }
                // ies, replace ies with y
                if (word.endsWith("ies")) {
                    stem = word.replace("ies", "y");
                }
                // s, & not sses, ies, ss, remove final s
                if (word.endsWith("s") &&
                        !word.endsWith("sses") &&
                        !word.endsWith("ies") &&
                        !word.endsWith("ss")) {
                    stem = word.substring(0, word.length() - 1);
                }
                // eed, remove d
                if (word.endsWith("eed")) {
                    stem = word.substring(0, word.length() - 1);
                }
                // ed & not eed, remove ed
                if (word.endsWith("ed") &&
                        !word.endsWith("eed")) {
                    stem = word.substring(0, word.length() - 2);
                }
                
            } else {
                stem = word;
            }       
            System.out.println(word + " - " + stem);
        }
        keyboard.close();
        wordScan.close();
    }
}