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
public class CarInsurance extends VehicleInsurance {

    public CarInsurance(String vehicleOwnerName, String vehicleNumber, String vehicleMake, int vehiclePurchaseYear, int totalYearsOfPayment, String telephoneNumber) {
        super(vehicleOwnerName, vehicleNumber, vehicleMake, vehiclePurchaseYear, totalYearsOfPayment, telephoneNumber);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        CarInsurance objectType = (CarInsurance) object;
        return super.getVehicleMake().equals(objectType.getVehicleMake());
    }
}
