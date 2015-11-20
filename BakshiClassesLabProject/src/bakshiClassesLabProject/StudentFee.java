/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshiClassesLabProject;

/**
 *contains the details of fees a student needs to pay which depends on various attributes defined
 * @author Ronak Bakshi
 */
public class StudentFee {
    private int creditHours;
    private double feePerCreditHour;
    private double scholarshipAmount;
    private double healthInsurancePerAnnum;
    /**
     * Constructor with 4 arguments
     * @param creditHours - number of credit hours for a course
     * @param feePerCreditHour - fee of each credit hour
     * @param scholarshipAmount - Scholarship amount
     * @param healthInsurancePerAnnum - health insurance premium amount per annum
     */
    public StudentFee(int creditHours, double feePerCreditHour, double scholarshipAmount, double healthInsurancePerAnnum){
        this.creditHours = creditHours;
        this.feePerCreditHour = feePerCreditHour;
        this.scholarshipAmount = scholarshipAmount;
        this.healthInsurancePerAnnum = healthInsurancePerAnnum;
        
    }
    /**
     * Constructor with no arguments
     */
    public StudentFee(){
        
    }
    /**
     * Sets the number of credit hours
     * @param creditHours 
     */
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }    
    /**
     * sets the fee for each credit hour
     * @param feePerCreditHour 
     */
    public void setFeePerCreditHour(double feePerCreditHour){
        this.feePerCreditHour = feePerCreditHour;
    }
    /**
     * sets the scholarship amount for students
     * @param scholarshipAmount 
     */
    public void setscholarshipAmount(double scholarshipAmount){
        this.scholarshipAmount = scholarshipAmount;
    }
    /**
     * sets the health insurance per annum for each student
     * @param healthInsurancePerAnnum 
     */
    public void setHealthInsurancePerAnnum(double healthInsurancePerAnnum){
        this.healthInsurancePerAnnum = healthInsurancePerAnnum;
    }
    /**
     * Calculates the tuition fee for each student
     * @return the tuition fee
     */
    public double tuitionFee(){
        double tuitionFeeAmt;
        tuitionFeeAmt = (feePerCreditHour * creditHours);
        return tuitionFeeAmt;
    }
    /**
     * Gets the scholarship amount for each student
     * @return scholarship amount
     */
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    /**
     * Calculates the quaterly health insurance for students from the annual health insurance 
     * @return health insurance for a quarter
     */
    public double quaterlyHealthInsurance(){
        double quaterlyHealthInsuranceAmt;
        quaterlyHealthInsuranceAmt = ((healthInsurancePerAnnum*4)/12);
        return quaterlyHealthInsuranceAmt;
    }
    /**
     * Calculates the total and final fee a student needs to pay 
     * @return total fee
     */
    public double totalFee(){
        double totalFeeAmt;
        totalFeeAmt = ((feePerCreditHour * creditHours) - scholarshipAmount + ((healthInsurancePerAnnum*4)/12));
        return totalFeeAmt;
    }
    /**
     * Calculates the minimum due a student needs to pay
     * @return half of total fee
     */
    public double minimumDue(){
        double minimumDueAmt;
        minimumDueAmt = (((feePerCreditHour * creditHours) - scholarshipAmount + ((healthInsurancePerAnnum*4)/12))/2);
        return minimumDueAmt;
    }
    /**
     * for modified display
     * @return all the attributes with values aligned
     */
    public String toString(){
        return "Credit hours: "+ creditHours+"\nFee per credit hour: $"+feePerCreditHour+"\nScholarship amount: $"+scholarshipAmount+"\nHealth insurance amount per annum: $"+healthInsurancePerAnnum;
    }
}
