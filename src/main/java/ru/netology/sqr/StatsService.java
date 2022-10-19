package ru.netology.sqr;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSum(int[] sales) {
        return calcSum(sales) / sales.length;

    }

    public int calcFindMax(int[] sales) {
        int findMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMax] <= sales[i]) {
                findMax = i;
            }
        }
        findMax +=1;
        return findMax;
    }

    public int calcFindMin(int[] sales) {
        int findMin = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMin] >= sales[i]) {
                findMin = i;
            }
        }
        findMin += 1;
        return findMin;
    }

    public int calcUnAverage(int[] sales) {
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcUpAverage(int[] sales) {
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}