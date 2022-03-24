package addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
	Scanner sc = new Scanner(System.in);
	PersonInformation person = new PersonInformation();
	List<PersonInformation> contactDetailsList = new ArrayList<>();

	public void addContact() {
		System.out.println("Enter Number of contacts to be added");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contact details of person");
			writeContact();
		}
	}
	
	public void writeContact() {
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State : ");
		String state = sc.next();
		System.out.println("Enter ZipCode : ");
		String zipCode = sc.next();
		System.out.println("Enter Mobile Number : ");
		String mobileNumber = sc.next();
		System.out.println("Enter EmailId : ");
		String emailId = sc.next();
		person = new PersonInformation(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		contactDetailsList.add(person);
	}
	
	public void editContact() {
		System.out.println("Enter the first name of person to edit contact");
		String editName = sc.next();
		boolean edited = false;
		
		for (int i = 0; i < contactDetailsList.size(); i++) {
			String name = contactDetailsList.get(i).getFirstName();
			if (name.equalsIgnoreCase(editName)) {
				contactDetailsList.remove(person);
				writeContact();
				edited = true;
				break;
			}
		}
		
		if (!edited) {
			System.out.println("enter name is incorrect");
		}
	}
	
	public void deleteContact() {
		System.out.println("Enter the first name of person to delete contact");
		String deleteName = sc.next();

		int i = 0;
		for ( ; i < contactDetailsList.size(); i++) {
			String name = contactDetailsList.get(i).getFirstName();
			if (name.equalsIgnoreCase(deleteName)) {
				break;
			}
		}
		if (i < contactDetailsList.size()) {
			contactDetailsList.remove(i);
			System.out.println("Contact Deleted");
		}
		else {
			System.out.println("Contact not find");
		}
	}
}
