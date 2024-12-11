package ru.netology.stats;

public class StatsService {

    // Сумма продаж
    public int sumSales(long[] sales) {
        long allSales = 0;
        for (long s : sales) {
            allSales += s;
        }
        return (int) allSales;
    }
/*      int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales += (int) sales[i];
        }
        return allSales;
     }
*/

    // Средняя сумма продаж в месяц
    public int averageSales(long[] sales) {
        long averageValue = 0;
        for (long s : sales) {
            averageValue += s;
        }
        return (int) (averageValue / sales.length);
    }

/*      long averageValue = 0;
        for (int i = 0; i < sales.length; i++) {
            averageValue +=  sales[i];
        }
        averageValue = averageValue / sales.length;
        return (int) averageValue;
    }
*/

    //Месяц с максимальными продажами

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= (int) sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //  Месяц с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= (int) sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев с продажами ниже среднего
    public int belowAverageMonths(long[] sales) {

        int count = 0;
        int middleValue = (int) averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleValue) {
                count++;
            }
        }
        return count;
    }

    // Количество месяцев с продажами выше среднего
    public int aboveAverageMonths(long[] sales) {

        int count = 0;
        int middleValue = (int) averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleValue) {
                count++;
            }
        }
        return count;
    }
}
