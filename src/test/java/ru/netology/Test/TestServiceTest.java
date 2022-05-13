package ru.netology.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {
    @Test
    void shouldcalcSum() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldcalcAverage() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calcAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void amtUnderAverage() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amtUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void amtOverAverage() {
        TestService service = new TestService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amtOverAverage(sales);

        assertEquals(expected, actual);
    }
}
