package ru.netology.cashbackHacker;

public class CashbackService {

    public static void main(String[] args) {

        CashbackService service = new CashbackService();
        int boundary = 1000;
        int expectedResult = 100;
        int actualResult = boundary*10/100;

        System.out.println(actualResult);
        System.out.println(actualResult == expectedResult);
    }
}

