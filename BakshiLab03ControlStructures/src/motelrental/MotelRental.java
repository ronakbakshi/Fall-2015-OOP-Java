/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motelrental;

/**
 *This class contains all the getters and calculates rent monthly and yearly
 * @author Ronak Bakshi
 */
public class MotelRental {
    private double standardMotelRentalAmount;
    private double seasonalRate;
    private double yearlyDiscount;
    
    /**
     * 3 argument constructor
     * @param standardMotelRentalAmount
     * @param seasonalRate
     * @param yearlyDiscount 
     */
    public MotelRental(double standardMotelRentalAmount, double seasonalRate, double yearlyDiscount)
    {
        this.standardMotelRentalAmount = standardMotelRentalAmount;
        this.seasonalRate = seasonalRate;
        this.yearlyDiscount = yearlyDiscount;
    }
    
    /**
     * getter method for rental amount
     * @return the standard motel rental amount
     */
    public double getStandardMotelRentalAmount()
    {
        return standardMotelRentalAmount;
    }
    
    /**
     * getter method for seasonal rate
     * @return the seasonal rate
     */
    public double getGeasonalRate()
    {
        return seasonalRate;
    }
    
    /**
     * getter method for yearly discount
     * @return the yearly discount
     */
    public double getYearlyDiscount()
    {
        return yearlyDiscount;
    }
    
    /**
     * getter method for monthly rental
     * @param month
     * @return monthly rental
     */
    public double getMonthlyRental(int month)
    {
        if(month > 0 && month < 11)
        {
            return standardMotelRentalAmount;
        }
        else
        {
            return (standardMotelRentalAmount + (seasonalRate * standardMotelRentalAmount));
        }
    }
    
    /**
     * getter method for yearly rental
     * @return annual rent
     */
    public double getYearlyRental()
    {
        return 12 *((standardMotelRentalAmount) - (standardMotelRentalAmount * yearlyDiscount));
    }
    
    /**
     * getter method for monthly rental
     * @param month
     * @param numberOfMonths
     * @return monthly rental taking the total number of months into consideration
     */
    public double getMonthlyRental(int month, int numberOfMonths)
    {
        double total=0;
        int useMonth;
        int totalYears = numberOfMonths / 12;
        int extraMonths = numberOfMonths % 12;
        useMonth = month; 
        total += totalYears * getYearlyRental();
        for(int i=0;i < extraMonths ;i++)
        {
            total += getMonthlyRental(useMonth);
            useMonth ++;
            if(useMonth == 12)
            {
                useMonth = 0;
            }
        }
        return total;
    }
    /**
     * overwrites the toString method.
     * @return specified format of string
     */
    @Override
    public String toString()
    {
        return "Motel rental fee is "+standardMotelRentalAmount+";the seasonal rate is "+seasonalRate+" the yearly discount is "+yearlyDiscount;
    }
}
