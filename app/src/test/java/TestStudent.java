
import org.junit.jupiter.api.Test;

//import Student;

import static org.junit.jupiter.api.Assertions.*;
//import java.time.LocalDate;

import org.joda.time.DateTime;
public class TestStudent {
    
    @Test void testUserInfo() {
		try {
			Student a = new Student("Leo Varadkar", DateTime.parse("1979-01-18"), 12345678);

			assertEquals(a.getName(), "Leo Varadkar");
			assertEquals(a.getDateOfBirth(), DateTime.parse("1979-01-18"));
			assertEquals(a.getId(), 12345678);
            assertEquals(a.getAge(), 43);
            
            // TESTING USERNAME
            assertEquals(a.getUsername(), "LeoVaradkar43");
			
		} catch(Exception e) {
			assertTrue(false);
		}
	}
}
