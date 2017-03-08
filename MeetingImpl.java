import java.util.GregorianCalendar;
import java.util.Set;
/**
 * A class to represent meetings
 *
 * Meetings have unique IDs, scheduled date and a list of participating contacts
 */
public abstract class MeetingImpl implements Meeting { 
	private int id;
	private GregorianCalendar date;
	private Set<Contact> contacts; 
	
	public MeetingImpl(int id, GregorianCalendar date, Set<Contact> contacts) { 
		this.id = id;
		this.date = date;
		this.contacts = contacts;
	}
	
    /**
     * Returns the id of the meeting.
     *
     * @return the id of the meeting.
     */
    public int getId() {
		return this.id;
	}

    /**
     * Return the date of the meeting.
     *
     * @return the date of the meeting.
     */
    public GregorianCalendar getDate() {
		return this.date;
	}

    /**
     * Return the details of people that attended the meeting.
     *
     * The list contains a minimum of one contact (if there were
     * just two people: the user and the contact) and may contain an
     * arbitrary number of them.
     *
     * @return the details of people that attended the meeting.
     */
    public Set<Contact> getContacts() { 
		return this.contacts;
	}
}
