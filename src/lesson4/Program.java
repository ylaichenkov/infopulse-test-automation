package lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {


        FileReader fr = null;
        File f = new File("/wrong/path/name");
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            simpleWaiter(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("STARTED");
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println("EXCEPTION ---->" + e.toString());
        } finally {
            System.out.println("FINISHED");
        }
    }

    public static void simpleWaiter(long timeout) throws InterruptedException {
        Thread.sleep(timeout);
    }
}
