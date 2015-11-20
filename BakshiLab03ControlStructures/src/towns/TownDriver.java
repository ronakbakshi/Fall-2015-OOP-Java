/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towns;

/**
 *Implements Town class
 * @author Ronak Bakshi
 */
public class TownDriver {
    public static void main(String[] args)
    {
        Town instance1 = new Town();
        Town instance2 = new Town("Hyderabad",8100000,260);
        System.out.println("For town with no arg constructor:");
        System.out.println(instance1.getDensity());
        System.out.println("\nThe first year when the density is extremely high:"+instance1.getFirstHighestYear());
        
        System.out.println("\nFor Hyderabad with 8.1 million population and an area of 260.0 sq miles");
        System.out.println(instance2.getDensity());
        int x= instance2.getFirstHighestYear();
        System.out.println("\nThe first year when the density is extremely high:"+x);
        
    }
}
