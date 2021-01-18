package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args){
    System.out.print(maxOfthree(5,3,4));
    }
    public static double maxOfthree(double nr1, double nr2, double nr3) {

        double a = Math.max(nr1, nr2);
        double b = Math.max(a, nr3);
        return b;
    }
}
