package homelesson8;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i=1; i<=number; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
