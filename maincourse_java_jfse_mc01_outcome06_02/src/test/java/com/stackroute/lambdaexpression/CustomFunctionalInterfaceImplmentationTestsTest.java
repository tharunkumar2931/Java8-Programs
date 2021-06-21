package com.stackroute.lambdaexpression;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomFunctionalInterfaceImplementationTestsTest {
    private CustomFunctionalInterfaceImplementation customFunctionalInterfaceImplementation;
    private String MSG_01="Return the string value";

    @BeforeEach
    void setUp() {customFunctionalInterfaceImplementation=new CustomFunctionalInterfaceImplementation();
    }

    @AfterEach
    void tearDown() {customFunctionalInterfaceImplementation=null;
    }
    @Test
    void TwoIntergerCubeOfNumberReturnOutput()
    {
        Assertions.assertEquals( 27, customFunctionalInterfaceImplementation.cubeOfNumber.doJob(3));
        Assertions.assertEquals( 125,customFunctionalInterfaceImplementation.cubeOfNumber.doJob(5));
       Assertions.assertEquals(216,customFunctionalInterfaceImplementation.cubeOfNumber.doJob(6));

    }
    @Test
    void givenNegativeNumberReturnCube()
    {
        Assertions.assertNotEquals(17,customFunctionalInterfaceImplementation.cubeOfNumber.doJob(4));
        Assertions.assertNotEquals(9,customFunctionalInterfaceImplementation.cubeOfNumber.doJob(7));
    }

    @Test
    void  givenStringMixedCase()
    {

        Assertions.assertEquals("THArun",customFunctionalInterfaceImplementation.changedCase.doJob("thaRUN"));
    }
    @Test
    void givenStringToCaptialCase()
    {
        Assertions.assertEquals("THARUN",customFunctionalInterfaceImplementation.changedCase.doJob("tharun"));
    }
    @Test
    public void givenZeroReturnZero()
    {
        Assertions.assertEquals("stack",customFunctionalInterfaceImplementation.changedCase.doJob("STACK"));
    }






}
