package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// calling the foo method with the scanner
		foo(scan);
		
		// All input parsed, so close scanner
		scan.close();

		// Your code follows here.
		
	}
	
	/* foo
	 * changes the input to the output
	 * 
	 * input: Scanner n
	 * 
	 * output: names of customers with the total price of their food
	 * 
	 * preconditions: input must have an int, followed by two Strings, followed by an int,
	 * followed by a double a String and a double representing the amount and cost of the 
	 * items purchased
	 */
	
	public static void foo(Scanner n) {
		int customers;
		customers = n.nextInt();
		
		String name1 = "";
		String name2 = "";
		int items = 0;
		double items1 = 0;
		String name3 = "";
		double cost = 0;
		double total = 0;
		
		// for loop used to input all of the customers and their items that they bought
		
		for (int i = 0; i < customers; i++) {
			name1 = n.next();
			name2 = n.next();
			items = n.nextInt();
			double total1 = 0;
			
			// for loop used to add up the total cost of the items purchased by each customer
			
			for (int j = 0; j < items; j++) {
				items1 = n.nextDouble();
				name3 = n.next();
				cost = n.nextDouble();
				total = items1 * cost;
				total1 += total;
			}
			
			// print the first letter of the first name followed by the last name and the
			// total cost of the items they purchased
			
			System.out.println(name1.substring(0, 1) + ". " + name2 + ": " + String.format("%.2f", total1));
		
		}
	}
}
