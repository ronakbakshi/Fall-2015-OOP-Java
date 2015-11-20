/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * implements Faculty class, reads from a file named faculty.txt and saves output to saveInfoText.txt
 * @author Ronak Bakshi
 */
public class FacultyDriver
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String fName;
        String lName;
        double salary;
        double average;
//        This program runs correctly using either the FacultyList class or the 
//        FacultyArray class.  Select the one you want to use by 
//        commenting out one of the statements below.
//        Note: The output should be shown both on the console and saved to a 
//        file. Use Printwriter to save the console output to a file.
        
//        NOTE: The term "faculty list" throughout refers to faculty 
//        objects stored in FacultyList/FacultyArray
        
//	  Create an object named facultyObjectValue of FacultyList class.
       //  FacultyList facultyObjectValue = new FacultyList(); //Comment this 
//        if you want to use the FacultyArray class
//        
        FacultyArray facultyObjectValue = new FacultyArray(); //Uncomment this
//        line if you want to use the FacultyArray class and comment the 
//        above FacultyList class.                  
             
	PrintWriter printOut = new PrintWriter("saveInfoText.txt"); //Creates 
//        a new PrintWriter, without automatic line flushing, with the specified 
//        file name.
          
// 	  declare and initialize a Scanner object named fileReader to 
//        read from the file faculty.txt 

        Scanner fileReader = new Scanner(new File("faculty.txt"));
		
//        while faculty.txt has more data {
//	  Read in the data, and use the values as arguments for a call to 

        Faculty noArgFaculty = new Faculty();
        while(fileReader.hasNext())
        {
            fName = fileReader.next();
            lName = fileReader.next();
            salary = fileReader.nextDouble();
            Faculty faculty = new Faculty(fName,lName,salary);
            //addFaculty(new Faculty(fileReader.next(),fileReader.next(), 
            //fileReader.nextDouble())).
            facultyObjectValue.addFaculty(faculty);
	}
//        print the total number of Faculty objects created from 
//        faculty.txt using getTotalFaculty()
        System.out.println("Total Faculty objects created from faculty.txt ="+noArgFaculty.getTotalFaculty());
        System.out.println("");
        printOut.println("Total Faculty objects created from faculty.txt ="+noArgFaculty.getTotalFaculty());
        printOut.println("");
//	  print the Contents of faculty list
        System.out.println("Contents of faculty list ("+facultyObjectValue.getNumberOfFaculty()+" faculty members)");
        printOut.println("Contents of faculty list ("+facultyObjectValue.getNumberOfFaculty()+" faculty members)");
//	  print the facultyObjectValue		
        System.out.println(facultyObjectValue.toString());   
        printOut.println(facultyObjectValue.toString());   
//	  print the average Salary using findAverageSalary()
        average = facultyObjectValue.findAverageSalary();
        String s = String.format("%.2f",average);
        System.out.println("Average salary: $"+s);
        printOut.println("Average salary: $"+s);
        
//	  example: facultyObjectValue.findAverageSalary()
//        Note:Limit the value of the average salary to 2 decimal points.        

//	  add one of the faculty member to the end of the list by creating the 
//        Faculty object facultyObject and pass it to the 
//        addFaculty(facultyObject)
//        example:  Faculty facultyObject = new Faculty("Gwen", "DeMarco", 
//        39000.45);				
//		facultyObjectValue.addFaculty(facultyObject);
        
        System.out.println("\nAdding one faculty to end of list");
        printOut.println("\nAdding one faculty to end of list");
        System.out.println("\nAttempting to add one faculty to list at index 3");
        printOut.println("\nAttempting to add one faculty to list at index 3");
        Faculty facultyObject = new Faculty("Gwen", "DeMarco", 39000.45);
        facultyObjectValue.addFaculty(facultyObject);
       
//	  Attempt adding faculty at index 3. Return  Successfully added  
//        if you are able to add the faculty to the list. 
//        Return  Unable to add Faculty .
//        example: facultyObject = new Faculty( Bilbo", "Baggins", 45000.48);
//	  if(facultyObjectValue.addFaculty(3, facultyObject))
//	  {
//          print  Successfully added 
//	  }
//	  else
//	  {
//	     unable to add faculty 
//	  }
        Faculty faculty = new Faculty("Bilbo","Baggins",45000.48);
        if(facultyObjectValue.addFaculty(3,faculty))
        {
            System.out.println("Successfully added");
            printOut.println("Successfully added");
        }
        else
        {
            System.out.println("Unable to add faculty");
            printOut.println("Unable to add faculty");
        }
		
