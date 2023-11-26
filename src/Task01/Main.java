package Task01;

import java.util.Arrays;

public class Main {
    static double[] sharePrices;
    static double minPrice;
    static double maxPrice;

    public static void main(String[] args) {

        sharePrices = new double[]{34.22, 12.34, 11.74, 22.45, 19.55};
        System.out.println("Share price for each day: USD " + Arrays.toString(sharePrices));

        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int i = 0; i < sharePrices.length - 1; i += 1) {
                if (sharePrices[i] > sharePrices[i + 1]) {
                    double temp = sharePrices[i];
                    sharePrices[i] = sharePrices[i + 1];
                    sharePrices[i + 1] = temp;
                    sorted = true;
                }
            }
        }
        System.out.println("Increase in share price: USD " + Arrays.toString(sharePrices));

        minPrice = sharePrices[0];
        maxPrice = sharePrices[0];

        for (double price : sharePrices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Minimum share price: USD " + minPrice);
        System.out.println("Maximum share price: USD " + maxPrice);
    }
}
