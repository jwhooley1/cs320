import static org.junit.jupiter.api.Assertions.*;
import Contact;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void contactTest() throws Exception {
		Contact test = new Contact("0123456789", "First", "Last", "0000000000", "100 Main");

		assertTrue(test.getID().equals("0123456789"));
		assertTrue(test.getFirstName().equals("First"));
		assertTrue(test.getLastName().equals("Last"));
		assertTrue(test.getPhoneNumber().equals("0000000000"));
		assertTrue(test.getAddress().equals("100 Main"));
	}

	@Test
	void testIDLength() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "First", "Last", "0000000000", "100 Main");
		});
	}

	@Test
	void testFirstName() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "FirstNameHere", "Last", "00000000000", "100 Main");
		});
	}

	@Test
	void testLastName() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "First", "LastNameTooLong", "0000000000", "100 Main");
		});
	}
	
	@Test
	void testPhoneNumber() {
		 
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "FirstNameHere", "Last", "0000000000", "100 Main");
		});
	}
		
	@Test
	void testAddress() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "FirstNameHere", "Last", "00000000000", "This is not an address but a long string to test");
		});
	}
		

	@Test
	void testNullID() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "FirstNameHere", "Last", "00000000000", "100 Main");
		});
	}

	@Test
	void testNullFirst() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", null, "Last", "00000000000", "100 Main");
		});
	}

	@Test
	void testNullLast() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "FirstNameHere", null, "00000000000", "100 Main");
		});
	}
	
	@Test
	void testNullPhoneNumber() {
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "FirstNameHere", "Last", null, "100 Main");
		});
	}
	
	@Test
	void testNullAddress() {
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "FirstNameHere", "Last", "00000000000", null);
		});
	}
	
}