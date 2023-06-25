import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Task;

class TaskTest {

	@Test
	void appointmentTest() {
		
		Task test = new Task("id", "name", "decsription");

		assertTrue(test.getID().equals("id"));
		assertTrue(test.getName().equals("name"));
		assertTrue(test.getDescription().equals("description"));
	}
	
	@Test
	void testIDLength() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("abcdefghijk", "name", "description");
		});
	}
	
	@Test
	void testNameLength() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("id", "name is  far too long to be here", "description");
		});
	}
	
	@Test
	void testDescrLength() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("id", "name", "this desciprtion is far too long for this field an error will occur");
		});
	}
	
	@Test
	void testNullID() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "name", "Test description");
		});
	}
	
	@Test
	void testNullName() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Task("id", null, "description");
		});
	}
	
	@Test
	void testNullDescr() {
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Task("id", "name", null);
		});
	}
}
