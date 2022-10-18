package homelesson8;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int primeNumber = scanner.nextInt();

        for (int i = 2; i < primeNumber; i++) {
            if (primeNumber % i == 0) {
                System.out.println(primeNumber + " не является простым числом");
                return;
            }
        }
        System.out.println(primeNumber + " является простым числом");
    }
}


