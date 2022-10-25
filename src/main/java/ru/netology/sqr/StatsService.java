package ru.netology.sqr;

public class StatsService {

    // Сумма всех продаж
    public long calculateSumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    // Средняя сумма за месяц
    public long calcSalesAvg(long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    // Месяц с минимальной продажей
    public long calcMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    // Месяц с максимальной продажей
    public long calcMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    // кол-во месяцев ниже среднего
    public long calcBelowAvgSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < calcSalesAvg(sales)) {
                month += 1;
            }
        }
        return month;
    }

    // кол-во месяцев выше среднего
    public long calcAboveAvgSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > calcSalesAvg(sales)) {
                month += 1;
            }
        }
        return month;
    }
}