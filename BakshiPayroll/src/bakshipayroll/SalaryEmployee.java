/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshipayroll;

/**
 *
 * @author Ronak Bakshi
 */
public class SalaryEmployee extends AbstractEmployee {
    private double annualRate;
    private double extraPay;
    double WEEKS = 52.0;

    public SalaryEmployee(String name, String department, double annualRate, double extraPay) {
        super(name, department);
        this.annualRate = annualRate;
        this.extraPay = extraPay;
    }

    @Override
    public double calcPay() {
        return annualRate/WEEKS + extraPay;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" + "annualRate=" + annualRate + ", extraPay=" + extraPay + ", WEEKS=" + WEEKS + '}';
    }
    
}
