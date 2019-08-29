package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		// Your code follows here.
		int items = n.nextInt();
		
		String[] name = new String[items];
		double[] price = new double[items];
		
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
		
		double total1 = 0;
		double total2[] = new double[customers];
		String[] people = new String[customers];
		
		for (int i = 0; i < customers; i++) {
			firstName = n.next();
			lastName = n.next();
			people[i] = firstName + " " + lastName;
			numberOfItems = n.nextInt();
			double total = 0;
			
			for (int j = 0; j < numberOfItems; j++) {
				amount = n.nextDouble();
				fruit = n.next();
								
				for (int k = 0; k < items; k++) {
					if (fruit.equals(name[k])) {
						total += amount * price[k];
//						total1 += total;
						// System.out.println(total1);
					}
				}
			}
			total2[i] = total;
			
		}
		
		double s = total2[0];
		int index = 0;
		for (int i = 0; i < total2.length; i++) {
			if (s < total2[i]) {
				s = total2[i];
				index = i;
			}
		}
		System.out.println("Biggest: " + people[index] + " (" + String.format("%.2f",s) + ")");
		
		double t = total2[0];
		int index1 = 0;
		for (int i = 0; i < total2.length; i++ ) {
			if (t > total2[i]) {
				t = total2[i];
				index1 = i;
			}
		}
		System.out.println("Smallest: " + people[index1] + " (" + String.format("%.2f",t) + ")");
		
		double avg = 0;
		for (int i = 0; i < total2.length; i++) {
			avg += total2[i];
		}
		avg = avg / total2.length;
		
		System.out.println("Average: " + String.format("%.2f",avg));
		
		n.close();
		
	}
}	
	
