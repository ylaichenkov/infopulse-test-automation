package lesson3;

public class Program {
    public static void main(String[] args) {
        Bee bee1 = new Bee (1.2, new AttackImpl("STING", "flying"));
        bee1.move();
        bee1.attack();

        System.out.println("-----------");

        Bee bee2 = new Bee ("Green", 1.7);
        bee2.move();
        bee2.attack();
    }
}
