package nuigalway.app;

import java.util.ArrayList;

/**
 * Module class
 * 	Name and ID are set when instance is created, module name and ID are immutable, so no setter methods provided.
 * addCourse and addStudent allow Course and Student objects to be added to their respective arraylist,
 * so a record of what course and students attend the module are kept.
 * getter methods for all fields created
 */


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
