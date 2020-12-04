package org.hcl8;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ItemType type1 = new ItemType();

		System.out.println("Enter the itemtype details :");
		try {
			System.out.println("Enter the name :");
			type1.setName(sc.nextLine());
			System.out.println("Enter the deposit :");
			type1.setDeposit(Double.parseDouble(sc.nextLine()));
			System.out.println("Enter the CostPerDay :");
			type1.setCostPerDay(Double.parseDouble(sc.nextLine()));

			System.out.println(type1);
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}

		sc.close();
	}

}
