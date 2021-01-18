package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        System.out.print(checkMaturity(10));
    }
    public static boolean checkMaturity(int age) {
        boolean isMature = false;
        if (age > 18){
            isMature = true;}
        return isMature;
    }
}
