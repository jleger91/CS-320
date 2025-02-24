/**********************
 * CS320 project One *

 * by Justin Leger    *
 * February 15th 2025  *
 **********************/

package pkg;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {
	
	Contact con = new Contact("123456789", "John", "Doe",
				"5088675309", "107 something way");
	
	//test that constructor works
	@Test
	void testEqualsId() {
		assertTrue(con.getId().equals("123456789"));
	}
	@Test
	void testEqualsFirstName() {	
		assertTrue(con.getFirstName().equals("John"));
	}
	@Test
	void testEqualsLastName() {
		assertTrue(con.getLastName().equals("Doe"));
	}
	@Test
	void testEqualsPhone() {
		assertTrue(con.getPhone().equals("5088675309"));
	}
	@Test
	void testEqualsAddress() {
		assertTrue(con.getAddress().equals("107 something way"));
	}
	//end constructor tests
	
	//test that attributes can be set
	@Test
	void testSetId() {
		con.setId("987654321");
		assertTrue(con.getId().equals("987654321"));
	}
	@Test
	void testSetFirstName() {
		con.setFirstName("Patrick");
		assertTrue(con.getFirstName().equals("Patrick"));
	}
	@Test
	void testSetLastName() {
		con.setLastName("Fitzpatrik");
		assertTrue(con.getLastName().equals("Fitzpatrik"));
	}
	@Test
	void testSetPhone() {
		con.setPhone("7743015678");
		assertTrue(con.getPhone().equals("7743015678"));
	}
	@Test
	void testSetAddress() {
		con.setAddress("108 something way");
		assertTrue(con.getAddress().equals("108 something way"));
	}
	//end set attributes
	
	//test for IllegalArgumentException for attributes being too long
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789101112", "John", "Doe",
					"5088675309", "107 something way");
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "JohnJacobson", "Doe",
					"5088675309", "107 something way");
		});
	}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "John", "BuzzLightyearToTheRescue",
					"5088675309", "107 something way");
		});
	}
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "John", "Doe",
					"508867530924", "107 something way");
		});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "John", "Doe",
					"5088675309", "107 something something something way");
		});
	}
	//end attributes too long
	
	
	//test that attributes null
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe",
					"5088675309", "107 something way");
		});
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", null, "Doe",
					"5088675309", "107 something way");
		});
	}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "John", null,
					"5088675309", "107 something way");
		});
	}
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789101112", "John", "Doe",
					null, "107 something way");
		});
	}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789101112", "John", "Doe",
					"5088675309", null);
		});
	}
	//end attributes null
}
