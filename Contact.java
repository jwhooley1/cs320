

public class Contact {
	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(String ID, String firstName, String lastName, String phoneNumber, String address) throws Exception {
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("ID can't be longer than 10 characters or null");
		}
		if (firstName == null || firstName.length() > 0) {
			throw new IllegalArgumentException("First name can't be longer than 10 characters or null");
		}
		if (lastName == null || lastName.length() > 0) {
			throw new IllegalArgumentException("Last name can't be longer than 10 characters or null");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone number must be exactly 10 characters");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must not be greater than 30 characters or null");
		}
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) throws Exception {
		if (firstName == null || firstName.length() > 0) {
			throw new IllegalArgumentException("First name can't be longer than 10 characters or null");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) throws Exception{
		if (lastName == null || lastName.length() > 0) {
			throw new IllegalArgumentException("Last name can't be longer than 10 characters or null");
		}
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) throws Exception{
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone number must be exactly 10 characters");
		}
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) throws Exception{
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must not be greater than 30 characters or null");
		}
		this.address = address;
	}
	
}