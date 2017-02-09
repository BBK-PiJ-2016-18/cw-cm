import org.junit.*;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;

public class PastMeetingTest {
	// setup
	@Before
	public void setUp() {
		GregorianCalendar date = new GregorianCalendar(2017, 2, 9);
		String notes = "Some notes";
		SetMock contacts = new SetMock();
	}
	
	//test	
	@Test
	public void TestsConstructor() {
		GregorianCalendar date = new GregorianCalendar(2017, 2, 9);
		String notes = "Some notes";
		SetMock contacts = new SetMock();
		PastMeetingImpl pastMeeting = new PastMeetingImpl(55, date, contacts, notes);
	}
}