import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

public class ContactManagerTest {
	
	private ContactManagerImpl testManager;
	private GregorianCalendar date;
	
	//setup
	@Before
	public void setUp() {
		date = new GregorianCalendar(2017, 2, 1);
		testManager = new ContactManagerImpl();
	}
	
	// test
	@Test
	public void testsMaxID() {
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 0);
	}
	
	@Test
	public void testsRepeatedAddID() {
		testManager.addID();
		testManager.addID();
		testManager.addID();
		testManager.addID();
		testManager.addID();
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 5);
	}
	
	@Test
	public void testsCalendar() {
		int year = date.get(Calendar.YEAR);
		int expected = 2017;
		assertEquals(year, expected);
	}
	
	@Test
	public void testsAddFutureMeetingID() {
		SetMock contacts = new SetMock();
		testManager.addFutureMeeting(contacts, date);
		SetMock contacts2 = new SetMock();
		testManager.addFutureMeeting(contacts2, date);
		SetMock contacts3 = new SetMock();
		testManager.addFutureMeeting(contacts3, date);
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 3);
	}
	
	@Test
	public void testsAddFutureMeetingException() {
		SetMock contacts = new SetMock();
		testManager.addFutureMeeting(contacts, null);
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 1);		
	}	
}