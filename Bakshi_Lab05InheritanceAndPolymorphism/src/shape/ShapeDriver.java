/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ronak Bakshi
 */
public class ShapeDriver {
    public static void main(String[] args) throws FileNotFoundException 
    {
//     declare and initialize a Scanner object named scanner to 
//     read from the file shapes.txt  
        Scanner scannerObj = new Scanner(new File("Shapes.txt"));
//     declare four double variable such as length, breadth, radius, and side 
//     to store the scanned values
        double length;
        double breadth;
        double radius;
        double side;
//     while shapes.txt has more data 
        while(scannerObj.hasNextDouble())
        {
//           Read in the data from the text file and store those values in 
//           respective variable.
//           The values in the text file are of double type.       
//           The first value in the text file is the length of the rectangle, 
            length = scannerObj.nextDouble();
//           second value is the breadth of the rectangle, 
            breadth = scannerObj.nextDouble();
//           third value is the side of the square,
            side = scannerObj.nextDouble();
//           and the fourth value is radius of the circle.       
            radius = scannerObj.nextDouble();
//           Create an object for Rectangle and pass the length and breadth 
//           values as arguments.
            Rectangle rectObj = new Rectangle(length,breadth);
//           Create an object for Circle and pass the radius as argument
            Circle circleObj = new Circle(radius);
//           Create an object for Square and pass the side as argument
            Square squareObj = new Square(side);
//           Print the toString, Area and Perimeter of the Rectangle, 
            System.out.print("Rectangle: "+rectObj.toString());
            System.out.println(String.format("; Area: %.2f; Perimeter: %.2f",rectObj.calcArea(),rectObj.calcPerimeter()));
//           Square and Circle respectively.
            System.out.print("Square: "+squareObj.toString());
            System.out.println(String.format("; Area: %.2f; Perimeter: %.2f",squareObj.calcArea(),squareObj.calcPerimeter()));
            
            System.out.print("Circle: "+circleObj.toString());
            System.out.println(String.format("; Area: %.2f; Perimeter: %.2f",circleObj.calcArea(),circleObj.calcPerimeter()));
            System.out.println("\n");
//               
        }     
//      scanner.close();
        scannerObj.close();
    }     
}
