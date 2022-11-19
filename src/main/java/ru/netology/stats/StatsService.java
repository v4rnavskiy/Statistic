package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long lowAverage(long[] sales) {
        long averageSale = averageSales(sales);
        int sum = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                sum++;
            }
        }
        return sum;
    }

    public long highAverage(long[] sales) {
        long averageSale = averageSales(sales);
        int sum = 0;
        for (long sale : sales) {
            if (sale >= averageSale) {
                sum++;
            }
        }
        return sum;
    }
}
