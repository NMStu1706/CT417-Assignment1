/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niall Murphy
 */
public class Student {
    private String name;
    private String courses;
    private String modules;
    private String username;
    private int age;
    private double id;
    
    public Student(String name, int age,String courses,String modules){
        this.name=name;
        this.age=age;
        this.courses=courses;
        this.modules=modules;
        id = (999999)*Math.random();
        getUsername();
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getCourses(){
        return courses;
    }
    
    public String getModules(){
        return modules;
    }
    
    public String getUsername(){
        username=name+age;
        return username;
    }
}
