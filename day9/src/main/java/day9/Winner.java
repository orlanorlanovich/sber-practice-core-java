package day9;

public class Winner {
    private static String name;

    public static synchronized void setWinner(String name) {
        if (Winner.name == null) {
            Winner.name = name;
            System.out.println(name + " - WIN");
        }
    }

    public static String getWinner() {
        return name;
    }
}