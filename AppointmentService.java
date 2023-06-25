

import java.util.Date;
import java.util.ArrayList;

public class AppointmentService {
	ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public void addAppointment(String apptID, Date apptDate, String apptDescr) {
		
		for (int i = 0; i < appointments.size(); i++) {
			if (appointments.get(i).getID() == apptID) {
				throw new IllegalArgumentException("appt id taken");
			}
		}
		
		Appointment appointment = new Appointment(apptID, apptDate, apptDescr);
		appointments.add(appointment);
	}
	
	public void removeAppointment(String apptID) {
		for (int i = 0; i < appointments.size(); i++) {
			if (appointments.get(i).getID() == apptID) {
				appointments.remove(appointments.get(i));
			}
		}
	}
	
}