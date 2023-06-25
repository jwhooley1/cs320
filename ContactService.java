

import java.util.ArrayList;

public class ContactService {
	static ArrayList<Contact> contacts = new ArrayList<Contact>(0);
	
	public static Contact addContact(String ID, String firstName, String lastName, String phoneNumber, String address) throws Exception {
		Contact contact = new Contact(ID, firstName, lastName, phoneNumber, address);
		return contact;
	}
	
	public static void deleteContact(String ID) {
		for (int i = 0; i<contacts.size(); i++) {
			if (contacts.get(i).getID() == ID) {
				int position = i;
				contacts.remove(position);
			}
		}
	}

}
