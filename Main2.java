package org.hcl8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		try {
			System.out.println("Enter an integer input :");
			n = sc.nextInt();
			System.out.println("Entered Value is " + n);
		} catch (InputMismatchException ex) {
			ex.printStackTrace();
		}
		sc.close();
	}
}
