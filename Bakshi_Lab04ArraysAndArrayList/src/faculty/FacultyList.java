/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

import java.util.ArrayList;

/**
 * creates an ArrayList of Faculty objects
 * @author Ronak Bakshi
 */
public class FacultyList {
    private ArrayList<Faculty> facultyArrayList;
    /**
     * used to initialize arraylist to a new empty arraylist of Faculty objects
     */
    public FacultyList()
    {
        facultyArrayList = new ArrayList<Faculty>();
    }
    /**
     * will add the faculty object to the end of the list and returns true if the faculty is successfully added.
     * @param faculty - faculty object
     * @return boolean value
     */
    public boolean addFaculty(Faculty faculty)
    {
        return facultyArrayList.add(faculty);
    }
    /**
     * adds a faculty to the list at the specified position.  If the position specified is larger than the current size of the list, the faculty is not added, and false is returned. If the faculty is successfully added, true is returned. When adding a faculty, other faculty may need to be shifted to the right in order to make space
     * @param facultyPosition - int value greater than zero
     * @param faculty - faculty object
     * @return boolean value
     */
    public boolean addFaculty(int facultyPosition, Faculty faculty)
    {
        if(facultyArrayList.size() < facultyPosition)
        {
            return false;
        }
        else
        {
            facultyArrayList.add(facultyPosition, faculty);
            return true;
        }
    }
    /**
     * Removes the faculty with specified position from the list of faculty. If a faculty is not stored at the specified position (which will be the case if the position is greater than or equal to the size of the list), the list is not changed and false is returned. If a faculty is stored at the specified position, the faculty is removed, and other faculty are shifted to fill the empty space, and true is returned
     * @param facultyPosition - int value
     * @return boolean value
     */
    public boolean removeFaculty(int facultyPosition)
    {
        if(facultyArrayList.size() <= facultyPosition)
        {
            return false;
        }
        else
        {
            facultyArrayList.remove(facultyPosition);
            return true;
        }
    }
    /**
     * Returns the number of faculty in the list.
     * @return number of faculty
     */
    public int getNumberOfFaculty()
    {
        return facultyArrayList.size();
    }
    /**
     * Returns the average Salary of the faculty in the list. If the list is empty, 0.0 is returned.
     * @return double value
     */
    public double findAverageSalary()
    {
        double sum = 0.0;
        if(facultyArrayList.isEmpty())
        {
            return 0.0;
        }   
        else
        {
            for(int i = 0; i < facultyArrayList.size(); i++)
            {
                sum += facultyArrayList.get(i).getSalary();
            }
            return sum/facultyArrayList.size();
        }
    }
    /**
     * Returns a String representation of the list of faculty. The String returned consists of each faculty in the list, followed by a newline character
     * @return string value
     */
    @Override
    public String toString()
    {
    
        String facultyStr="";
        for(int i = 0; i < facultyArrayList.size(); i++ )
        {
            facultyStr += facultyArrayList.get(i).toString()+"\n";
        }
        return facultyStr;
    }
}