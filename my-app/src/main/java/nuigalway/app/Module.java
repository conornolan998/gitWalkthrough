package nuigalway.app;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String moduleName, String moduleID)
    {
     this.moduleName = moduleName;
     this.moduleID = moduleID;
     students = new ArrayList<Student>();
     courses = new ArrayList<Course>();
    }

    public String getModuleName()
    {
        return moduleName;
    }

    public String getModuleID()
    {
        return moduleID;
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }


    public void addCourse(Course course)
    {
        courses.add(course);
    }


    public void addStudent(Student student)
    {
        students.add(student);
    }
}
