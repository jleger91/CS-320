/**********************
 * CS320 project One *

 * by Justin Leger    *
 * February 15th 2025  *
 **********************/

package pkg;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	ContactService serv = new ContactService();
	String uniqueId = serv.createUniqueId();
	Contact contact = new Contact(uniqueId, "Jerry", "James",
			"5086678897", "110 something way");
	
	
	//test to add record
	@Test
	void addContactPass() {
		serv.addContact(contact);
		
		assertTrue(serv.contacts.getFirst().getId().equals(uniqueId));
		assertTrue(serv.contacts.getFirst().getFirstName().equals("Jerry"));
		assertTrue(serv.contacts.getFirst().getLastName().equals("James"));
		assertTrue(serv.contacts.getFirst().getPhone().equals("5086678897"));
		assertTrue(serv.contacts.getFirst().getAddress().equals("110 something way"));
	}
	
	//test where record already exists
	@Test
	void addContactFail() {
		serv.addContact(contact);
		
		assertFalse(serv.contacts.getFirst().getId().equals(uniqueId+"1"));
		assertFalse(serv.contacts.getFirst().getFirstName().equals("Jenkins"));
		assertFalse(serv.contacts.getFirst().getLastName().equals("Janet"));
		assertFalse(serv.contacts.getFirst().getPhone().equals("5086678896"));
		assertFalse(serv.contacts.getFirst().getAddress().equals("111 something way"));
	}

	
	@Test
	void testRemoveContactPass() {
		//add contact to remove
		serv.addContact(contact);
		
		assertTrue(serv.removeContact(uniqueId));
	}
	
	@Test
	void testRemoveContactFail() {
		//no contact to remove
		
		assertFalse(serv.removeContact(uniqueId));
	}
	
	@Test 
	void testEditContact(){
		serv.addContact(contact);
		
		serv.editContact(0, uniqueId, "Lebron", "James", "7743388276", 
				"111 something way");
		
		assertTrue(serv.contacts.getFirst().getId().equals(uniqueId));
		assertTrue(serv.contacts.getFirst().getFirstName().equals("Lebron"));
		assertTrue(serv.contacts.getFirst().getLastName().equals("James"));
		assertTrue(serv.contacts.getFirst().getPhone().equals("7743388276"));
		assertTrue(serv.contacts.getFirst().getAddress().equals("111 something way"));
	}

}
