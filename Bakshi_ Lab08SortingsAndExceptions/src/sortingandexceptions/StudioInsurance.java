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
public class StudioInsurance extends HouseInsurance {

    public StudioInsurance(String ownerName, String apartmentNumber, int totalYearsOfPayment, String ssn, String location) {
        super(ownerName, apartmentNumber, totalYearsOfPayment, ssn, location);
    }

    /**
     *
     * @param object
     * @return
     */
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
        StudioInsurance objectType = (StudioInsurance) object;
        return super.getApartmentNumber().equals(objectType.getApartmentNumber());
    }
}
