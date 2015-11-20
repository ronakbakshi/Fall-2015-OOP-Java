/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Random;

/**
 *
 * @author Ronak
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //Question 1
        String name= "onlienonlieeonlinnonlineonliionlline";
        System.out.println("The actual string is "+name);
        int index = name.indexOf("online");
        System.out.println(index);
        String fullname = name.substring(index, index + 6);
        System.out.println(fullname);
        System.out.println("Northwest "+fullname);
        
        //Question 2
        //a
        Double myDoubleValue=16.00;
        Double squareroot = Math.sqrt(myDoubleValue);
        System.out.println("The square root of 16 is "+squareroot);
        
        //b
        Double myDoubleValue1=90.00;
        Double myDoubleValue2=20.00;
        Double sine1 = Math.sin(myDoubleValue1);
        Double tan1 = Math.tan(myDoubleValue1);
        Double sine2 = Math.sin(myDoubleValue2);
        Double tan2 = +Math.tan(myDoubleValue2);
        System.out.println("The sine of first variable is "+sine1);
        System.out.println("The tangent of first variable is "+tan1);
        System.out.println("The sine of second variable is "+sine2);
        System.out.println("The tangent of second variable is "+tan2);
        
        //c
        
        int myIntNumber1=5;
        int myIntNumber2=3;
        double result = Math.pow(myIntNumber1, myIntNumber2);
        System.out.println("5 raised to the power of 3 is "+result);
        
        //Question 3
        //a
        Random randomObj = new Random();
        randomObj.setSeed(26l);
        int random1 = randomObj.nextInt(200);
        int random2 = randomObj.nextInt(200);
        int random3 = randomObj.nextInt(200);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        //b
        // values do not change
        
        //c
        Random randomObj2 = new Random();
        int random11 = randomObj2.nextInt(200);
        int random12 = randomObj2.nextInt(200);
        int random13 = randomObj2.nextInt(200);
        System.out.println(random11);
        System.out.println(random12);
        System.out.println(random13);
        
        //yes the values change
        
        //d
        // The values change in c but not in b because we have not set the seed in c whereas we have set in b
        
        //Question 4
        
        String uniname1="  Northwest Missouri State University  ";
        String uniname2 = uniname1.trim();
        String uniname3 = uniname2.substring(0, uniname2.indexOf(" "));
        String uniname4 = uniname2.substring((uniname3.length())+1, uniname2.length());
        String uniname5 = uniname4.substring(0,uniname4.indexOf(" "));
        String uniname6 = uniname4.substring((uniname5.length())+1, uniname4.length());
        String uniname7 = uniname6.substring(0,uniname6.indexOf(" "));
        String uniname8 = uniname6.substring((uniname7.length())+1, uniname6.length());
        String uniname9 = (uniname3.substring(0,1)+uniname5.substring(0,1)+uniname7.substring(0,1)+uniname8.substring(0,1));
        System.out.println(uniname9);
        
        //Question 5
        
        String sentence = "With great power often comes great confusion";
        String word1 = sentence.substring(0, sentence.indexOf(" "));
        sentence = sentence.substring(word1.length()+1,sentence.length());
        String word2 = sentence.substring(0,sentence.indexOf(" "));
        sentence = sentence.substring(word2.length()+1,sentence.length());
        String word3 = sentence.substring(0,sentence.indexOf(" "));
        System.out.println(word3.toUpperCase());
    }
    
}
