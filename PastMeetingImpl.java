import java.util.Set;
import java.util.GregorianCalendar;
/**
 * A meeting that was held in the past.
 *
 * It includes your notes about what happened and what was agreed.
 */
public class PastMeetingImpl /*implements PastMeeting*/ {
	private int id;
	private GregorianCalendar date;
	private SetMock contacts;
	private String notes;	
	
	public PastMeetingImpl(int id, GregorianCalendar date, SetMock contacts, String notes) {
		this.id = id;
		this.date = date;
		this.contacts = contacts;		
		this.notes = notes;
	}
	
    /**
     * Returns the notes from the meeting.
     *
     * If there are no notes, the empty string is returned.
     *
     * @return the notes from the meeting.	
     */
    public String getNotes() {
		if (notes == null) {
			return "";
		}
		return this.notes;
	}
	
	public GregorianCalendar getDate() {
		return this.date;
	}
	
	public int getID() {
		return this.id;
	}
}
