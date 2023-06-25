import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import TaskService;
import Task;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testAddTask() {

		TaskService test = new TaskService();
		
		test.addTask("000000001", "name", "Test");
		
		assertThrows (IllegalArgumentException.class, ()->{
			test.addTask("000000001", "name", "Test description");
		});
	}
	
	@Test
	void testRemoveAppointment() {

		TaskService test = new TaskService();
		
		test.addTask("id", "name", "description");
		
		
		test.deleteTask("id");
		
		ArrayList<Task> empty = new ArrayList();
		
		assertEquals(test.tasks, empty, "Appointment was not deleted");
	}

}
