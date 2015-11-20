/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 * sub class of Shape class
 * @author Ronak Bakshi
 */
public class Circle extends Shape {
    private double radius;
    /**
     * Default constructor sets the radius value to 0.0
     */
    public Circle() 
    {
        radius = 0.0;
    }
    /**
     * The one-arg constructor is used to initialize the radius of the circle.
     * @param radiusIn - double value
     */
    public Circle(double radiusIn) 
    {
        radius = radiusIn;
    }
    /**
     * sets the radius of the circle
     * @param radiusIn - double value
     */
    public void setRadius(double radiusIn)
    {
        radius = radiusIn;
    }
    /**
     * gets the radius of the circle
     * @return radius in double
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     * calculates the area of the circle
     * @return area in double
     */
    @Override
    public double calcArea()
    {
        return Math.PI * radius * radius;
    }

    /**
     * calculates the perimeter of circle
     * @return perimeter in double
     */
    @Override
    public double calcPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    /**
     * returns a String representing the circle.
     * @return String
     */
    @Override
    public String toString()
    {
        return (String.format("Radius= %.2f",radius)); 
    }
}
