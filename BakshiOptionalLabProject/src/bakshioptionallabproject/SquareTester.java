/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshioptionallabproject;

import java.util.Scanner;

/**
 *This class is used to test the implementation of class Square.
 * @author Ronak Bakshi
 */
public class SquareTester {
    /**
     * This method prints the side, area, diagonal length and perimeter of the specified Square object using four output messages.
     * @param outputSquare - The square object to output to the console.
     */
    public static void outputSquare(Square outputSquare){
        //side, area, diagonal length and perimeter 
        System.out.println("The side of the square is:"+outputSquare.getSide());
        System.out.println("The area of the square is:"+outputSquare.getArea());
        System.out.println("The diagonal length of the square is:" +outputSquare.calculateDiagonalLengthOfSquare());
        System.out.println("The perimeter of the square is:"+outputSquare.calculatePerimeterOfSquare());
        
    }
    /**
     * This method instantiates and outputs two different Square objects.
     * @param args 
     */
    public static void main(String[] args){
        // instantiate a Square class using the default constructor and name it as square
        Square square = new Square();
        
        //   Print the side of the square
        System.out.println("Initial side of the square is "+square.getSide());
        
        //   set the side of the square with given value
        square.setSide(5.0);
        
        
        //   Call the method outputSquare() using square object
        outputSquare(square);       
        
        //   Read the side of the square from the console using Scanner
        Scanner scanObject = new Scanner(System.in);
        System.out.print("Please enter the side of the square:");
        double side = scanObject.nextDouble();
        
        //   Set the side of the square with new value using setter
        square.setSide(side);

        //   Call the method outputSquare() using square object
        outputSquare(square);
    }
}
