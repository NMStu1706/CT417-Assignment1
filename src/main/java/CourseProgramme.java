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
    private DateTime end;
    private String courseName;
    private ArrayList<Student> courseStudents=new ArrayList<Student>();
    private ArrayList<Module> courseModules=new ArrayList<Module>();
    
    
    public CourseProgramme(DateTime start,DateTime end, String courseName){
        this.start=start;
        this.end=end;
        this.courseName=courseName;
    }
    //getters
    private String getCourseName(){
        return courseName;
    }
    
    private DateTime getStart(){
        return start;
    }
    
    private DateTime getEnd(){
        return end;
    }
    //append to arrays
    private void addModule(Module m){
        courseModules.add(m);
    }
    
    private void addStudent(Student s){
        courseStudents.add(s);
    }
    //get arrays
    private ArrayList getModules(){
        return courseModules;
    }
    
    private ArrayList getStudents(){
        return courseStudents;
    }
    
}
