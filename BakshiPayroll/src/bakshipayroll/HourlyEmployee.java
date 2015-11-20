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
public class HourlyEmployee extends AbstractEmployee {
    private double hourlyRate;
    private double extraHours;
    double OVERTIME = 1.5;
    double BASE_HOURS = 40.0;

    public HourlyEmployee(String name, String department, double hourlyRate, double extraHours) {
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.extraHours = extraHours;
    }
    
    @Override
    public double calcPay(){
        return hourlyRate * BASE_HOURS + hourlyRate * extraHours * OVERTIME; 
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourlyRate=" + hourlyRate + ", extraHours=" + extraHours + ", OVERTIME=" + OVERTIME + ", BASE_HOURS=" + BASE_HOURS + '}';
    }

    
    
}
