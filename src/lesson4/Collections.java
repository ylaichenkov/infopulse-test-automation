package lesson4;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        if (list.remove(new Integer(6))) {
            System.out.println("Value has been removed");
        } else {
            list.add(6);
        }

        System.out.println(list);

        printEachIterator(list);
        printEach(list);
    }

    private static void printEachIterator(ArrayList<Integer> arr) {
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printEach(ArrayList<Integer> arr) {
        for (Integer integer: arr) {
            System.out.println(integer);
        }
    }
}
