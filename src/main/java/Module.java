/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niall Murphy
 */
import java.util.ArrayList;
public class Module {
    private String moduleName;
    private String moduleId;
    private String courses;
    private ArrayList<Student> moduleStudents=new ArrayList<Student>();
    
    public Module(String name,String id,String courses){
        moduleName=name;
        moduleId=id;
        this.courses=courses;
    }
    //getters
    public String getModuleName(){
        return moduleName;
    }
    
    public String getModuleID(){
        return moduleId;
    }
    //add student to module
    public void addStudent(Student stu){
        moduleStudents.add(stu);
    }
    //get array
    public ArrayList getStudents(){
        return moduleStudents;
    }
    
    @Override
    public String toString(){
        return "*****\n Module Name: "+moduleName+"\nModule ID: "+moduleId+"\n*****";
    }
    
}
