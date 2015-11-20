/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 *  Super interface is Insurance
 * All Known Implementing Classes are FamilyHealthInsurance, HealthInsurance, JointFamilyInsurance, NuclearFamilyInsurance, PersonalHealthInsurance
 * @author Ronak Bakshi
 */
public interface Health extends Insurance{
    /**
     * Calculates the life insurance value.
     * @param totalMonths - The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException - If the totalMonths is less than 0.
     */
    double calcLifeInsurance(int totalMonths) throws IncorrectMonthException;
    
}
