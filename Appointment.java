
import java.util.Date;

public class Appointment {
	
	private String apptID;
	private Date apptDate;
	private String apptDescr;
	
	public Appointment(String apptID, Date apptDate, String apptDescr) {
		
		if (apptID.length() > 10 || apptID == null) {
			throw new IllegalArgumentException("ID cannot be longer than 10 characters or null");
		}
		
		if (apptDate.before(new Date()) || apptDate == null) {
			throw new IllegalArgumentException("Date cannot be in the past or null");
		}
		
		if (apptDescr.length() > 50 || apptDescr == null) {
			throw new IllegalArgumentException("Description cannot be longer than 50 characters or null");
		}
		
		this.apptID = apptID;
		this.apptDate = apptDate;
		this.apptDescr = apptDescr;
		
	}
	
	public String getID() {
		return apptID;
	}
	
	public Date getDate() {
		return apptDate;
	}
	
	public String getDescr() {
		return apptDescr;
	}
	
	public void setDate(Date apptDate) {
		if (apptDate.before(new Date()) || apptDate == null) {
			throw new IllegalArgumentException("Date cannot be in the past or null");
		}
		this.apptDate = apptDate;
	}
	
	public void setDescr(String apptDescr) {
		if (apptDescr.length() > 50 || apptDescr == null) {
			throw new IllegalArgumentException("Description cannot be longer than 50 characters or null");
		}
		this.apptDescr = apptDescr;
	}
	
}
