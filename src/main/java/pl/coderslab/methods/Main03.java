package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {
        System.out.print(convertToUsd(3));
    }

    public static double convertToUsd(double pln) {
        final double usdRate = 4.04;
       double result = pln * usdRate;
        return result;

    }
}
