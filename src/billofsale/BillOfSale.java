/*
 * Nicole Tao
 * BillOfSale.java
 * This program prints out the bill of a sale
 * February 28th, 2018
 */

package billofsale;

/**
 *
 * @author nitao5001
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 12.49;
        double paid = 20.0;
        //This will calculate the tax of the item
        double tax = price*0.13;
        //This will calculate the total amount that must be paid
        double total = price + tax;
        //This will calculate the amount of change
        double change = paid - total;
        
        System.out.println("Bill Of Sale");
        System.out.println("Price: $" + price);
        System.out.println("Paid: $" + paid);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Change: $" + change);
    }
    
}
