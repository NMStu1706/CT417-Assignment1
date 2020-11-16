/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User1
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
 /**   @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        String expResult = "John Jacobs";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAge method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        int expResult = 20;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        String expResult = "ECE";
        String result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getModules method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        String expResult = "CT-417";
        String result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        String expResult = "John Jacobs20";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("John Jacobs",20,"ECE","CT-417");
        String expResult = "*****\nStudent Name: John Jacobs\nUsername: John Jacobs20\n*****";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
