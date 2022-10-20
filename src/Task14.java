import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        long number = scanner.nextLong();
        if (number <= 0) {
            System.out.println("Вы ввели некорректное число");
            return;
        }
        long sum = 0;
        while (number > 0) {
            long figure = number % 10;
            sum = sum + figure;
            number /= 10;
        }
        System.out.println(sum);
    }
}
// Для введённого пользователем с клавиатуры натурального числа
// посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).