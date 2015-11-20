/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 * Class PersonalHealth inherits HealthInsurance
 *
 * @author Ronak Bakshi
 */
public class PersonalHealthInsurance extends HealthInsurance {

    private Person person;

    /**
     * Initialize the person by using one-arg constructor.
     *
     * @param person - Person type variable.
     */
    public PersonalHealthInsurance(Person person) {
        this.person = person;
    }

    /**
     * This method calculates the life insurance value of the individual person.
     * If totalMonths is 42, which is equivalent to 3 years and 6 months. The
     * method should return the sum of the number of years times the return
     * value of the calcYearlyInstallment() method and the number of months
     * times the return value of the calcMontlyInstallment() method.
     *
     * @param totalMonths The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    @Override
    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException {
        int months = totalMonths % 12;
        int years = totalMonths / 12;
        if (totalMonths < 0) {
            throw new IncorrectMonthException();
        }
        return (years * calcYearlyInstallment()) + (months * calcMontlyInstallment());
    }

    /**
     * This method calculates the monthly installment value of the individual
     * person. If the persons age is less than or equal to 10.00 or greater than
     * or equal to 60.00, then the method should return the difference of the
     * monthly installment and the 20% of the monthly installment; else the
     * method should return the monthly installment value
     *
     * @return Returns the value of monthly installment calculation.
     */
   
    public double calcMontlyInstallment() {
        double result;
        if ((person.getAge() <= 10.0) || (person.getAge() >= 60.0)) {
            result = MONTHLY_INSTALLMENT - 0.2 * MONTHLY_INSTALLMENT;
        } else {
            result = MONTHLY_INSTALLMENT;
        }
        return result;
    }

    /**
     * This method calculates the yearly installment value of the individual
     * person. If the persons age is less than or equal to 10.00 or greater than
     * or equal to 60.00, then the method should return the difference of the
     * yearly installment of one time payment and the 20% of the yearly
     * installment of one time payment; else the method should return the yearly
     * installment of one time payment value.
     *
     * @return Returns the value of yearly installment calculation.
     */
    
    public double calcYearlyInstallment() {
        double result;
        if ((person.getAge() <= 10.0) || (person.getAge() >= 60.0)) {
            result = YEARLY_INSTALLMENT_ONETIME_PAYMENT - 0.2 * YEARLY_INSTALLMENT_ONETIME_PAYMENT;
        } else {
            result = YEARLY_INSTALLMENT_ONETIME_PAYMENT;
        }
        return result;
    }

    /**
     * This method calculates the exemption amount value of the individual
     * person. The method should return the difference of the
     * calcLifeInsurance() method value in it's super class and the value of
     * calcLifeInsurance() method.
     *
     * @param totalMonths The number of months.
     * @return Returns the value of Exemption calculation.
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    
    public double calcExemption(int totalMonths) throws IncorrectMonthException {
        if (totalMonths < 0) {
            throw new IncorrectMonthException("IncorrectMonthException - As the totalMonths is less than 0.");
        }
        return super.calcLifeInsurance(totalMonths) - calcLifeInsurance(totalMonths);
    }

    /**
     * The string representation consists of the person, calcMontlyInstallment()
     * and the calcYearlyInstallment(). Please refer to the word document for
     * the sample output
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return person.toString() + String.format("; Montly Installment: $%.2f; Yearly Installment: $%.2f\n", calcMontlyInstallment(), calcYearlyInstallment());
    }
}
