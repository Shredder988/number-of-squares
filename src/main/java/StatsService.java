public class StatsService {

    public long sum(long[] sales) { //сумма всех продаж
        long ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
    }

    public long average(long[] sales) { //средняя сумма продаж
        long sum = sum(sales);
        return sum / 12;
    }

    public int maxSalesMonth(long[] sales) { //номер месяца, в котором был максимум продаж
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    public int minSalesMonth(long[] sales) { //номер месяца, в котором был минимум продаж
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini;
    }

    public long lowerAverage(long[] sales) {
        long averageMonthSales = average(sales);
        long numberMonth = 0;
        for (long sale : sales) {
            if (sale < averageMonthSales) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public long upperAverage(long[] sales) {  //Кол-во месяцев, в которых продажи были выше среднего
        long averageMonthlySales = average(sales);
        long numberMonth = 0;
        for (long sale : sales) {
            if (sale > averageMonthlySales) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}
