/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 * All Implemented Interfaces are Health, Insurance Direct Known Subclasses are
 * FamilyHealthInsurance, PersonalHealthInsurance
 *
 * @author Ronak Bakshi
 */
public abstract class HealthInsurance implements Health {

    /**
     * no argument constructor
     */
    public HealthInsurance() {
    }

    /**
     * This method calculates the life insurance value. If totalMonths is 42,
     * which is equivalent to 3 years and 6 months. The method should return the
     * sum of the number of years times the yearly installment of one time
     * payment and the number of months times the monthly installment.
     * @param totalMonths - The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException - If the totalMonths is less than 0.
     */

    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException {
        int years = totalMonths / 12;
        int months = totalMonths % 12;
        double result;
        if (totalMonths < 0) {
            throw new IncorrectMonthException();
        }
        result = (years * YEARLY_INSTALLMENT_ONETIME_PAYMENT) + (months * MONTHLY_INSTALLMENT);
        return result;
    }
}
