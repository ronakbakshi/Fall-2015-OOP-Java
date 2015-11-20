/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 * All Known Sub interface is Health All Known Implementing Classes are
 * FamilyHealthInsurance, HealthInsurance, JointFamilyInsurance,
 * NuclearFamilyInsurance, PersonalHealthInsurance
 * @author Ronak Bakshi
 */
public interface Insurance {

    double MONTHLY_INSTALLMENT = 1000;
    double YEARLY_INSTALLMENT_ONETIME_PAYMENT = 10000;
    /**
     * The exemption amount a person gets for a given number of months.
     * @param totalMonths - The number of months.
     * @return Returns the value of discount amount calculation.
     * @throws IncorrectMonthException - If the totalMonths is less than 0.
     */
    double calcExemption(int totalMonths) throws IncorrectMonthException;
    /**
     * Calculates monthly installment.
     * @return Returns the value of monthly installment calculation.
     */
    double calcMontlyInstallment();
    /**
     * Calculates yearly installment.
     * @return Returns the value of yearly installment calculation.
     */
    double calcYearlyInstallment();

}
