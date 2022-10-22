
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class Lecturer {
  private String name;
  private int age;
  private DateTime dateOfBirth;
  private long id;
  private ArrayList<Module> modules;

  public Lecturer(String name, DateTime dateOfBirth, long id)
  {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.id = id;

    age = new Period(dateOfBirth, DateTime.now(), PeriodType.yearMonthDay()).getYears();
    modules = new ArrayList<Module>();
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public DateTime getDateOfBirth()
  {
    return dateOfBirth;
  }

  public long getId()
  {
    return id;
  }

  public String getUsername()
  {
    return (name + String.valueOf(age)).replaceAll("\\s", "");
  }

  public ArrayList<Module> getModule()
  {
    return modules;
  }

  public void setName(String name) {
    this.name = name;
  } 

  public void setAge(int age) {
    this.age = age;
  }

  public void setDateOfBirth(DateTime dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }

  public void setId(long id) 
  {
    this.id = id;
  }

  public void setModules(ArrayList<Module> modules)
  {
    this.modules = modules;
  }

  public void addModule(Module module)
  {
    modules.add(module);
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
      "Lecturer: " + name + "\n" +
      "- ID: " + String.valueOf(id) + "\n" +
      "- Username: " + getUsername() + "\n" +
      "- Date of Birth: " + dateOfBirth.toLocalDate() + "\n" +
      "- Age: " + String.valueOf(age) + "\n" +
      "- Modules:\n" + moduleStr;
  }
}
