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
public abstract class AbstractEmployee {
    private String name;
    private String department;
    
    public abstract double calcPay();

    public AbstractEmployee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "AbstractEmployee{" + "name=" + name + ", department=" + department + '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}
