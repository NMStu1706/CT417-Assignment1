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
    private LocalDate start;
    private LocalDate end;
    private String courseName;
    private ArrayList<Student> courseStudents=new ArrayList<Student>();
    private ArrayList<Module> courseModules=new ArrayList<Module>();
    
    
    public CourseProgramme(LocalDate start,LocalDate end, String courseName){
        this.start=start;
        this.end=end;
        this.courseName=courseName;
    }
    //getters
    private String getCourseName(){
        return courseName;
    }
    
    private LocalDate getStart(){
        return start;
    }
    
    private LocalDate getEnd(){
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
