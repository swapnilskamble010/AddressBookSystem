package addressbooksystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter \n1. To add The contact \n2. To exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				contact.addContact();
				break;
				
			case 2:
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
