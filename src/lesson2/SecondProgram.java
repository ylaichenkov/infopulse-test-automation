package lesson2;

public class SecondProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Didok", 29);
        person1.printFullName();

        Person person2 = new Person("Mike", "Hike", 44);
        person2.printFullName();

        final Person person3 = person2;
        person2.lastName = "Dowelfrun";
        person3.printFullName();

        System.out.println(person3.lastName);
        person2.printFullName();

        String adminName = "Mike";

        if (adminName == person2.firstName) {
            System.out.println("Admin name is " + adminName);
        } else {
            System.out.println("unknown name");
        }
    }
}
