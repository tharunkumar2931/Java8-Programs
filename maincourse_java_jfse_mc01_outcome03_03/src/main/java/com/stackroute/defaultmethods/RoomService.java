package com.stackroute.defaultmethods;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
    RoomService class has methods for creating room objects, comparing room and providing room summary.
 */
public class RoomService {
    public Square CreateSquare(String color,int side)
    {
        Square square=new Square(color,side);
        return  square;
    }
    public Rectangle createRectangle(String color,int length,int breadth)
    {
        Rectangle rectangle=new Rectangle(color,length,breadth);
        return  rectangle;
    }
    public static int compareRoomArea(Room one,Room two)
    {
        BiFunction<Double,Double,Integer> biFunction=(a,b)->(a<b)? -1:((a>b)? 1: 0);
        return  biFunction.apply(one.getArea(),two.getArea());
    }
    public static String getRoomSummary(Room room)
    {
        Function<Room,String> function=room1->room1.toString();
        return function.apply(room);
    }

}
