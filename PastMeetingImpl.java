/**
 * A meeting that was held in the past.
 *
 * It includes your notes about what happened and what was agreed.
 */
public class PastMeeting implements MeetingImpl {
	private int id;
	private GregorianCalendar dates;
	private SetMock contacts;
	private String notes;
	
	public PastMeetingImpl(int id, GregorianCalendar date, SetMock contacts, String notes) {
		this.notes = notes;
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
    String getNotes() {
		return this.notes;
	}
}
