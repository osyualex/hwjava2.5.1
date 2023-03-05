package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    public void getAmountSalesAllMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountAllMonth(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void getAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageAmount(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);

    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);

    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 7;
        int actualBelowAverage = service.salesBelowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);

    }

    @Test
    public void salesAreAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.salesAreAboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, expectedAboveAverage);

    }
}