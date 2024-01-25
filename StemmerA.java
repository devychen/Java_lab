/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 04
 * Author:      Yifei Chen
 * Description: Return words to stem class.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

 import java.util.Scanner;

 public class StemmerA {
     public static void main(String[] args) {
 
         // input
         Scanner keyboard = new Scanner(System.in);        
         System.out.println("Enter your words in the following line:");
         String wordlist = keyboard.nextLine();
 
         // line break
         System.out.print("\n");
 
         // read words, print results
         Scanner readByWords = new Scanner(wordlist);
         while (readByWords.hasNext()){
             String word = readByWords.next();
             String stem = returnStem(word); // define method
             System.out.println(word + " - " + stem);
         }
 
         // close scanners
         keyboard.close();
         readByWords.close();
 
     }
 
     // stem method. We learned methods in the last class, not sure if allow to apply
     private static String returnStem(String word){
 
         // while statement check suffixes
         while (word.length() > 4){
             String suffixLast1 = word.substring(word.length() - 1);
             String suffixLast2 = word.substring(word.length() - 2);
             String suffixLast3 = word.substring(word.length() - 3);
             String suffixLast4 = word.substring(word.length() - 4);
 
             // proceed respectively
             // ing, < = 4, remove ing
             if(suffixLast3.equals("ing")){
                 word = word.substring(0, word.length() - 3);
             // sses, remove es
             } else if(suffixLast4.equals("sses")){
                 word = word.substring(0, word.length() - 2);
             // ies, replace ies to y
             } else if(suffixLast3.equals("ies")){
                 word = word.substring(0, word.length() - 3) + "y";
             // s, not in sses, ies, ss, remove s
             } else if (suffixLast1.equals("s") 
             && !suffixLast4.equals("sses") 
             && !suffixLast3.equals("ies") 
             &&! suffixLast2.equals("ss")){
                 word = word.substring(0, word.length() -1);
             // eed, <= 4, remove d
             } else if (suffixLast3.equals("eed")){
                 word = word.substring(0, word.length() - 1);
             // ed, not eed, <= 4, remove ed
             } else if (suffixLast2.equals("ed")
             && !suffixLast3.equals("eed")){
                 word = word.substring(0, word.length() - 2);
             } else {
                 break; //end loop
             }
         }
 
         return word;
     }
 }