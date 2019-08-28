package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// int count = scan.nextInt();
		
		// String[] names = new String[count];
		
		foo(scan);
		
		scan.close();

		// Your code follows here.
		
	}
	
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
		
		for (int i = 0; i < customers; i++) {
			name1 = n.next();
			name2 = n.next();
			items = n.nextInt();
			double total1 = 0;
			for (int j = 0; j < items; j++) {
				items1 = n.nextDouble();
				name3 = n.next();
				cost = n.nextDouble();
				total = items1 * cost;
				total1 += total;
			}
			
			System.out.println(name1.substring(0, 1) + ". " + name2 + ": " + String.format("%.2f", total1));
		
		}
	}
}
