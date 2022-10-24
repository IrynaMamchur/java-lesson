package homelesson10;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberNatur = scanner.nextInt();
        while (numberNatur > 1) {
            if (numberNatur != 1) {
                if (numberNatur % 2 == 0) {
                    numberNatur = numberNatur / 2;
                } else if (numberNatur % 2 != 0) {
                    numberNatur = (numberNatur * 3 + 1) / 2;
                }
            }
        }
        System.out.println("Гипотеза Сиракуз верна. Все числа приходят к цифре: " + numberNatur);
    }
}

