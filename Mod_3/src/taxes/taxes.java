package taxes;

import java.util.Scanner;
/**
 * for var input
 */

public class taxes { 
    public static void main(String[] args) { 
    	System.out.print("Enter sales total: ");
    	
    	try (Scanner input = new Scanner(System.in)) {
			double price = input.nextInt();
			double total;
			
			if (price < 500) {
				total = price + (price * .10);
				System.out.println("Total: " + total);
				/**
				 * start checks
				 */
				
			}
			else if (price >= 500) {
				if (price < 1500) {
					total = price + (price * .15);
					System.out.println("Total: " + total);
				}
			    else if (price >= 1500) {
				    if (price < 2500) {
					    total = price + (price * .20);
					    System.out.println("Total: " + total);
				        }
				
				    else if (price >= 2500) {
					    total = price + (price * .30);
				        System.out.println("Total: " + total);
				        /**
				         * nested for checks, not nested causes errors
				         */
			        }
			    }
			}
			else {
				System.out.println("Invalid Input!");
				/**
				 * back up check
				 */
			}
		}
    }  
} 