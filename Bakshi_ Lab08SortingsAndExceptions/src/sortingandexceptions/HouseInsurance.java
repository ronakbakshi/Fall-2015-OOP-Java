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
public class HouseInsurance implements PropertyInsurance, java.lang.Comparable<HouseInsurance>{
    private String ownerName;
    private String apartmentNumber;
    private int totalYearsOfPayment;
    private String ssn;
    private String location;

    public HouseInsurance(String ownerName, String apartmentNumber, int totalYearsOfPayment, String ssn, String location) {
        this.ownerName = ownerName;
        this.apartmentNumber = apartmentNumber;
        this.totalYearsOfPayment = totalYearsOfPayment;
        this.ssn = ssn;
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public int getTotalYearsOfPayment() {
        return totalYearsOfPayment;
    }

    public String getSsn() {
        return ssn;
    }

    public String getLocation() {
        return location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setTotalYearsOfPayment(int totalYearsOfPayment) {
        this.totalYearsOfPayment = totalYearsOfPayment;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        String str1 = ssn.substring(0,3)+"-";
        String str2 = ssn.substring(str1.length() - 1,str1.length() + 2) + "-";
        String str3 = str1 + str2 + ssn.substring(str2.length()+2,ssn.length());
        return String.format("%-10s %-10s %3d %-10s %-10s %-10s",ownerName,apartmentNumber,totalYearsOfPayment,ssn,location,str3);
    }
    public void checkSSNNumber(String ssn) throws NonDigitFoundException{
       boolean flag=true;
       int ascii;
       for(int i=0; i < ssn.length(); i++)
       {
           ascii = (int)ssn.charAt(i);
           if(!((ascii >= 48)&&(ascii <= 57)))
           {
               flag = false;
               break;
           }
       }
       if(flag == false){
           throw new NonDigitFoundException("NonDigitFoundException: Some values in the SSN are not digits.");
       }
    }
    public double calcLongTermPlan(int noOfYears)throws IncorrectYearsException{
        double result = 0.0;
        if(noOfYears == INSURANCE_DURATION){
            result = LONG_TERM_PLAN * noOfYears + 0.1 * LONG_TERM_PLAN * noOfYears;
        }
        else if(noOfYears < INSURANCE_DURATION){
            result = calcShortTermPlan(noOfYears);
        }
        else if((noOfYears > INSURANCE_DURATION) || (noOfYears <= 0)){
            throw new IncorrectYearsException("Value of repayment shouldn't be greater than the insurance duration or less than equal to zero.");
        }
        return result;
    }
    public double calcShortTermPlan(int noOfYears)throws IncorrectYearsException{
        double result = 0.0;
        if(noOfYears == 4){
            result = LONG_TERM_PLAN * noOfYears * (1- 0.2);
        }else if(noOfYears == 3){
            result = LONG_TERM_PLAN * noOfYears * (1- 0.23);
        }
        else if(noOfYears == 2){
            result = LONG_TERM_PLAN * noOfYears * (1- 0.25);
        }
        else if(noOfYears == 1){
            result = LONG_TERM_PLAN * noOfYears * (1- 0.27);
        }
        else if(noOfYears == INSURANCE_DURATION){
            result = calcLongTermPlan(noOfYears);
        }
        if((noOfYears > INSURANCE_DURATION) || (noOfYears <= 0)){
            throw new IncorrectYearsException("Value of repayment shouldn't be greater than the insurance duration or less than equal to zero.");
        }
        return result;
    }
    public int compareTo(HouseInsurance houseInsurance){
        int result;
        result = getApartmentNumber().compareTo(houseInsurance.getApartmentNumber());
        return result;
    }
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(object == this){
            return true;
        }
        if(!(object.getClass() == this.getClass())){
            return false;
        }
        HouseInsurance objectType = (HouseInsurance) object;
        return getOwnerName().equals(objectType.getOwnerName());
    }
    
    
}
