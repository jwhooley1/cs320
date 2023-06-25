import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import ContactService;
import Contact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// test for unique ApptID
	@Test
	void testAddContact() {

		ContactService test = new ContactService();
		
		test.addContact("000000001", "First", "Last", "0000000000", "Test");
		
		assertThrows (IllegalArgumentException.class, ()->{
			test.addContact("000000001", "First", "Last", "0000000000", "Test");
		});
	}
	
	@Test
	void testRemoveContact() throws Exception {

		ContactService test = new ContactService();
		test.addContact("000000001", "First", "Last", "0000000000", "Test");
		
		
		test.deleteContact("000000001");
		
		ArrayList<Contact> empty = new ArrayList();
		
		assertEquals(test, empty, "Appointment was not deleted");
	}
}
	
	