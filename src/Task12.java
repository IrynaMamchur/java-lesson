import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите первое число");
        int first = scanner.nextInt();
        System.out.println ("Введите второе число");
        int second = scanner.nextInt();
        int sum = 0;
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
    }


