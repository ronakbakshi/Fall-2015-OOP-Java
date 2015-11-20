/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motelrental;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class implements MotelRental class
 * @author Ronak Bakshi
 */
public class MotelRentalDriver {
    public static void main(String[] args) throws FileNotFoundException
    {
        double rent;
        double seasonalRate;
        double discount;
        int month;
        int numberOfMonths;
        Scanner inMotelData = new Scanner(new File("motelData.txt"));
        while(inMotelData.hasNext())
        {
            rent = inMotelData.nextDouble();
            seasonalRate = inMotelData.nextDouble();
            discount = inMotelData.nextDouble();
            MotelRental room1 = new MotelRental(rent,seasonalRate,discount);
            System.out.println("\nNEW MOTEL ROOM CREATED:");
            System.out.println(room1.toString()+"\n");
            System.out.println("TESTING GETTERS");
            System.out.println("Standard rental fee = "+room1.getStandardMotelRentalAmount());
            System.out.println("Seasonal rate = "+room1.getGeasonalRate());
            System.out.println("Yearly discount = "+room1.getYearlyDiscount());
            System.out.println("\nTesting getMonthlyRental(int month)");
            for(int i=0;i<12;i++)
            {
                System.out.println("Rental fee for month "+i+" is "+room1.getMonthlyRental(i));
            }
            System.out.println("\nTESTING getYearlyRental()");
            System.out.println("Yearly rental fee = "+room1.getYearlyRental()+"\n");
            Scanner inMonthData = new Scanner(new File("monthData.txt"));
            while(inMonthData.hasNext())
            {
                month = inMonthData.nextInt();
                numberOfMonths = inMonthData.nextInt();
                System.out.println("Rental fee for "+numberOfMonths+" months,beginning with month "+month+" is "+room1.getMonthlyRental(month,numberOfMonths));
            }
            inMonthData.close();
        }
        inMotelData.close();
    }
}
