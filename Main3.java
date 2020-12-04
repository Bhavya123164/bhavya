package org.hcl8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
		for (EventType event : typeList)
			if (typeId == event.getId())
				return true;

		throw new EventTypeDoesNotExistsException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<EventType> typeList = new ArrayList<EventType>();
		List<Event> eventList = new ArrayList<Event>();

		typeList.add(new EventType(1L, "bookstall"));
		typeList.add(new EventType(2L, "stageexhibition"));
		typeList.add(new EventType(3L, "race"));

		System.out.println("Enter the number of the events : ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of event " + (i + 1));
			String[] str = sc.nextLine().split(",");
			String name = str[0];
			String details = str[1];
			String ownerName = str[2];
			Long typeId = Long.parseLong(str[3]);

			do {
				try {
					if (isValid(typeId, typeList)) {
						Event event = new Event();
						event.setName(name);
						event.setDetail(details);
						event.setOwnerName(ownerName);
						event.setTypeId(typeId);
						eventList.add(event);
						break;
					} else {
						System.out.println("custom message");
					}

				} catch (EventTypeDoesNotExistsException ex) {
					System.out.println(ex);
					System.out.println("\nEnter the correct event type id:");
					typeId = sc.nextLong();
					sc.nextLine();
				}

			} while (true);
		}

		System.out.println("\nThe events entered are:\n");
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Details", "Owner name", "Eventtypeid");
		for (Event ev : eventList)
			System.out.println(ev);
		sc.close();
	}
}
