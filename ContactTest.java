import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {
	
	private Contact contact;
	
	// setup
	@Before
	public void setUp() {
		Contact contact = new ContactImpl(33, "John Smith", "some notes");
	}
	
	//test
	@Test
	public void testsConstructor() {
		ContactImpl testContact = new ContactImpl(12, "Joe Bloggs", "He's just a test");
		assertEquals(testContact.getId(), 12);
		assertEquals(testContact.getName(), "Joe Bloggs");
		assertEquals(testContact.getNotes(), "He's just a test");
		
		ContactImpl testContact2 = new ContactImpl(18, "Jane Bloggs");
		assertEquals(testContact2.getId(), 18);
		assertEquals(testContact2.getName(), "Jane Bloggs");
	}
	
	@Test
	public void testsGetter() {
		Contact contact = new ContactImpl(33, "John Smith", "some notes");
		int id = contact.getId();
		assertEquals(id, 33);
		String name = contact.getName();
		String notes = contact.getNotes();
		assertEquals(name, "John Smith");
		assertEquals(notes, "some notes");
	}
}