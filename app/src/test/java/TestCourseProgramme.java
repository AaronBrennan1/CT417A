import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.joda.time.DateTime;
public class TestCourseProgramme {
   
    
    
    @Test void testModuldeInfo() {
        CourseProgramme course = new CourseProgramme("Chemistry", DateTime.parse("1987-06-03"), DateTime.parse("2022-09-10"));
        Lecturer lecturer1 = new Lecturer("Steve Jobs", DateTime.parse("1955-04-12"), 57463287);
        Lecturer lecturer2 = new Lecturer("Mark Zuckerburg", DateTime.parse("2006-05-2"), 48393023);
        Lecturer lecturer3 = new Lecturer("Bill Gates", DateTime.parse("1987-06-19"), 67239912);
        Module module1 = new Module("Rings", "MA417", lecturer1);
        Module module2 = new Module("Measure Theory", "MA420", lecturer2);
        Module module3 = new Module("Groups", "MA319", lecturer3);
        Student student1 = new Student("Joshua Cheptegei", DateTime.parse("1955-04-12"), 57683746);
        Student student2 = new Student("Eluid Kipchoge", DateTime.parse("1987-06-19"), 17502967);
        course.addModule(module1);
        course.addModule(module2);
        course.addModule(module3);
        course.addStudent(student1);
        course.addStudent(student2);
		try {

            assertEquals(course.getName(), "Chemistry");
			assertEquals(course.getModules().size(), 3);
            assertEquals(course.getModules().get(2).getName(), "Groups");
            assertEquals(course.getStudents().size(), 2);
            assertEquals(course.getStudents().get(1).getName(), "Eluid Kipchoge");
            
            
		} catch(Exception e) {
			assertTrue(false);
		}
	}
}
