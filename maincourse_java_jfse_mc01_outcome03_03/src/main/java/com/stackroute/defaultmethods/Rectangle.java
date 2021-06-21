package com.stackroute.defaultmethods;
import java.util.function.Supplier;

/*
Rectangle class defines the properties of a Rectangle object and implements the default methods of Room interface
 */
public class Rectangle extends AbstractRoom {
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public void setLength(int length)
    {
        this.length=length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int breadth)
    {
        this.breadth=breadth;
    }
    public  Rectangle() {
    }
    public Rectangle(String colour)
    {
        super(colour);
    }
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(String colour,int length,int breadth)
    {
        super(colour);
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double getArea()
    {
        return(length*breadth);
    }
    @Override
    public double getPerimeter()
    {
        return (2*(length+breadth));
    }
    @Override
    public String toString()
    {
        Supplier<String> supplier=Rectangle.super::toString;
        return supplier.get()+"Rectangle{"+
                "length="+length +" , breadth="+ breadth+ "Area ="+(int)getArea()+"Perimeter="+(int)getPerimeter()+'}';
    }

}

