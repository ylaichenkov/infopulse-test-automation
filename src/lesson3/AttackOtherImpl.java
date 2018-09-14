package lesson3;

public class AttackOtherImpl implements Attack {

    String attack;

    public AttackOtherImpl(String attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {
        System.out.println(attack + " and " +  attack);
    }

    @Override
    public void move() {
        System.out.println("Go go go");
    }
}