//	  Attempt adding faculty at index 40. Return  Successfully added  if you 
//        are able to add the faculty to the list, else print 
//         Unable to add Faculty .
//	  Example: facultyObject = new Faculty( Fanny", "Brice", 39000);
//	  if(facultyObjectValue.addFaculty(40, facultyObject))
//	  {
//	 	print  Successfully added 
//	  }
//      else
//	  {
//	 	 unable to add faculty 
//	  }
//
        System.out.println("\nAttempting to add one faculty to list at index 40");
        Faculty faculty2 = new Faculty( "Fanny", "Brice", 39000);
        if(facultyObjectValue.addFaculty(40, faculty2))
        {
            System.out.println("Successfully added");
            printOut.println("Successfully added");
        }
        else
        {
            System.out.println("Unable to add faculty");
            printOut.println("Unable to add faculty");
        }
// 	Print the getNumberOfFaculty()
//	Example: facultyObjectValue.getNumberOfFaculty()
        System.out.println("\nNumber of faculty members in list: "+facultyObjectValue.getNumberOfFaculty());
        printOut.println("\nNumber of faculty members in list: "+facultyObjectValue.getNumberOfFaculty());
        
//	Attempt to remove a faculty at index equal to the number of 
//      faculty in the list and return  Successfully removed  if you are 
//      able to remove, else print  Unable to remove  
//	Example: 
//        if(facultyObjectValue.removeFaculty(facultyObjectValue.getNumberOfFaculty()))
//	  {
//      	print("Successfully removed");
//        } 
//        else
//      {
//		print("Unable to remove");
//	}
        System.out.println("Attempting to remove faculty at index equal to the number of faculty members in the list(currently "+facultyObjectValue.getNumberOfFaculty()+")");
        printOut.println("Attempting to remove faculty at index equal to the number of faculty members in the list(currently "+facultyObjectValue.getNumberOfFaculty()+")");
        if(facultyObjectValue.removeFaculty(facultyObjectValue.getNumberOfFaculty()))
        {
            System.out.println("Successfully removed");
            printOut.println("Successfully removed");
        }
        else
        {
            System.out.println("Unable to remove");
            printOut.println("Unable to remove");
        }
// 	  Attempt removing faculty at index 5 and print 
//         Successfully removed  if you are able to remove, else print 
//         unable to remove .
//	 Example: 
//        if(facultyObjectValue.removeFaculty(5)
//	{
//		print   Successfully Removed 
//	}
//	else
//	{
//	Print  unable to remove 	
//      }
        System.out.println("\nAttempting to remove faculty at index 5");
        printOut.println("\nAttempting to remove faculty at index 5");
        if(facultyObjectValue.removeFaculty(5))
        {
            System.out.println("Successfully removed");
            printOut.println("Successfully removed");
        }
        else
        {
            System.out.println("Unable to remove");
            printOut.println("Unable to remove");
        }
//	  Attempt removing faculty at index 20 and print 
//        "Successfully removed  if you are able to remove, 
//        else print  unable to remove .
// 	   Example: 
//        if(facultyObjectValue.removeFaculty(20)
//	  {
//		print   Successfully Removed 
//	  }
//	  else
//	  {
//		Print  unable to remove 	
//        }
	System.out.println("\nAttempting to remove faculty at index 20");
        printOut.println("\nAttempting to remove faculty at index 20");
        if(facultyObjectValue.removeFaculty(20))
        {
            System.out.println("Successfully removed");
            printOut.println("Successfully removed");
        }
        else
        {
            System.out.println("Unable to remove");
            printOut.println("Unable to remove");
        }	
		
//		Print the Contents of the FacultyList/FacultyArray
        System.out.println("\nContents of faculty list ("+facultyObjectValue.getNumberOfFaculty()+" faculty members)");
        printOut.println("\nContents of faculty list ("+facultyObjectValue.getNumberOfFaculty()+" faculty members)");
        System.out.println("Contents of list");
        printOut.println("Contents of list");
                
//		Print  toString  method of FacultyList object.
//		Example: facultyObjectValue.toString()
        
        System.out.println(facultyObjectValue.toString());
        printOut.println(facultyObjectValue.toString());
        
//		call and print the findAverageSalary() method. 
//		Example: facultyObjectValue.findAverageSalary()
//              Note:Limit the value of the average salary to 2 decimal points.
        
        average = facultyObjectValue.findAverageSalary();
        String s1 = String.format("%.2f",average);
        System.out.println("Average salary: $"+s1);
        printOut.println("Average salary: $"+s1);
        fileReader.close();
        printOut.close();	      
    }
}