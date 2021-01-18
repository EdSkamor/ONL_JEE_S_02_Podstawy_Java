package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
    }

    public static String footballWin (int firstMatchAGoalsInA, int firstMatchBGoalsInA, int secondMatchAGoalsInB, int secondMatchBGoalsInB) {

        int a = firstMatchAGoalsInA + secondMatchAGoalsInB;
        int b = firstMatchBGoalsInA + secondMatchBGoalsInB;

        if (a > b) {
//            Zespół A ma więcej goli ogółem
            int c = 1;}
        else if (a < b){
//            Zespół B ma więcej goli ogółem
            int d = 1; }
        else {
//            remis ogólny
            int h = 0; }

        if (firstMatchBGoalsInA > secondMatchAGoalsInB){
//            B więcej goli na wyjeździe
            int e = 1; }
        else if (firstMatchBGoalsInA < secondMatchAGoalsInB){
//            A więcej goli na wyjeździe
            int f = 1; }
        else{
//            remis wyjazdowy;
            int g = 0; }

//        Teraz poprzez sprawdzenie sumy spawdzę kto wygrał mecz, jeżeli drużyna ma gółem więcej goli dostaje 1 pkt jeżeli ma więcej na wyjeździe 1 pkt, w wypadku remisu 0 pkt

        if (c+f == 2)

            return;
    }
}
