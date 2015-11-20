/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingandexceptions;

/**
 *
 * @author Ronak Bakshi
 */
public interface PropertyInsurance {
    static final double LONG_TERM_PLAN = 100000;
    static final double INSURANCE_DURATION = 5;
    
    double calcShortTermPlan(int noOfYears) throws IncorrectYearsException;
    double calcLongTermPlan(int noOfYears) throws IncorrectYearsException;
}
