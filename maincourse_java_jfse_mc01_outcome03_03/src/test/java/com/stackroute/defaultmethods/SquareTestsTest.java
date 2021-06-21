package com.stackroute.defaultmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestsTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(3);
    }

    @AfterEach
    void tearDown() {
        square = null;
    }

    @Test
    void GetSquareOfNumber() {
        assertEquals(9, square.getArea());
    }

    @Test
    void getPerimeterOfNumber() {
        assertEquals(12, square.getPerimeter());
    }
    @Test
    void getSquareOfNumberItFail()
    {
        square.setSide(5);
        assertNotEquals(18,square.getSide());
    }

}
