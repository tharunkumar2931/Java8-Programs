package com.stackroute.defaultmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractRoomTestsTest {
    AbstractRoom abstractRoom;

    @BeforeEach
    void setUp() {abstractRoom=new Square("Yellow");
    }

    @AfterEach
    void tearDown() { abstractRoom=null;
    }
    @Test
    void setColoursGetColour()
    {
        assertEquals("Yellow",abstractRoom.getColour());
    }
    @Test
    void setColourNotGetColour()
    {
        assertNotEquals("yellow",abstractRoom.getColour());
    }
    @Test
    void setColourWithSpecialCharFail()
    {
        abstractRoom.setColour("Ya@123");
        assertNotEquals("red",abstractRoom.getColour());
    }
}