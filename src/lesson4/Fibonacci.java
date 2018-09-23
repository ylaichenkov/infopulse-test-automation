package lesson4;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbers(1);
    }

    public static void printFibonacciNumbers(int length) {
        int counter = length;
        int firstNumber = 0;
        int secondNumber = 1;

        if (counter < 1) {
            System.out.println("Please enter a positive number more than 0");
        } else {

            for (int i = 1; i <= counter; ++i) {

                System.out.print(firstNumber + " ");

                int result = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = result;
            }
        }
    }
}
