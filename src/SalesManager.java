public class SalesManager {
    protected int[] sales;

    protected int sumNumber = 0;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int averageValue() {

        for (int x = 0; x < sales.length; x++){
            sumNumber = sumNumber + sales[x];
        }
        sumNumber = sumNumber - max() - min();
        int averageValue = sumNumber / (sales.length - 2);

        return averageValue;
    }
}