package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		// Your code follows here.
		int items = n.nextInt();
		
		// creating a String array for each item in the store and another array 
		// for the price of each item
		
		String[] name = new String[items];
		double[] price = new double[items];
		
		// for loop places the items and their prices into the arrays
		
		for (int i = 0; i < items; i++) {
			name[i] = n.next();
			price[i] = n.nextDouble();
		}
		
		int customers = n.nextInt();
		String firstName;
		String lastName;
		int numberOfItems = 0;
		double amount = 0;
		String fruit = null;
		
		// creating a double array for the total price for each customer and
		// a String array where each index is a customer to line up with the prices
		
		// double total1 = 0;
		double[] total2 = new double[customers];
		String[] people = new String[customers];
		
		// for loop used to place the customers into the people array
		
		for (int i = 0; i < customers; i++) {
			firstName = n.next();
			lastName = n.next();
			people[i] = firstName + " " + lastName;
			numberOfItems = n.nextInt();
			double total = 0;
			
			for (int j = 0; j < numberOfItems; j++) {
				amount = n.nextDouble();
				fruit = n.next();
								
				// for loop used to total the full price for each customer
				
				for (int k = 0; k < items; k++) {
					if (fruit.equals(name[k])) {
						total += amount * price[k];
					}
				}
			}
			
			// placing each total price into the array of prices
			
			total2[i] = total;
			
		}
		
		// for loop used to find the index of the highest price and the customer
		// that price correlates to
		
		double s = total2[0];
		int index = 0;
		for (int i = 0; i < total2.length; i++) {
			if (s < total2[i]) {
				s = total2[i];
				index = i;
			}
		}
		
		// prints the biggest price and the customer that price correlates to
		
		System.out.println("Biggest: " + people[index] + " (" + String.format("%.2f",s) + ")");
		
		// for loop used to find the index of the lowest price and the customer
		// that price correlates to
		
		double t = total2[0];
		int index1 = 0;
		for (int i = 0; i < total2.length; i++ ) {
			if (t > total2[i]) {
				t = total2[i];
				index1 = i;
			}
		}
		
		// prints the smallest price and the customer that price correlates to
		
		System.out.println("Smallest: " + people[index1] + " (" + String.format("%.2f",t) + ")");
		
		// for loop used to total up all of the prices to find the average price
		
		double avg = 0;
		for (int i = 0; i < total2.length; i++) {
			avg += total2[i];
		}
		avg = avg / total2.length;
		
		// prints the average price
		
		System.out.println("Average: " + String.format("%.2f",avg));
		
		// All input parsed, so close scanner
		
		n.close();
		
	}
}	
	
