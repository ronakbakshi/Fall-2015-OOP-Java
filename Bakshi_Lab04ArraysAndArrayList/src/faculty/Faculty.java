/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

/**
 * stores information about a faculty
 * @author Ronak Bakshi
 */
public class Faculty {
    private String firstName;
    private String lastName;
    private double salary;
    private static int totalFaculty = 0;
    
    /**
     * 3 argument constructor
     * @param firstName -  string value
     * @param lastName -  string value
     * @param salary  -double value
     */
    public Faculty(String firstName,String lastName,double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        totalFaculty++;
    }
    
    /**
     * 2 argument constructor
     * @param firstName - string value
     * @param lastName - string value
     */
    public Faculty(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 0;
        totalFaculty++;
    }
    
    /**
     * no argument constructor
     */
    public Faculty()
    {
        
    }
    
    /**
     * to get the salary of faculty
     * @return salary of the faculty
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * to set the salary of the faculty
     * @param salary - double value
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    /**
     * to get the total number of faculty
     * @return int value
     */
    public int getTotalFaculty()
    {
        return totalFaculty;
    }
    
    /**
     * to return the string in a particular pattern
     * @return string value
     */
    @Override
    public String toString()
    {
        return "Name: "+firstName+" "+lastName+"; Salary: $"+salary; 
    }
}
