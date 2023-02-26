package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesSum = 180;
        int actualSalesSum = service.allSalesSum(sales);
        Assertions.assertEquals(expectedSalesSum, actualSalesSum);
    }
    @Test
    public void averageSumMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSumMonth = 15;
        int actualAverageSumMonth = service.averageSumMonth(sales);
        Assertions.assertEquals(expectedAverageSumMonth, actualAverageSumMonth);
    }
    @Test
    public void
    monthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }
    @Test
    public void
    monthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMinSale = 9;
        int actualMonthMinSale = service.minSales(sales);
        Assertions.assertEquals(expectedMonthMinSale, actualMonthMinSale);
    }
    @Test
    public void
    monthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.monthsSalesBelowAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }
    @Test
    public void
    monthsSalesOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.monthsSalesOverAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }

}