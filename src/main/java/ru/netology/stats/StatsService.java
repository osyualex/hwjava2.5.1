
package ru.netology.stats;

public class StatsService {
    // 1 задание
    public static int amountAllMonth(int[] sales) {
        int amount = 0;
        for (int element : sales) {
            amount += element;
        }
        return amount;
    }

    // 2 задание
    public static int averageAmount(int[] sales) {
        int amount = amountAllMonth(sales);
        int averageAmount = amount / sales.length;
        return averageAmount;
    }
    // 3 задание

    public static int maxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month++;
        }
        return maxSalesMonth + 1;
    }
    // 4 задание

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    // 5 задание

    public static int salesBelowAverage(int[] sales) {
        int averageAmount = averageAmount(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageAmount) {
                month = month + 1;
            }
        }
        return month;
    }
    // 6 задание

    public static int salesAreAboveAverage(int[] sales) {
        int averageAmount = averageAmount(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                month = month + 1;
            }
        }
        return month;
    }
}

