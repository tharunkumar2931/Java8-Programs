## Problem Statement: Interface with default methods

This exercise should be completed using Test Driven Development Technique.

  - Write Test classes in TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below
  
```
        Room is an Interface having default methods, AbstractRoom is an abstract class of type Room, Square and Rectangle class inherits AbstractRoom
        
        Square class toString() format for sample data
            Square [colour=brown, side=10]
        	
        Rectangle class toString() format for sample data
            Rectangle [colour=brown, length=10, breadth=20]
```
            
            
  Class AbstractRoom 
  
    - This class implements Room Interface  
    - Declare a private member variable
        - colour: String
    - Implement the parameterized constructor.  
    - This class must be implemented using TDD for the following methods
            + getColour(): String
            + setColour(String colour): void
    - Override toString() method.
    
  Class Rectangle 
  
    - This class extends AbstractRoom
    - Declare private member variables
            - breadth: int
            - length: int
    - Implement the parameterized constructor.  

    - This class must be implemented using TDD for the following methods
  
        + getBreadth(): int
        + setBreadth(int breadth): void
        + getLength(): int
        + setLength(int length): void
    - Override the following methods
        + getArea(): double
            return area of rectangle
        + getPerimeter(): double
            return perimeter of rectangle
    - Override toString() method.

  
  Interface Room must be implemented using TDD for the following methods
  
        + getArea(): double   
        + getPerimeter(): double

  Class RoomService must be implemented using TDD for the following methods
       
       + createSquare(String color, int side): Square
            - Create a Square object and return it
       + createRectangle(String color, int length, int breadth): Rectangle
            - Create a Rectangle object and return it
       + compareRoomArea(Room one, Room two): int
            - This method should be static.
            - Method should return 0 when areas of room are equal. Should return 1, if the one's area is greater than two's area,
                      else should return -1.
       + getRoomSummary(Room room): String
            - This method should be static.
            - Should return the toString() for the room appended with Rounded area and perimeter.
   
  Class Square 
  
      - This class extends AbstractRoom
      - Declare a private member variable
              - side: int
      - Implement the parameterized constructor.  
      - This class must be implemented using TDD for the following methods     
            + getSide(): int
            + setSide(int side): void
            
      - Override the following methods
            + getArea(): double
                return area of square
            + getPerimeter(): double
                return perimeter of square
      - Override toString() method.
               
      
- Write the test cases in the class `AbstractRoomTests`.    
- Minimum test cases expected: 3
- Write the test cases in the class `RectangleTests`.    
- Minimum test cases expected: 6
- Write the test cases in the class `RoomServiceTests`.    
- Minimum test cases expected: 7
- Write the test cases in the class `RoomTests`.    
- Minimum test cases expected: 2
- Write the test cases in the class `SquareTests`.    
- Minimum test cases expected: 5

- Test cases should be written for positive and negative scenarios, wherever applicable
- Test methods should follow (given...ThenShould) naming convention.
    - For example: `givenTwoIntegersWhenAddedThenShouldReturnSum`. If the method name is very long,then you can skip `when` part.
- Test coverage should be 100%

## Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding

## Code coverage 

 - Run mvn test, the JaCoCo code coverage report will be generated at target/site/jacoco/*
 - Open the target/site/jacoco/index.html file, review the code coverage report 
 
            - Green – Code is tested or covered.
            - Red – Code is not tested or covered.
            - Yellow – Code is partially tested or covered.
 - Make sure lines coverage must meet the minimum 90%
