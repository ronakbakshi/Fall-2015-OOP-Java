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
public class ApartmentInsurance extends HouseInsurance {

    public ApartmentInsurance(String ownerName, String apartmentNumber, int totalYearsOfPayment, String ssn, String location) {
        super(ownerName, apartmentNumber, totalYearsOfPayment, ssn, location);
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
        ApartmentInsurance objectType = (ApartmentInsurance) object;
        return super.getLocation().equals(objectType.getLocation());
    }
}
