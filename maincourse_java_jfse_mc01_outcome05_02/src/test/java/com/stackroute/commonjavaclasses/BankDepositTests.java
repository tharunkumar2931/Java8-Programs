package com.stackroute.commonjavaclasses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Period;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankDepositTests {

    BankDeposit bankDeposit;

    @BeforeEach
    void setUp() {
        bankDeposit = new BankDeposit();
    }


    @Test
    void getMaturityDateFailTest () {
        Assertions.assertNotEquals("16/04/2021", bankDeposit.getMaturityDate("06/05/2021", Period.ofMonths(5)));
    }

    @Test
    void getMaturityDateNullTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getMaturityDate(null, Period.ofMonths(2));
        });
    }
    @Test
    void getMaturityDateEmptyTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getMaturityDate("", Period.ofMonths(2));
        });
    }



    @Test
    void getInvestmentDurationNullEmptyTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getInvestmentDuration("", null);
        });
    }

    @Test
    void getInvestmentDurationNullEmpty1TestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getInvestmentDuration(null, "");
        });
    }
}

