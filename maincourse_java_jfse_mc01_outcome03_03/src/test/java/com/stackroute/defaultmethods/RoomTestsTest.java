package com.stackroute.defaultmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTestsTest {
    Room room;

    @BeforeEach
    void setUp(){
    room= new Square(2);
    }

    @AfterEach
    void tearDown() { room=null;
    }
    @Test
    void getArea(){
        Assertions.assertEquals(4.0,room.getArea());
    }
    @Test
    void getPerimeter(){
        Assertions.assertNotEquals(8.0,room.getArea());
    }

}