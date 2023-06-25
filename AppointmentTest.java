import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class AppointmentTest {

	@Test
	void appointmentTest() {
		java.util.Date date = new java.util.Date();
		Appointment test = new Appointment("000000001", date, "Test decsription");

		assertTrue(test.getID().equals("000000001"));
		assertTrue(test.getDate().equals(date));
		assertTrue(test.getDescr().equals("Test description"));
	}

	@Test
	void testIDLength() {
		java.util.Date date = new java.util.Date();
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", date, "Test description");
		});
	}

	@Test
	void testDateField() {
		java.util.Date pastDate = new java.util.Date(2022, 1, 1);
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", pastDate, "Test description");
		});
	}

	@Test
	void testDescriptionField() {
		java.util.Date date = new java.util.Date();
		String apptDescr = "this is a test description that is too long and results in an exception";

		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, apptDescr);
		});
	}

	@Test
	void testNullID() {
		java.util.Date date = new java.util.Date();

		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date, "Test description");
		});
	}

	@Test
	void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", null, "Test Description");
		});
	}

	@Test
	void testNullDescr() {
		java.util.Date date = new java.util.Date();

		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, null);
		});
	}
}
