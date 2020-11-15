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
    private ArrayList<Student> moduleStudents=new ArrayList<Student>();
    
    public Module(String name,String id){
        moduleName=name;
        moduleId=id;
    }
    
    public String getModuleName(){
        return moduleName;
    }
    
    public String getModuleID(){
        return moduleId;
    }
    
    public void addStudent(Student stu){
        moduleStudents.add(stu);
    }
    
    public ArrayList getStudents(){
        return moduleStudents;
    }
    
}
