/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 *Interface Employer containing getNumOfEmployees and setNumOfEmployees abstract methods
 * @author Ronak Bakshi
 */
public interface Employer {
    /**
     * abstract method getNumOfEmployees
     * @return integer type
     */
    public int getNumOfEmployees();
    /**
     * abstract method setNumOfEmployees
     * @param number integer type
     */
    public void setNumOfEmployees(int number);
}
