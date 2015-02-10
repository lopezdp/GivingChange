/**
 * David P. Lopez
 * COP2800
 * Giving Change Application
 */

package changeApplication;

import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */

public class GivingChange {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        final int PENNIES_PER_DIME = 10;
        final int PENNIES_PER_NICKEL = 5;
        final int PENNIES_PER_PENNY = 1;

        System.out.print("How much is the Amount Due, in Pennies: ");        
        int amountDue = in.nextInt(); //prompt user for amount due.
        
        System.out.print("How much did the customer pay? Enter total Amount "
                + "Received in Pennies: ");
        int amountReceived = in.nextInt(); //prompt user for amount received.
        
        //Compute Change Due
        int changeDue = (amountReceived - amountDue) ;
        
        int dollarsDue = changeDue / PENNIES_PER_DOLLAR;
        
        int quartersDue = 
                (changeDue % PENNIES_PER_DOLLAR) / PENNIES_PER_QUARTER;
        
        int dimesDue = 
                ((changeDue % PENNIES_PER_DOLLAR) % PENNIES_PER_QUARTER) 
                / PENNIES_PER_DIME;
        
        int nickelsDue = 
                (((changeDue % PENNIES_PER_DOLLAR) % PENNIES_PER_QUARTER) 
                % PENNIES_PER_DIME) / PENNIES_PER_NICKEL;
        
        int penniesDue = 
                (((changeDue % PENNIES_PER_DOLLAR) % PENNIES_PER_QUARTER) 
                % PENNIES_PER_DIME) % PENNIES_PER_NICKEL;
        
        //print change due
        System.out.printf("Dollars to return: %6d", dollarsDue);
        System.out.println();
        
        System.out.printf("Quarters to return: %5d", quartersDue);
        System.out.println();
        
        System.out.printf("Dimes to return: %8d", dimesDue);
        System.out.println();
        
        System.out.printf("Nickels to return: %6d", nickelsDue);
        System.out.println();
        
        System.out.printf("Pennies to return: %6d", penniesDue);
        System.out.println();
    }
    
}
