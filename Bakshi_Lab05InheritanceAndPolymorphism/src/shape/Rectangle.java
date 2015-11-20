/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *A sub class of Shape class
 * @author Ronak Bakshi
 */
public class Rectangle extends Shape {
    private double length;
    private double breadth;
    /**
     * The no-arg constructor sets the length and breadth values to 0.0 and 0.0 respectively.
     */
    public Rectangle()
    {
        length = 0.0;
        breadth = 0.0;
    }
    /**
     * 2 argument constructor used to initialize the length and breadth of the Rectangle.       
     * @param lengthIn - double value
     * @param breadthIn - double value
     */
    public Rectangle(double lengthIn, double breadthIn)
    {
        length = lengthIn;
        breadth = breadthIn;
    }
    /**
     * sets the length of rectangle
     * @param lengthIn - double value
     */
    public void setLength(double lengthIn)
    {
        length = lengthIn;
    }
    /**
     * sets the breadth of rectangle
     * @param breadthIn - double value
     */
    public void setBreadth(double breadthIn)
    {
        breadth = breadthIn;
    }
    /**
     * gets the length of the rectangle
     * @return the length in double
     */
    public double getLength() 
    {
        return length;
    }
    /**
     * gets the breadth of the rectangle
     * @return the breadth in double
     */
    public double getBreadth() 
    {
        return breadth;
    }
    /**
     * calculates the area of the rectangle
     * @return area in double
     */
    @Override
    public double calcArea()
    {
        return length*breadth;
    }
    /**
     * calculates the perimeter of the rectangle
     * @return perimeter in double
     */
    @Override
    public double calcPerimeter()
    {
        return (2*(length+breadth));
    }
    /**
     * This method returns a String representing the Rectangle
     * @return string representation
     */
    @Override
    public String toString()
    {
        return (String.format("Length= %.2f, Breadth= %.2f",length,breadth));
    }
}
