/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 * sub class of Rectangle
 * @author Ronak Bakshi
 */
public class Square extends Rectangle {
    /**
    * Default constructor sets the length and breadth to (0.0, 0.0). 
    */
    public Square() 
    {
        super();
    }
    /**
     * Constructor with a single parameter sets the length and breadth values
     * @param lengthIn - double value
     */
    public Square(double lengthIn) 
    {
        super(lengthIn, lengthIn);
    }
    /**
     * This method does not return any value. This method Overrides setlength method in class Rectangle
     * @param lengthIn - double value
     */
    @Override
    public void setLength(double lengthIn)
    {
        super.setLength(lengthIn);
        super.setBreadth(lengthIn); 
    }
    /**
     * This method does not return any value. This method Overrides setBreadth method in class Rectangle. 
     * @param breadthIn - double value
     */
    @Override
    public void setBreadth(double breadthIn)
    {
        super.setLength(breadthIn);
        super.setBreadth(breadthIn);
    }
    /**
     * returns a String representing the square
     * @return String Value
     */
    @Override
    public String toString()
    {
        return (String.format("Length= %.2f",super.getLength()));
    }
    
}