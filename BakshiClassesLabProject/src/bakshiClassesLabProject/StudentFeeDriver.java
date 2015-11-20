/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshiClassesLabProject;

import java.util.Scanner;

/**
 * Implements the StudentFee Class
 * @author Ronak Bakshi
 */
public class StudentFeeDriver {
    public static void main(String[] args){
        int hours;
        double feePerHour;
        double schAmount;
        double insuranceAnnum;
        
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the Number of Credit Hours Enrolled In:");
        hours = scannerObj.nextInt();
        System.out.print("Enter the fee amount per credit hour:");
        feePerHour = scannerObj.nextDouble();
        System.out.print("Enter the scholarship amount:");
        schAmount = scannerObj.nextDouble();
        System.out.print("Enter the health insurance amount per annum:");
        insuranceAnnum = scannerObj.nextDouble();
        
        StudentFee student1 = new StudentFee(hours,feePerHour,schAmount,insuranceAnnum);
        System.out.println("\nStudent1 Information");
        System.out.println(student1.toString());
        System.out.println("Student1 tuition fee: $"+student1.tuitionFee());
        System.out.println("Student1 Scholarship amount: $"+student1.getScholarshipAmount());
        System.out.println("Student1 health insurance amount for 4 months: $"+student1.quaterlyHealthInsurance());
        System.out.println("Student1 total fee: $"+student1.totalFee());
        System.out.println("Student1 minimum due amount: $"+student1.minimumDue());
        
        System.out.println("\nStudent2 Fee Information:");
        StudentFee student2 = new StudentFee();
        System.out.println(student2.toString());
        student2.setCreditHours(9);
        student2.setFeePerCreditHour(594.90);
        student2.setscholarshipAmount(1110.00);
        student2.setHealthInsurancePerAnnum(1202.10);
        
        System.out.println("New Student2 Information:");
        System.out.println(student2.toString());
        System.out.println("Student2 tuition fee: $"+student2.tuitionFee());
        System.out.println("Student2 Scholarship amount: $"+student2.getScholarshipAmount());
        System.out.println("Student2 health insurance amount for 4 months: $"+student2.quaterlyHealthInsurance());
        System.out.println("Student2 total fee: $"+student2.totalFee());
        System.out.println("Student2 minimum due amount: $"+student2.minimumDue());
    }
    
}
