/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakshioptionallabproject;

/**
 * This class contains the methods to get and set side, perimeter, area, diagonal length
 * @author Ronak Bakshi
 */
public class Square {
    private double side;
    /**
     * Constructor with one argument
     * @param side 
     */
    Square(double side)
    {
        this.side= side;
    }
    /**
     * Constructor with no arguments
     */
    Square()
    {
        side=0.0;
    }
    /**
     * gets the side of the square
     * @return the side of the square
     */
    public double getSide()
    {
        return side;
    }
    /**
     * sets the side of the square
     * @param side 
     */
    public void setSide(double side)
    {
        this.side=side;
    }
    /**
     * gets the area of the square
     * @return area
     */
    public double getArea()
    {
        return (side*side);
    }
    /**
     * calculates the diagonal length of square
     * @return diagonal length
     */
    public double calculateDiagonalLengthOfSquare()
    {
        return (side*(Math.sqrt(2.0)));
    }
    /**
     * calculates perimeter of square
     * @return perimeter
     */
    public double calculatePerimeterOfSquare()
    {
        return 4*side;
    }
}
