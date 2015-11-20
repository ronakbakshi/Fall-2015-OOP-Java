/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

/**
 * creates an array of Faculty objects
 * @author Ronak Bakshi
 */
public class FacultyArray {
    private Faculty[] facultyArray;
    private int numberOfFaculty;
    private final int MAX = 100;
    
    /**
     * one no-arg constructor, used to create an empty list of faculty with size set to MAX, and sets numberOfFaculty to 0.
     */
    public FacultyArray()
    {
        facultyArray = new Faculty[MAX];
        numberOfFaculty = 0;
    }
    /**
     * adds a faculty at the end of the list. If the list is full, the faculty cannot be added and false is returned.  Otherwise, the faculty is added, numberOfFaculty is incremented by 1, and true is returned.
     * @param facultyIn - faculty class object
     * @return true or false
     */
    public boolean addFaculty(Faculty facultyIn)
    {
        if(numberOfFaculty >= MAX)
        {
            return false;
        }
        else
        {
         facultyArray[numberOfFaculty] = facultyIn;
         numberOfFaculty++;
         return true;
        }
    }
    /**
     * This method adds a faculty to the list at the specified position.  If the list is full, or if the position specified is larger than numberOfFaculty, the faculty is not added, and false is returned. If the faculty is successfully added, true is returned, and numberOfFaculty is incremented by 1. When adding a faculty, other faculty may need to be shifted to the right in order to make space
     * @param facultyPosition - int value greater than zero
     * @param faculty - faculty object
     * @return true or false
     */
    public boolean addFaculty(int facultyPosition, Faculty faculty)
    {
        if((numberOfFaculty >= MAX)||((facultyPosition > numberOfFaculty)))
        {
            return false;
        }
        else
        {
            for(int i=numberOfFaculty; i > facultyPosition ;i--)
            {
                facultyArray[i]=facultyArray[i-1]; 
            }
            facultyArray[facultyPosition] = faculty; 
            numberOfFaculty++;
            return true;
        }
    }
    /**
     * Removes the faculty with specified position from the list of faculty. If a faculty is not stored at the specified position (which will be the case if the position is greater than or equal to numberOfFaculty), the list is not changed and false is returned. If a faculty is stored at the specified position, the faculty is removed, and other faculty are shifted to fill the empty space. numberOfFaculty is also decremented by 1, and true is returned. 
     * @param facultyPosition - int value greater than 0
     * @return true or false
     */
    public boolean removeFaculty(int facultyPosition)
    {
        if(facultyPosition >= numberOfFaculty)
        {
            return false;
        }
        else
        {
         for(int i=facultyPosition; i<numberOfFaculty ;i++)
            {
                facultyArray[i]=facultyArray[i+1]; 
                facultyArray[i+1]=null;
            }
            numberOfFaculty--;
            return true;
        }
    }
    /**
     * Returns the number of faculty in the list.
     * @return number of faculty
     */
    public int getNumberOfFaculty()
    {
        return numberOfFaculty;
    }
    /**
     * Returns the average salary of the faculty in the list. If the list is empty, 0.0 is returned
     * @return average salary of all faculty
     */
    public double findAverageSalary()
    {
        double sum=0.0;
        double average;
        if(numberOfFaculty == 0)
        {
            return 0.0;
        }
        else
        {
            for(int i=0;i < numberOfFaculty ;i++)
            {
                sum += facultyArray[i].getSalary();
            }
            average = sum/numberOfFaculty;
            return average;
        }
    }
    
    /**
     * String representation of the list of faculty. The String returned consists of each faculty in the list, followed by a newline character.
     * @return String value
     */
    @Override
    public String toString()
    {
        String str="";
        for(int i=0; i<numberOfFaculty;i++)
        {
            str += facultyArray[i].toString()+"\n";
        }
        return str;
    }   
}
