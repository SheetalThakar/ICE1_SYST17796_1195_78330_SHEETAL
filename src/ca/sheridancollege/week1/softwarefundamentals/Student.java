/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author mehta date
 */
public class Student {

    /**
     * @return the Program
     */
    

    /**Model class student
     * Having name, ID 
     * @param args the command line arguments
     */
    private String name;
    private int ID;
    private String Program;
    private int maxCourse;

    public Student(String givenName, int givenID)
    {
        name=givenName;
        ID=givenID;
    }
    /**
     * @return the name
     */
    public String getProgram() {
        return Program;
    }

    /**
     * @param Program the Program to set
     */
    public void setProgram(String Program) {
        this.Program = Program;
    }
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param givenID the ID to set
     */
    public void setID(int givenID) {
        ID = givenID;
    }

    /**
     * @return the maxCourse
     */
    public int getMaxCourse() {
        return maxCourse;
    }

    /**
     * @param maxCourse the maxCourse to set
     */
    public void setMaxCourse(int maxCourse) {
        this.maxCourse = maxCourse;
    }
    
    
    
}
