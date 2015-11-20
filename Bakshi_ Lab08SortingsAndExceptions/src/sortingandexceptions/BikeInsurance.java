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
public class BikeInsurance extends VehicleInsurance{

    public BikeInsurance(String vehicleOwnerName, String vehicleNumber, String vehicleMake, int vehiclePurchaseYear, int totalYearsOfPayment, String telephoneNumber) {
        super(vehicleOwnerName, vehicleNumber, vehicleMake, vehiclePurchaseYear, totalYearsOfPayment, telephoneNumber);
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(java.lang.Object object){
        if(object == null){
            return false;
        }
        if(object == this){
            return true;
        }
        if(!(object.getClass() == this.getClass())){
            return false;
        }
        BikeInsurance objectTyoe = (BikeInsurance) object;
        return super.getVehicleOwnerName().equals(objectTyoe.getVehicleOwnerName());
    }
}
