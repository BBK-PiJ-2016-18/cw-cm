/**
 * A contact is a person we are making business with or may do in the future.
 *
 * Contacts have an ID (unique, a non-zero positive integer),  a name (not necessarily unique), and notes that the user  may want to save about them.
 */
public class ContactImpl implements Contact {
	
	private int id;
	private String name;
	private String notes;
	
	/**
	Constructor with all three parameters
	*/
	public ContactImpl(int id, String name, String notes) {
		this.id = id;
		this.name = name;
		this.notes = notes;
	}
	
	/**
	Constructor with two parameters
	*/
	public ContactImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
    /**
     * Returns the ID of the contact.
     *
     * @return the ID of the contact.
     */
    public int getId() {
		return this.id;
	}

    /**
     * Returns the name of the contact.
     *
     * @return the name of the contact.
     */
    public String getName() {
		return this.name;
	}

    /**
     * Returns our notes about the contact, if any.
     *
     * If we have not written anything about the contact, the empty string is returned.
     *
     * @return a string with notes about the contact, maybe empty.
     */
    public String getNotes() {
		return this.notes;
	}

    /**
     * Add notes about the contact.
     *
     * @param note the notes to be added
     */
    public void addNotes(String note) {
		this.notes = notes + note;
	}
}
