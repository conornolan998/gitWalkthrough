package nuigalway.app;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String DOB;
    private long ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;


    public Student(String name, int age, String DOB, long ID)
    {
     this.name = name;
     this.age = age;
     this.DOB =DOB;
     this.ID = ID;
     courses = new ArrayList<Course>();
     modules = new ArrayList<Module>();
    }


    public String getUsername()
    {
    username =  name+age;
    return username;
    }

    public String getName()
    {
        return name;
    }

    public long getID()
    {
        return ID;
    }

    public int getAge()
    {
        return age;
    }

    public String getDOB()
    {
        return DOB;
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public ArrayList<Course> getCourse()
    {
        return courses;
    }

    public void addModule(Module mod)
    {
        modules.add(mod);
    }

    public ArrayList<Module> getModules()
    {
        return modules;
    }


}
