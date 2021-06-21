package com.stackroute.methodreference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Write test cases for positive and negative scenarios*/
public class NewCalculatorUtilityTests {
    NewCalculatorUtility newCalculatorUtility;

    @BeforeEach
    public void setUp() throws Exception {
        newCalculatorUtility = new NewCalculatorUtility();
    }
    @AfterEach
    public void tearDown(){
        newCalculatorUtility=null;
    }

    @Test
    public void givenTwoIntegersWhenMultiplyThenShouldReturnProduct() {
        Assertions.assertEquals( 20.0, newCalculatorUtility.getProductResult(5, 4));
        Assertions.assertEquals( 25.0, newCalculatorUtility.getProductResult(5, 5));


    }
    @Test
    public void TwoIntegerReturnPower() {
        Assertions.assertEquals( 64.0, newCalculatorUtility.getPowerResult(4, 3));
        Assertions.assertEquals( 3125.0, newCalculatorUtility.getPowerResult(5, 5));
    }
    @Test
    public void MultiplyWithZeroValue(){
        Assertions.assertEquals(0,newCalculatorUtility.getProductResult(0,1));
    }
    //for negative test cases
    @Test
    public void NegativeValue(){
        Assertions.assertEquals(-10,newCalculatorUtility.getProductResult(2,-5));
    }

    @Test
    public void  TwoIntegerReturnPowerFail()
    {
        Assertions.assertNotEquals(25,newCalculatorUtility.getPowerResult(5,5));
        Assertions.assertNotEquals( 56,newCalculatorUtility.getPowerResult(6,9));

    }
    @Test
    public void twoIntegerReturnProductFail()
    {
        Assertions.assertNotEquals(56,newCalculatorUtility.getProductResult(8,8));
        Assertions.assertNotEquals(100,newCalculatorUtility.getProductResult(9,8));
    }
    @Test
    public void NegativeValues(){
        Assertions.assertNotEquals(10,newCalculatorUtility.getProductResult(2,-5));
    }

}








