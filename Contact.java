package addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
	Scanner sc = new Scanner(System.in);
	PersonInformation person = new PersonInformation();
	List<PersonInformation> contactList = new ArrayList<>();

	public void addContact() {
		System.out.println("Enter Number of contacts to be added");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contact details of person");
			createContact();
		}
	}
	
	public void createContact() {
		boolean found = false;
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		
		for(int j = 0; j < contactList.size(); j++) {
			List<String> names = contactList.stream().map(PersonInformation::getFirstName).toList();
			for(int k =0; k < names.size(); k++) {
				if(names.get(j).equalsIgnoreCase(firstName)) {
					found = true;
					break;
				}
			}
		}
		
		if(found == true) {
			System.out.println("Entered contact is already present");
		}
		else {
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
			contactList.add(person);
		}
	}
	
	public void editContact() {
		System.out.println("Enter the first name of person to edit contact");
		String editName = sc.next();
		boolean edited = false;
		
		for (int i = 0; i < contactList.size(); i++) {
			String name = contactList.get(i).getFirstName();
			if (name.equalsIgnoreCase(editName)) {
				contactList.remove(person);
				createContact();
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
		for ( ; i < contactList.size(); i++) {
			String name = contactList.get(i).getFirstName();
			if (name.equalsIgnoreCase(deleteName)) {
				break;
			}
		}
		if (i < contactList.size()) {
			contactList.remove(i);
			System.out.println("Contact Deleted");
		}
		else {
			System.out.println("Contact not find");
		}
	}
}
