
/**
 * Lab 3-1
 * TKRB
 * Task: 
 * Write a program that asks for a price, 
 * calculates the tax, 
 * then prints the price, the tax and the total cost.
 * 
 * An item that costs Euro 100 or more has a 5% tax.
 * For an item that costs less than Euro 100 the customer must not pay taxes.
 */
import java.util.*;

public class TaxProgram {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double taxRate = 0.05;
        double tax;

        System.out.print("Enter the price: ");
        double price = keyboard.nextDouble();
        if (price >= 100) {
            tax = price * taxRate;
        } else {
            tax = 0.0;
        }

        double total = price + tax;
        System.out.println("Item cost: " + price +
                " Tax: " + tax +
                " Total: " + total);

        keyboard.close();
    }
}
