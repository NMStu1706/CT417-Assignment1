/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
import org.joda.time.*;
import java.util.ArrayList;
public class CourseProgramme {
    private DateTime start;
    private int countM=0;
    private int countS=0;
    private DateTime end;
    private String courseName;
    private String modNames;
    private String studentNames;
    private ArrayList<Student> courseStudents=new ArrayList<Student>();
    private ArrayList<Module> courseModules=new ArrayList<Module>();
    
    
    public CourseProgramme(DateTime start,DateTime end, String courseName){
        this.start=start;
        this.end=end;
        this.courseName=courseName;
    }
    //getters
    public String getCourseName(){
        return courseName;
    }
    
    public DateTime getStart(){
        return start;
    }
    
    public DateTime getEnd(){
        return end;
    }
    //append to arrays
    public void addModule(Module m){
        courseModules.add(m);
        countM++;
    }
    
    public void addStudent(Student s){
        courseStudents.add(s);
        countS++;
    }
    //get arrays
    public ArrayList getModules(){
        return courseModules;
    }
    
    public void getModNames(){
        int x;
        for(x=0;x<countM;x++){
            Module m = courseModules.get(x);
            modNames=modNames+"\n"+m.getModuleName();
        }
    }
    public void getStudNames(){
        int x;
        for(x=0;x<countS;x++){
            Student s = courseStudents.get(x);
            studentNames=studentNames+"\n"+s.getName();
        }
    }
    public ArrayList getStudents(){
        return courseStudents;
    }
    //create new toString for output
    @Override
    public String toString(){
        getModNames();
        getStudNames();
        String output = "*****\nCourse Name: "+courseName+"\nModules in Course:\n"+modNames+"\n*****\n"
                + "Contains students:\n"+studentNames;
        return output;
    }
    
}
