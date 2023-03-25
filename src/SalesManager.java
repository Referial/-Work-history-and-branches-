public class SalesManager {
    protected long[] sales;
    protected long sumNumber = 0;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageValue() {

        for (int x = 0; x < sales.length; x++){
            sumNumber = sumNumber + sales[x];
        }
        sumNumber = sumNumber - max() - min();
        long averageValue = sumNumber / (sales.length - 2);

        return averageValue;
    }
}