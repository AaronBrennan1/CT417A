

import java.util.ArrayList;

public class Module {
  private String name;
  private String id;
  private ArrayList<Student> students;
  private ArrayList<CourseProgramme> courseProgrammes;
  private Lecturer lecturer;

  public Module(String name, String id, Lecturer lecturer)
  {
    this.name = name;
    this.id = id;
    this.lecturer = lecturer;

    students = new ArrayList<Student>();
    courseProgrammes = new ArrayList<CourseProgramme>();
  }

  public String getName() 
  {
    return name;
  }

  public String getId()
  {
    return id;
  }

  public ArrayList<Student> getStudents()
  {
    return students;
  }

  public ArrayList<CourseProgramme> getCourseProgramme()
  {
    return courseProgrammes;
  }

  public Lecturer getLecturer()
  {
    return lecturer;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setLecturer(Lecturer lecturer)
  {
    this.lecturer = lecturer;
  }

  public void setCourses(ArrayList<CourseProgramme> courseProgrammes)
  {
    this.courseProgrammes = courseProgrammes;
  }

  public void setStudents(ArrayList<Student> students)
  {
    this.students = students;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public void addCourseProgramme(CourseProgramme courseProgramme)
  {
    courseProgrammes.add(courseProgramme);
  }

  @Override
  public String toString()
  {
    return 
      "Module: " + id + " " + name + "\n" +
      "Students: \n" + students.toString() + "\n" +
      "Course programmes: \n" + courseProgrammes.toString() + "\n" +
      "Lecturer: \n" + lecturer.toString() + "\n";
  }
}

