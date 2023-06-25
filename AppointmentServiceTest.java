import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import AppointmentService;
import Appointment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	// test for unique ApptID
	@Test
	void testAddAppointment() {
		Date date = new Date();
		AppointmentService test = new AppointmentService();
		
		test.addAppointment("000000001", date, "Test");
		
		assertThrows (IllegalArgumentException.class, ()->{
			test.addAppointment("000000001", date, "Test description");
		});
	}
	
	@Test
	void testRemoveAppointment() {
		Date date = new Date();
		AppointmentService test = new AppointmentService();
		test.addAppointment("000000001", date, "Test");
		
		
		test.removeAppointment("000000001");
		
		ArrayList<Appointment> empty = new ArrayList();
		
		assertEquals(test.appointments, empty, "Appointment was not deleted");
	}
}