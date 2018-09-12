package lesson2;

public class Person {
    String firstName;
    String lastName;
    int age;
    private static int count = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    void printCurrentCounter() {
        println("Current counter number is " + count);
    }
    void printFullName() {
        println("Name: " + firstName + "\n" + "Surname: " + lastName);
    }
    static void printCount() {
        println("" + count);
    }
    static {
        println("Class was initialized");
    }
    {
        println("Person " + count + " was created.");
    }
    private static void println(String out) {
        System.out.println(out);
    }
}
