package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcSalesAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calcSalesAvg(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calcMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calcMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcBelowAvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calcBelowAvgSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAboveAvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calcAboveAvgSales(sales);
        assertEquals(expected, actual);
    }
}