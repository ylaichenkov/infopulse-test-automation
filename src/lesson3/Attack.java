package lesson3;

interface Attack {
    void attack();
    default void move() {
        System.out.println("Moving...");
    }
}
