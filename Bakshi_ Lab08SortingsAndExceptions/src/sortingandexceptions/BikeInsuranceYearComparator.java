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
public class BikeInsuranceYearComparator implements java.util.Comparator<BikeInsurance> {

    public BikeInsuranceYearComparator() {
    }

    public int compare(BikeInsurance o1,BikeInsurance o2){
        return o1.getVehiclePurchaseYear() - o2.getVehiclePurchaseYear();
    }

}
