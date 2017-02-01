import java.util.Calendar;
import java.util.List;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

public class ContactManagerTest {
	
	private ContactManagerImpl testManager;
	
	//setup
	@Before
	public void setUp() {
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
	public void testsAddFutureMeetingID() {
		SetMock contacts = new SetMock();
		CalendarMock calendar = new CalendarMock();
		testManager.addFutureMeeting(contacts, calendar);
		SetMock contacts2 = new SetMock();
		CalendarMock calendar2 = new CalendarMock();
		testManager.addFutureMeeting(contacts2, calendar2);
		SetMock contacts3 = new SetMock();
		CalendarMock calendar3 = new CalendarMock();
		testManager.addFutureMeeting(contacts3, calendar3);
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