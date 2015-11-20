/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 *Abstract class AbstractStudent
 * @author Ronak Bakshi
 */
public abstract class AbstractStudent {
    private String nameOfStudent;
    private double annualTuition;
    /**
     * The constructor AbstractStudent initializes the attribute nameOfStudent and annualTution
     * @param nameOfStudent String type
     * @param annualTuition double type
     */
    public AbstractStudent(String nameOfStudent, double annualTuition) {
        this.nameOfStudent = nameOfStudent;
        this.annualTuition = annualTuition;
    }
    /**
     * The method getAnnualTuition returns annual tuition
     * @return double type
     */
    public double getAnnualTuition() {
        return annualTuition;
    }
    /**
     * The method getTuition is an abstract method
     * @return double type
     */
    public abstract double getTuition();
    /**
     * The method toString returns a string that has the name of the student followed by the tuition he pays every year. The name prints in a field of length 20 and the tuition is a floating-point value, so print it with two decimal places in the field of length 10.
     * @return String type
     */
    @Override
    public String toString() {
        return String.format("%-20s %10.2f",nameOfStudent,annualTuition);
    }
}
