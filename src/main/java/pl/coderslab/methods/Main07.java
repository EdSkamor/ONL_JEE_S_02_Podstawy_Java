package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        System.out.print(checkEvenOdd(13));
    }
        public static String checkEvenOdd(int number) {
        String a = "even";
             if (number % 2 != 0){
            a = "odd"; }
            return a;
    }
}
