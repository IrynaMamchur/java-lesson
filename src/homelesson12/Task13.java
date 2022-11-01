package homelesson12;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        //1.	Сгенерировать случайное трехзначное число.
        // Вывести на экран само число, сумму и произведение его цифр.
        Random random = new Random();
        int number = random.nextInt(899) + 100;
        System.out.println(number);
        int sum = 0;
        int multiplication = 1;
        while (number != 0) {
            int currentDigit = number % 10;
            sum = sum + currentDigit;
            multiplication = multiplication * currentDigit;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.println(multiplication);
    }
}
