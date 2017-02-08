public class ContactTest {
	//setup
	@Test
	public void testsConstructor() {
		testContact = new Contact(12, "Joe Bloggs", "He's just a test");
		int expectedID = 12;
		String expectedName = "Joe Bloggs";
		String expectedNote = "He's just a test";
		assertEquals(testContact.getId(), 12);
		assertEquals(testContact.getName(), "Joe Bloggs");
		assertEquals(testContact.getNotes(), "He's just a test");
	}
}