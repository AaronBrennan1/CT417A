
import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
  private String name;
  private ArrayList<Module> modules;
  private ArrayList<Student> students;
  private DateTime startDate, endDate;

  public CourseProgramme(String name, DateTime startDate, DateTime endDate)
  {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;

    modules = new ArrayList<Module>();
    students = new ArrayList<Student>();
  }

  public String getName()
  {
    return name;
  }

  public ArrayList<Module> getModules()
  {
    return modules;
  }

  public ArrayList<Student> getStudents()
  {
    return students;
  }

  public DateTime getStartDate()
  {
    return startDate;
  }

  public DateTime getEndDate()
  {
    return endDate;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setStartDate(DateTime startDate)
  {
    this.startDate = startDate;
  }

  public void setEndDate(DateTime endDate)
  {
    this.endDate = endDate;
  }

  public void setModules(ArrayList<Module> modules)
  {
    this.modules = modules;
  }

  public void setStudents(ArrayList<Student> students)
  {
    this.students = students;
  }

  public void addModule(Module module)
  {
    modules.add(module);
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  @Override
  public String toString()
  {
    StringBuilder moduleStr = new StringBuilder();
    for (Module m : modules)
    {
      moduleStr.append("  " + m.getId() + " - " + m.getName() + "\n");
    }

    return
      "Course programme: " + name + "\n" + 
      "- Start date: " + startDate.toLocalDate() + "\n" +
      "- End date: " + endDate.toLocalDate() + "\n" +
      "- Modules:\n" + moduleStr;
  }
}


