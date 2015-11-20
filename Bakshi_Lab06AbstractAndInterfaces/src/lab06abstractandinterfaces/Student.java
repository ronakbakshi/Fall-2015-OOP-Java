/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 * Student is a sub class of AbstractStudent and implements Employee and Employer Interface. class Student that extends AbstractStudent and implements the interfaces Employee and Employer 
 * @author Ronak Bakshi
 */
public class Student extends AbstractStudent implements Employee, Employer {
    private String nameOfInstitution;
    private int hoursWorked;
    private double hourlyRate;
    private int numOfEmployees;
    int years;
    /**
     * The constructor Student initializes the attributes declared in the class Student. For the attributes declared in its superclass, your program should invoke the superclass constructor to initialize them
     * @param nameOfStudent String type
     * @param annualTuition double type
     * @param years integer type
     * @param nameOfInstitution String type
     * @param hoursWorked integer type
     * @param hourlyRate integer type
     * @param numOfEmployees integer type
     */
    public Student(String nameOfStudent, double annualTuition,int years, String nameOfInstitution, int hoursWorked, double hourlyRate, int numOfEmployees) {
        super(nameOfStudent, annualTuition);
        this.nameOfInstitution = nameOfInstitution;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.numOfEmployees = numOfEmployees;
        this.years = years;
    }
    /**
     * The method toString returns the values of all attributes in the same order they are declared. Specifically, this toString method should call the toString defined in the class AbstractStudent and then print the values of the attributes which are additionally added to the class Student. The values are separated by one space. For strings, print each of them in the field of length 20; for integers, print each of them in the field of length 4; for floating-point values, print each of them in the field of length 10 with two decimal places
     * @return String type
     */
    @Override
    public String toString() {
        return super.toString() + String.format("%4d %-20s %4d %10.2f %4d",years, nameOfInstitution, hoursWorked, hourlyRate, numOfEmployees);
    }
    /**
     * getTuition returns the multiplication of the number of years a student needs to study for his/her degree by the annualTuition
     * @return double type
     */
    @Override
    public double getTuition(){
        return years * super.getAnnualTuition();
    }
    /**
     * getWeeklySalary returns the multiplication of the hourlyRate by the number of hours the student worked per week
     * @return double type
     */
    @Override
    public double getWeeklySalary(){
        return hourlyRate * hoursWorked * 7;
    }
    /**
     * getNumOfEmployees returns the value of the attribute numOfEmployees
     * @return integer type
     */
    @Override
    public int getNumOfEmployees(){
        return numOfEmployees;
    }
    /**
     * setNumOfEmployees sets the value of the attribute numOfEmployees
     * @param number integer type
     */
    @Override
    public void setNumOfEmployees(int number){
        numOfEmployees = number;
    }
}
