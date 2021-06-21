package com.stackroute.defaultmethods;
import java.util.function.Supplier;

/*
Square class defines the properties of a Square object and implements the default methods of Room interface
 */
public class Square extends AbstractRoom{
    private int side;
    public  int getSide()
    {
        return side;
    }
    public void setSide(int side)
    {
        this.side=side;
    }
    public Square() {
    }
    public Square(String colour) {
        super(colour);
    }
    public Square(int side) {
        this.side = side;
    }
    public Square(String colour,int side)
    {
        super(colour);
        this.side=side;
    }
    @Override
    public double getArea()
    {
        return (side*side);
    }
    @Override
    public double getPerimeter()
    {
        return(4*side);
    }
    @Override
    public String toString()
    {
        Supplier<String> supplier=Square.super::toString;
        return supplier.get()+"Square{" +
                "side="+side+"Area="+(int)getArea()+"Perimeter=" +(int)getPerimeter()+'}';

    }
}




