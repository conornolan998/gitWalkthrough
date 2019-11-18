package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Student conor;
    private Student alan;
    private Student mark;
    private Course bct;
    private Course bis;
    private Course cpl;
    private Module BS222;
    private Module CT417;
    private Module CT421;
    private Module CT4101;
    private Module BS111;
    private Module CP1001;

    public void setUpTest1()
    {
        //create a course
         bct = new Course("BCT",new DateTime(2016, 9, 1, 0, 0),new DateTime(2020, 5, 31, 23, 59));

        //create three modules associated with BCT course
         CT417 = new Module("Software Engineering III", "CT417");
         CT421 = new Module("Artifical Intelligence", "CT421");
         CT4101 = new Module("Machine Learning", "CT4101");

        bct.addModule(CT417);   //add each module to the BCT course
        bct.addModule(CT421);
        bct.addModule(CT4101);
        //create a student
        conor = new Student("conor",21, "03/07/1998",16307046);
        bct.addStudent(conor);  //"enroll" student in course
        conor.addCourse(bct);  //add course to student object
        conor.addModule(CT417);
        conor.addModule(CT421);
        conor.addModule(CT4101);
        CT417.addCourse(bct);
        CT417.addStudent(conor);
        CT421.addCourse(bct);
        CT421.addStudent(conor);
        CT4101.addCourse(bct);
        CT4101.addStudent(conor);

    }


    @Test
    public void test1StudentUsername() //test getUsername method in student
    {
        setUpTest1();
        assertEquals("conor21",conor.getUsername() );
    }

    @Test
    public void test1StudentInfo()
    {
        setUpTest1();
        assertEquals("03/07/1998", conor.getDOB() );  //assert the DOB equals specificed DOB
        assertEquals(16307046, conor.getID()); //assert ID equal to specified ID
        String cName = (String) conor.getCourse().get(0).getCourseName(); //get name of course conor enrolled in and convert to string (only enrolled in one course)
        assertEquals(bct.getCourseName(), cName);  //check course names are the same
    }


    @Test
    public void test1CourseModulesList()  //test if bct module IDs are equal to those specified in set up
    {
        setUpTest1();
        ArrayList<Module> tempModules = (bct.getModules());  //get modules from Course instance
        Module m1 = tempModules.get(0);  //get first module
        Module m2 = tempModules.get(1);  //get second module
        Module m3 = tempModules.get(2);  //get third module
        String mod1 = m1.getModuleID();  //get ID of first module
        String mod2 = m2.getModuleID();  //get ID of second module
        String mod3 = m3.getModuleID();  //get ID of third module
        assertTrue(tempModules.size() == 3); //ensure the number of Modules is equal to the number created in the set up, 3
        String modList = mod1+", "+mod2+", "+mod3;  //create a string that is the list of the three moduleIDs
        String tempModuleIDList = "CT417, CT421, CT4101"; //create a string with the three Module IDs we created in the set up
        assertEquals(tempModuleIDList,modList );  //assert the IDs are equal
    }

    @Test
    public void test1CourseInfo() //tests name and start date of course
    {
        setUpTest1();
        assertEquals("BCT", bct.getCourseName());
        assertEquals("2016-09-01T00:00:00.000+01:00",bct.getStartTime().toString()); //assert specified start time is equal to returned start time.
        assertEquals("2020-05-31T23:59:00.000+01:00",bct.getEndTime().toString()); //assert specified end time is equal to returned end time.
    }

    public void setUpTest2()
    {
        //create a course
        bis = new Course("Business Information Systems",new DateTime(2015, 9, 1, 0, 0),new DateTime(2019, 5, 31, 23, 59));
        //create three modules associated with BCT course
        BS222 = new Module("Business and Law", "BS222");
        BS111 = new Module("Info Systems 101", "BS111");

        bis.addModule(BS222);   //add each module to the BIS course
        bis.addModule(BS111);


        cpl = new Course("Corporate Law",new DateTime(2018, 9, 1, 0, 0),new DateTime(2022, 5, 31, 23, 59));

        //create three modules associated with BCT course
        CP1001 = new Module("Constitutional Law", "CP1001");


        cpl.addModule(BS222);   //add BS222 module to corp law course, both course attend this module
        bis.addModule(CP1001);  //add corp law module to course
        //create a student
        alan = new Student("Alan",20, "05/02/1999",16207444);
        mark = new Student("Mark",22, "07/06/1997",15207664);
        bis.addStudent(alan);  //"enroll" student in course
        alan.addCourse(bis);  //add course to student object
        cpl.addStudent(mark); //"enroll" student in course
        mark.addCourse(cpl);  //add course to student object
        alan.addModule(BS222);  //add course modules to student
        alan.addModule(BS111);
        mark.addModule(CP1001);
        mark.addModule(BS222);
        CP1001.addCourse(cpl);
        BS222.addCourse(cpl);
        BS111.addCourse(bis);
        BS222.addCourse(bis);
        CP1001.addStudent(mark);
        BS111.addStudent(alan);
        BS222.addStudent(mark);
        BS222.addStudent(alan);

    }

    @Test
    public void test2bothStudentsRegisteredForModuleBS222() //test both students attend shared module BS222
    {
        setUpTest2();
        ArrayList<Student> studentsInBS222 = BS222.getStudents();
        assertTrue(studentsInBS222.size() ==2);  //ensure there are only two students in module, as specified
        String listOfStudents = studentsInBS222.get(0).getName()+", "+studentsInBS222.get(1).getName();
        assertEquals("Mark, Alan",listOfStudents);
    }

}
