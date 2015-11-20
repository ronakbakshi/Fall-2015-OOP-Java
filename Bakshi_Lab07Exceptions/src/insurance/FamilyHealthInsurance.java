/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 * All Implemented Interfaces are Health, Insurance Direct Known Subclasses are
 * JointFamilyInsurance, NuclearFamilyInsurance
 *
 * @author Ronak Bakshi
 */
public class FamilyHealthInsurance extends HealthInsurance {

    private Person[] familyMembers;
    private int personsCount = 0;

    /**
     * Initialize the length of the familyMembers array by using one-arg
     * constructor.
     *
     * @param noOfPersons - The number of persons.
     */
    public FamilyHealthInsurance(int noOfPersons) {
        familyMembers = new Person[noOfPersons];
    }

    /**
     * This method adds the person to the familyMembers array.
     *
     * @param person - The value of the new person to be added.
     * @throws IllegalFamilyMemberException - If the total number of persons is
     * greater than the length of the familyMembers array.
     */
    public void addPerson(Person person) throws IllegalFamilyMemberException {
        if (familyMembers.length-1 < personsCount) {
            throw new IllegalFamilyMemberException("IllegalFamilyMemberException as arraylength got exceeded.");
        }
        familyMembers[personsCount] = person;
        personsCount++;
    }

    /**
     * public Person getFamilyMember(int index)
     *
     * @param index - Used to get the person at a particular index.
     * @return The person at a specific index.
     */
    public Person getFamilyMember(int index) {
        return familyMembers[index];
    }

    /**
     * The number of persons in the family in int.
     *
     * @return The number of persons in the family.
     */
    public int getPersonsCount() {
        return personsCount;
    }

    /**
     * This method calculates the life insurance value for the whole family. If
     * totalMonths is 42, which is equivalent to 3 years and 6 months. The
     * method should return the sum of the number of years times the return
     * value of the calcYearlyInstallment() method and the number of months
     * times the return value of the calcMontlyInstallment() method.
     *
     * @param totalMonths - The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException - If the totalMonths is less than 0.
     */
    @Override
    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException {
        int months = totalMonths % 12;
        int years = totalMonths / 12;
        double result;
        if (totalMonths < 0) {
            throw new IncorrectMonthException("IncorrectMonthException - As the totalMonths is less than 0.");
        }
        result = (years * calcYearlyInstallment()) + (months * calcMontlyInstallment());
        return result;
    }

    /**
     * This method calculates the monthly installment value for the whole
     * family. If the person's age in a family is less than or equal to 10.00 or
     * greater than or equal to 60.00, then the method should calculate the
     * difference of the monthly installment and the 20% of the monthly
     * installment; else no % should be given on the monthly installment. The
     * above calculation gives the value of monthly installment based on age of
     * a person. Next, pass the above value to the calcFamilyDiscount() method
     * to get the final monthly installment value of a person based on the
     * number of persons in a family.
     *
     * @return Returns the value of monthly installment calculation.
     */
    
    public double calcMontlyInstallment() {
        double result1 = 0.0;
        double result2;
        for (Person familyMember : familyMembers) {
            if ((familyMember.getAge() <= 10.0) || (familyMember.getAge() >= 60.0)) {
                result2 = MONTHLY_INSTALLMENT - (0.20 * MONTHLY_INSTALLMENT);
            } else {
                result2 = MONTHLY_INSTALLMENT;
            }
            result2 = calcFamilyDiscount(result2);
            result1 += result2;
        }
        return result1;
    }

    /**
     * This method calculates the yearly installment value for the whole family.
     * If the person's age in a family is less than or equal to 10.00 or greater
     * than or equal to 60.00, then the method should calculate the difference
     * of the yearly installment and the 20% of the yearly installment; else no
     * % should be given on the yearly installment. The above calculation gives
     * the value of yearly installment based on age of a person. Next, pass the
     * above value to the calcFamilyDiscount() method to get the final yearly
     * installment value of a person based on the number of persons in a family.
     *
     * @return double type
     */
    
    public double calcYearlyInstallment() {
        double result1 = 0.0;
        double result2;
        for (Person familyMember : familyMembers) {
            if ((familyMember.getAge() <= 10.0) || (familyMember.getAge() >= 60.0)) {
                result2 = YEARLY_INSTALLMENT_ONETIME_PAYMENT - (0.20 * YEARLY_INSTALLMENT_ONETIME_PAYMENT);
            } else {
                result2 = YEARLY_INSTALLMENT_ONETIME_PAYMENT;
            }
            result2 = calcFamilyDiscount(result2);
            result1 += result2;
        }
        return result1;
    }

    /**
     * This method calculates the exemption amount value of the whole family.
     * The method should return the difference of the calcLifeInsurance() method
     * value in it's super class times the number of persons and the value of
     * calcLifeInsurance() method.
     *
     * @param totalMonths - The number of months.
     * @return Returns the value of Exemption calculation.
     * @throws IncorrectMonthException - If the totalMonths is less than 0.
     */
    
    public double calcExemption(int totalMonths) throws IncorrectMonthException {
        if (totalMonths < 0) {
            throw new IncorrectMonthException();
        }
        return (super.calcLifeInsurance(totalMonths) * personsCount) - (calcLifeInsurance(totalMonths));
    }

    /**
     * This method calculates the family discount value for the whole family. If
     * the total family members count is equal to 4, then the method should
     * calculate the difference of the valueBasedOnAge and 15% of the
     * valueBasedOnAge; else if the total family members count is greater than
     * or equal to 5, then the method should return the difference of the
     * valueBasedOnAge and 20% of the valueBasedOnAge. If the total family
     * members count is not in the above specific range then the method should
     * return the valueBasedOnAge;
     *
     * @param valueBasedOnAge - The value based on the age.
     * @return double type
     */
    public double calcFamilyDiscount(double valueBasedOnAge) {
        double result;
        if (personsCount == 4) {
            result = valueBasedOnAge - 0.15 * valueBasedOnAge;
        } else if (personsCount >= 5) {
            result = valueBasedOnAge - 0.2 * valueBasedOnAge;
        } else {
            result = valueBasedOnAge;
        }
        return result;
    }

    /**
     * The string representation consists of the familyMembers array,
     * calcMontlyInstallment() and the calcYearlyInstallment(). Please refer to
     * the word document for the sample output.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        String str = "";
        for (Person familyMember : familyMembers) {
            str += familyMember + String.format("; Family Monthly Installment: $%.2f; Family Yearly Installment: $%.2f\n", calcMontlyInstallment(), calcYearlyInstallment());
        }
        return str;
    }
}
