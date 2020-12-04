package org.hcl3;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int noOfObjs = sc.nextInt();
		Wicket[] wicketObjs = new Wicket[noOfObjs];
		byte b = 1;
		sc.nextLine();
		for (int i = 0; i < noOfObjs; i++) {
			System.out.println("Enter the details of wicket " + b++);
			String[] str = sc.nextLine().split(",");
			wicketObjs[i] = new Wicket();
			wicketObjs[i].setOver(Long.parseLong(str[0]));
			wicketObjs[i].setBall(Long.parseLong(str[1]));
			wicketObjs[i].setWicketType(str[2]);
			wicketObjs[i].setPlayerName(str[3]);
			wicketObjs[i].setBowlerName(str[4]);
		}

		System.out.println("Wicket Details : ");
		for (Wicket obj : wicketObjs) {
			System.out.println("Over : " + obj.getOver());
			System.out.println("Ball : " + obj.getBall());
			System.out.println("Wicket Type : " + obj.getWicketType());
			System.out.println("Player Name : " + obj.getPlayerName());
			System.out.println("Bowler Name : " + obj.getBowlerName());
		}

	}

}
