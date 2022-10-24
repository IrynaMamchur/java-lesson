package homelesson10;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int m = scanner.nextInt();
        System.out.println("Введите второе число");
        int n = scanner.nextInt();
        if (m==n){
            System.out.print("Вы ввели невалидные числа");
            return;
        }
        if (m<n) {
            for (int i = m; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println(i + " и " + j);
                    }
                }
            }
        } else{
            for (int i = n; i <= m; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println(i + " и " + j);
                    }
                }
            }
        }
    }
}