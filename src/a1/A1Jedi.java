package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		// Your code follows here.
		int items = n.nextInt();
		
		// created String array to hold all of the items in the store
		
		String[] name = new String[items];
		double price = 0;
		
		// for loop used to place items into the name array
		
		for (int i = 0; i < items; i++) {
			name[i] = n.next();
			price = n.nextDouble();
		}
		
		int customers = n.nextInt();
		String firstName;
		String lastName;
		int numberOfItems = 0;
		int amount = 0;
		String fruit = null;
		
		// two int arrays created to count the amount of customers that bought a certain item
		// and the number of times a certain item was purchased
		
		int[] numberOfPeople = new int[items];
		// int[] person = new int[items];
		int[] amountPurchased = new int[items];
 		
		// for loop used to place values into variables
		
		for (int i = 0; i < customers; i++) {
			firstName = n.next();
			lastName = n.next();
			numberOfItems = n.nextInt();
			
			// String array created to place what each customer bought into an array
			
			String[] customersBought = new String[numberOfItems];
			
			// for loop created to place what each customer bought into customersBought array
			
			for (int j = 0; j < numberOfItems; j++) {
				amount = n.nextInt();
				fruit = n.next();
				customersBought[j] = fruit;
				
				// for loop created to add the amount each item was purchased into the amountPurchased array
				
				for (int k = 0; k < items; k++) {
					if (fruit.equals(name[k])) {
						amountPurchased[k] += amount;
						break;
					}
					
				}
				
			}
			
			// for loop created to place how many people bought each item into the numberOfPeople array
			
			for (int j = 0; j < name.length; j++) {
				for (int k = 0; k < customersBought.length; k++) {
					if (name[j].equals(customersBought[k])) {
						numberOfPeople[j]++;
						break;
					}
				}
				
			}
			
		}
		
		// for loop created to print statements saying how many people bought how much of an item
		
		for (int i = 0; i < name.length; i++) {
			if (numberOfPeople[i] == 0) {
				System.out.println("No customers bought " + name[i]);
			} else {
				System.out.println(numberOfPeople[i] + " customers bought " + amountPurchased[i] + " " + name[i]);
			}
		}
		
		// All input parsed, so close scanner
		
		n.close();
	}
}
