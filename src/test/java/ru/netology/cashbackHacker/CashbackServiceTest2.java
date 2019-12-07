package ru.netology.cashbackHacker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest2 {

    @Test
    void shouldCalculateCashbackIfBoundaryIs1000ElseMore1000() {

        CashbackService service = new CashbackService();
        int boundary = 1000;
        int expectedResult = 100;
        int actualResult = boundary*10/100;

        assertEquals(expectedResult, actualResult);
    }
}