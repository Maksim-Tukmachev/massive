package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void summ() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sum(arr);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void middleSum() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.middleSum(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerMiddleSum() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.lowerMiddleSum(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperMiddleSum() {
        SalesService service = new SalesService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.upperMiddleSum(arr);
        Assertions.assertEquals(expected, actual);
    }
}


