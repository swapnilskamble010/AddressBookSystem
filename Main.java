package addressbooksystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter \n1. To Add the Contact \n2. To Edit the Contact"
					+ " \n3. To Delete the Contact\4. To Display the Contacts\n0. To exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				contact.addContact();
				break;
				
			case 2:
				contact.editContact();
				break;
				
			case 3:
				contact.deleteContact();
				break;
				
			case 4:
				contact.displayContact();
				break;
				
			case 0:
				System.out.println("Exit");
				flag = false;
				break;
				
			default:
				System.out.println("Invalid input");
				continue;
			}
		}
		sc.close();
	}
	
}
