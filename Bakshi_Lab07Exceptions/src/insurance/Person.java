/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 * Person class
 * @author Ronak Bakshi
 */
public class Person {

    private double age;
    private String firstName;
    private String gender;
    private String lastName;

    /**
     * Implement the Parameterized constructor to initialize all the above
     * variables.
     *
     * @param age Assign it to age variable.
     * @param firstName Assign it to firstName variable.
     * @param lastName Assign it to lastName variable.
     * @param gender Assign it to gender variable.
     */
    public Person(double age, String firstName, String lastName, String gender) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    /**
     * The age of the person.
     * @return double type
     */
    public double getAge() {
        return age;
    }

    /**
     * The first name of the person.
     * @return String type
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The gender of the person.
     *
     * @return String type
     */
    public String getGender() {
        return gender;
    }

    /**
     * The Last Name of the person.
     *
     * @return String type
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The new age of the person.
     *
     * @param age double type
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * The new first name of the person.
     *
     * @param firstName String type
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The gender of the person to be set.
     *
     * @param gender String type
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * The last name of the person.
     *
     * @param lastName String type
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * All the private variable are separated by one space. Print the String
     * values left justified by 10 spaces and print the floating point values
     * right justified by 3 spaces with two number decimal values.
     * @return String type
     */
    @Override
    public String toString() {
        return (String.format("%-10s %-10s %-10s %3.2f", firstName, lastName, gender, age));
    }
}
