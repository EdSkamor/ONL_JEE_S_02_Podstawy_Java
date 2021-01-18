package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        System.out.print(calculateNetto(17.39));
    }

    public static double calculateNetto(double gross) {
        final double vat = 0.5;
        double result = gross - (gross * vat);
        return result;
}
}
