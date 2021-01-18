package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        System.out.print(createName("Kuba", "Kojemski", "Skamor"));

    }
    public static String createName(String name, String surname, String nickname){
        String a = name + " " + surname + " " + nickname;

       return a;
    }

}
