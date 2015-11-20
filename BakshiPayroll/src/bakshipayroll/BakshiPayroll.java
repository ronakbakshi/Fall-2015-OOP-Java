/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshipayroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ronak Bakshi
 */
public class BakshiPayroll {

    /**
     * @param args the command line arguments
     */
    private static final ArrayList<AbstractEmployee> employees = new ArrayList<>();
    private static final ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<>();
    private static final ArrayList<SalaryEmployee> salaryEmployees = new ArrayList<>();
    private static final String SMALL_FILE_NAME = "output1.txt";
    private static final String LARGE_FILE_NAME = "output2.txt";

    public static void main(String[] args) {
        final String DIR = System.getProperty("user.dir");
        final String PARTIAL = "/src/bakshipayroll/";
        final String PATH = DIR + PARTIAL;

        // do everything in one big method so we can run it twice
        // once for the small file and once for the big file.
        //BakshiPayroll.readDataCalculatePayAndDisplayInfo(PATH + SMALL_FILE_NAME);
        BakshiPayroll.readDataCalculatePayAndDisplayInfo(PATH + LARGE_FILE_NAME);
    }

    /**
     * Read in weekly pay data from a file and calculate the pay.
     *
     * @param fname - the complete path and file name of the data file
     */
    public static void readDataCalculatePayAndDisplayInfo(String fname) {

        // declare a totalPay variable (make it a double)
        double totalPay = 0.0;

        // declare and initialize a new File (given the fname)
        File file = new File(fname);

        // declare a Scanner and set it to null
        Scanner sc = null;

        try {
            // initialize the scanner in a try/catch block

            sc = new Scanner(file);

        } catch (FileNotFoundException ex) {

            System.out.println("SCANNER ERROR: " + ex.getMessage());//Logger.getLogger(BakshiPayroll.class.getName()).log(Level.SEVERE, null, ex);
        }

        // if an exception is thrown, output a helpful message
        // use a loop to read all the data
        while (sc.hasNextLine()) {
            //while (sc.hasNextLine()) {
            // read four entries for each record
            String name = sc.nextLine();
            double payRate = Double.parseDouble(sc.nextLine());
            double extraPay = Double.parseDouble(sc.nextLine());
            String department = sc.nextLine();
            // if the pay rate is > 100 then
            SalaryEmployee SE;
            HourlyEmployee HE;
            //int numOfSalEmployees = 0;
            //int numOfHourEmployees = 0;
            if (payRate > 100) {
                // create a new SalaryEmployee
                SE = new SalaryEmployee(name, department, payRate, extraPay);
                // add add it to the list of employees
                employees.add(SE);
                // add add it to the list of salaried employees
                salaryEmployees.add(SE);
                //numOfSalEmployees++;
            } else {
                // otherwise
                // create a new HourlyEmployee
                HE = new HourlyEmployee(name, department, payRate, extraPay);
                // add add it to the list of employees
                employees.add(HE);
                // add add it to the list of hourly employees
                hourlyEmployees.add(HE);
                //numOfHourEmployees++;
                //}
            }
        }
            // finish with the scanner object
            //sc.close();
            //  calculate pay using a single enhanced for loop
            for (AbstractEmployee e : employees) //  display Total pay = v  (where v is the total pay)
            {
                totalPay += e.calcPay();
            }
        
            // call a method to display the to string for each salaried employee
            displaySalariedEmployees();
            // call a method to display the full name for each hourly employee
            displayHourlyEmployeeNames();
            // call a method to display the count of each (see sample output)
            displaySummary();
            // }    
        
    }

    public static void displaySalariedEmployees() {
        for (SalaryEmployee se : salaryEmployees) {
            System.out.println(se.toString());
        }
    }

    /**
     * Display the toString() content for each salaried employee.
     */
    public static void displayHourlyEmployeeNames() {
        for (HourlyEmployee he : hourlyEmployees) {
            System.out.println(he.toString());
        }
    }
    /**
     * Display the name (first and last) for each hourly employee.
     */
    public static void displaySummary(){
        System.out.println("The number of salaried employees ="+salaryEmployees.size());
        System.out.println("The number of hourly employees = "+hourlyEmployees.size());
    }
    /**
     * Display the type and number of each type of employee in the format:
     * <br>
     * The number of salaried employees = n <br>
     * The number of hourly employees = m <br>
     * Where n and m are the count of salaried and hourly employees,
     * respectively.
     */

//}
            /*
     Small file results:
            
     Total pay = 1568.4615384615383
     SalaryEmployee{WEEKS=52.0, annualRate=10000.0, extraPay=10.0}
     SalaryEmployee{WEEKS=52.0, annualRate=45000.0, extraPay=16.0}
     SalaryEmployee{WEEKS=52.0, annualRate=25000.0, extraPay=4.0}
     The number of salaried employees = 3
     The number of hourly employees = 0
     C:\CasePayroll/src/casepayroll/output2.txt
     */
    /*
     Larger file - partial results:
            
     Total pay = 390907.4230769234
            
     (lots of details)
            
     The number of salaried employees = 396
     The number of hourly employees = 407
     */
}


