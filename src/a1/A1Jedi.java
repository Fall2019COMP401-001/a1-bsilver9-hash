package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		// Your code follows here.
		int items = n.nextInt();
		
		String[] name = new String[items];
		double price = 0;
		
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
		
		
		int[] numberOfPeople = new int[items];
		int[] person = new int[items];
		int[] amountPurchased = new int[items];
 		
		for (int i = 0; i < customers; i++) {
			
			firstName = n.next();
			lastName = n.next();
			numberOfItems = n.nextInt();
			String[] customersBought = new String[numberOfItems];
			
			for (int j = 0; j < numberOfItems; j++) {
				amount = n.nextInt();
				fruit = n.next();
				customersBought[j] = fruit;
				
				for (int k = 0; k < items; k++) {
					if (fruit.equals(name[k])) {
						amountPurchased[k] += amount;
						break;
					}
					
				}
				
			}
			
			
//			person = amountPurchased;
			// System.out.println(person[i]);
			
			for (int j = 0; j < name.length; j++) {
				for (int k = 0; k < customersBought.length; k++) {
					if (name[j].equals(customersBought[k])) {
						numberOfPeople[j]++;
						break;
					}
				}
				
			}
			
		}
		
		for (int i = 0; i < name.length; i++) {
			if (numberOfPeople[i] == 0) {
				System.out.println("No customers bought " + name[i]);
			} else {
				System.out.println(numberOfPeople[i] + " customers bought " + amountPurchased[i] + " " + name[i]);
			}
		}
		
		n.close();
	}
}
