/**********************
 * CS320 project One *

 * by Justin Leger    *
 * February 15th 2025  *
 **********************/

package pkg;
import java.util.ArrayList;

import java.util.Random;

public class ContactService{
	ArrayList<Contact> contacts = new ArrayList<>(); //Create an ArrayList
	
	String createUniqueId() {
		Random rand = new Random();
		long randomNumber = (long) (rand.nextDouble() * 1_000_000_0000L);
		String uniqueId = String.valueOf(randomNumber);
		return uniqueId;
	}
	
	/**************
	 * add object *
	 **************/
	
	void addContact(String id, String firstName, String lastName,
			String phone, String address) {
		Contact contact = new Contact(id, firstName, lastName,
				phone, address);
		contacts.add(contact); //add contact to list
	}
	void addContact(Contact contact) {
		contacts.add(contact); //add contact to list
	}
	//end add object
	
	

	
	
	//remove object
	boolean removeContact(String index) {
		for(Contact con : contacts) {
			if(con.getId().equals(index)) {
				contacts.remove(con);
				System.out.println("Contact removed");
				return true;
			}
		}
		System.out.println("No contact to remove");
		return false;
	}
	
	//edit object
	void editContact(int index, String id, String firstName, String lastName,
			String phone, String address) {
		System.out.println("Editing Contact\n");
		contacts.set(index, new Contact(id, firstName, lastName, phone, address));
	}
}
