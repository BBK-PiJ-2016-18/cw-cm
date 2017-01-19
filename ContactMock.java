public class ContactMock {    /**
     * Returns the ID of the contact.
     *
     * @return the ID of the contact.
     */
    public int getId() {
		return 0;
	}

    /**
     * Returns the name of the contact.
     *
     * @return the name of the contact.
     */
    String getName() {
		return "John"
	}

    /**
     * Returns our notes about the contact, if any.
     *
     * If we have not written anything about the contact, the empty string is returned.
     *
     * @return a string with notes about the contact, maybe empty.
     */
    String getNotes() {
		return "Here are some notes"
	}

}