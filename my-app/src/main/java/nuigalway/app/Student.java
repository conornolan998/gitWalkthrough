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

    /**
     * Student class
     * 	Name, age, date of birth and ID are set when instance is created, for the purpose of the excerise,
     * 	we will provide setter methods for all of these, as students may have provided incorrect information when registering for the college,
     * 	and these information may need to be changed.
     * addCourse and addModule allow Course and Module objects to be added to their respective arraylist,
     * so a record of what course and modules attended by the student are kept.
     * getter methods for all fields created
     */


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

    public void setName(String name){this.name =name;}

    public long getID()
    {
        return ID;
    }

    public void setID(long ID){this.ID =ID;}

    public int getAge()
    {
        return age;
    }

    public void setAge(int age){this.age =age;}

    public String getDOB()
    {
        return DOB;
    }

    public void setDOB(String DOB){this.DOB =DOB;}

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
