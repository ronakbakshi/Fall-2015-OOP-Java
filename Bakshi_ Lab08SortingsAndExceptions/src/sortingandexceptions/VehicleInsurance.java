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
public class VehicleInsurance implements PropertyInsurance, java.lang.Comparable<VehicleInsurance> {

    private String vehicleOwnerName;
    private String vehicleNumber;
    private String vehicleMake;
    private int vehiclePurchaseYear;
    private int totalYearsOfPayment;
    private String telephoneNumber;

    public VehicleInsurance(String vehicleOwnerName, String vehicleNumber, String vehicleMake, int vehiclePurchaseYear, int totalYearsOfPayment, String telephoneNumber) {
        this.vehicleOwnerName = vehicleOwnerName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleMake = vehicleMake;
        this.vehiclePurchaseYear = vehiclePurchaseYear;
        this.totalYearsOfPayment = totalYearsOfPayment;
        this.telephoneNumber = telephoneNumber;
    }

    public void checkPhoneNumber(String telephoneNumber) throws IncorrectAreaCodeException, IncorrectLengthException, NonDigitFoundException {
        boolean flag = true;
        if(!("660".equals(telephoneNumber.substring(2)))||("816".equals(telephoneNumber.substring(2)))){
            throw new IncorrectAreaCodeException("IncorrectAreaCodeException: Area code must be 660 or 816.");
        }
        if(telephoneNumber.length() < 10){
            throw new IncorrectLengthException("IncorrectLengthException: The Phone number should be of 10 digits.");
        }
        //48 to 57
        for(int i = 0; i<telephoneNumber.length(); i++){
            if(!(telephoneNumber.charAt(i)>= 48)&&(telephoneNumber.charAt(i) <= 57))
            {
                flag = false;
                break;
            }
        }
        if(flag == false){
            throw new NonDigitFoundException("NonDigitFoundException: The Phone number should consists of only numbers (Characters shouldn't be accepted).");
        }
    }
    public double calcLongTermPlan(int noOfYears)throws IncorrectYearsException{
        double result = 0.0;
        if((noOfYears > INSURANCE_DURATION)||(noOfYears <= 0))
        {
            throw new IncorrectYearsException();
        }
        else if(noOfYears == INSURANCE_DURATION){
            result = (LONG_TERM_PLAN * noOfYears)*(1 + 0.10);
        }
        else if(noOfYears < INSURANCE_DURATION){
            result = calcShortTermPlan(noOfYears);
        }
        return result;
    }
    public double calcShortTermPlan(int noOfYears)throws IncorrectYearsException{
        double result = 0.0;
        if((noOfYears > INSURANCE_DURATION)||(noOfYears <= 0))
        {
            throw new IncorrectYearsException();
        }
        if(noOfYears == 4){
            result = (LONG_TERM_PLAN * noOfYears)*(1 - 0.10); 
        }
        else if(noOfYears == 3){
            result = (LONG_TERM_PLAN * noOfYears)*(1 - 0.15); 
        }
        else if(noOfYears == 2){
            result = (LONG_TERM_PLAN * noOfYears)*(1 - 0.20); 
        }
        else if(noOfYears == 2){
            result = (LONG_TERM_PLAN * noOfYears)*(1 - 0.25); 
        }
        else if(noOfYears == INSURANCE_DURATION){
            result = calcLongTermPlan(noOfYears);
        }
        return result;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehiclePurchaseYear(int vehiclePurchaseYear) {
        this.vehiclePurchaseYear = vehiclePurchaseYear;
    }

    public void setTotalYearsOfPayment(int totalYearsOfPayment) {
        this.totalYearsOfPayment = totalYearsOfPayment;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public int getVehiclePurchaseYear() {
        return vehiclePurchaseYear;
    }

    public int getTotalYearsOfPayment() {
        return totalYearsOfPayment;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public int compareTo(VehicleInsurance vehicleInsurance){
        return telephoneNumber.compareTo(vehicleInsurance.telephoneNumber);
    }
    @Override
    public boolean equals(Object object){
        return getVehicleNumber().equals(object);
    }
    @Override
    public String toString(){
        String str1 = telephoneNumber.substring(0,3)+"-";
        String str2 = telephoneNumber.substring(str1.length() - 1,str1.length() + 2) + "-";
        String str3 = str1 + str2 + telephoneNumber.substring(str2.length()+2,telephoneNumber.length());
        return String.format("%-10s %-10s %-10s %3d %3d %-10s",vehicleOwnerName,vehicleNumber,vehicleMake,vehiclePurchaseYear,totalYearsOfPayment,str3);
    }
}
