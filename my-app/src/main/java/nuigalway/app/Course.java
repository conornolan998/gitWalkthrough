package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;


/**
 * Course class
 * 	CourseName, StartTime and EndTime are set when instance is created, these are immutable, so no setter methods provided.
 * addModule and addStudent allow Module and Student objects  to be added to their respective arraylist,
 * so a record of what Modules provided by the course and Students attending the course are kept.
 * getter methods for all fields created
 */


public class Course {
    private String courseName;
    private ArrayList<Module>  modules;
    private ArrayList<Student> students;
    private DateTime startTime;
    private DateTime endTime;

    public Course(String courseName, DateTime startTime, DateTime endTime)
    {
    this.courseName = courseName;
    this.startTime = startTime;
    this.endTime = endTime;
    modules = new ArrayList<Module>();
    students = new ArrayList<Student>();

    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void addModule(Module module)
    {
        modules.add(module);
    }

    public String getCourseName()
    {
        return courseName;
    }

    public DateTime getStartTime()
    {
        return startTime;
    }

    public DateTime getEndTime()
    {
        return endTime;
    }

    public ArrayList<Module> getModules()
    {
        return modules;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }
}
