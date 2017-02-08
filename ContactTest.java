import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {
	//setup
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
}