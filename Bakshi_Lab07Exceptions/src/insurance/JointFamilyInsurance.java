/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 *All Implemented Interfaces are Health, Insurance
 * @author Ronak Bakshi
 */
public class JointFamilyInsurance extends FamilyHealthInsurance{
    /**
     * It calls the super class constructor.
     * @param noOfPersons - the total number of persons.
     */
    public JointFamilyInsurance(int noOfPersons){
        super(noOfPersons);
    }
}
