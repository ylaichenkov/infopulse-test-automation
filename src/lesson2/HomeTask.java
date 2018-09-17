package lesson2;

public class HomeTask {
    public static void main(String[] args) {
        eachNth("Miracle", 2);

    }

    public static void eachNth(String str, int number) {
        for (int i = 0; i <= str.length(); i += number) {
            System.out.print(str.charAt(i));
        }
    }
}
