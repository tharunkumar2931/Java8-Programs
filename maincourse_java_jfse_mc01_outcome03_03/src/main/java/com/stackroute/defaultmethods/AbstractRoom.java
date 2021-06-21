package com.stackroute.defaultmethods;

/*
    Abstract class AbstractRoom defines the common properties and methods for objects of type Room
 */
public abstract class AbstractRoom implements Room{
    private String colour;
    public String getColour()
    {
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }
    public AbstractRoom() {
    }
    public AbstractRoom(String colour)
    {
        this.colour=colour;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return "AbstractRoom{"+"colour='"+colour+'\''+'}';
    }
}