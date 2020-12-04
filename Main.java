package org.hcl8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c, a = 0, n;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the cost of the item for n days : ");
			c = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the value of n : ");
			n = sc.nextInt();
			a = c / n;
			System.out.println("cost per day of the item is : " + a);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

	}

}
