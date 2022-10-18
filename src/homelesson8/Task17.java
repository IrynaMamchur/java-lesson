package homelesson8;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое однозначное число");
        int first = scanner.nextInt();
        if (first <1 || first>9){
            System.out.println ("Вы ввели невалидное число");
            return;
        }
        System.out.println("Введите второе однозначное число");
        int second = scanner.nextInt();
        if (second <1 || second>9){
            System.out.println ("Вы ввели невалидное число");
            return;
        }
        System.out.println("Введите результат умножения первого числа на второе");
        int productOfNumbers = scanner.nextInt();
        if (first*second == productOfNumbers){
            System.out.println("Ваш ответ верен");
        } else{
            int productOfNumbersTrue = first*second;
            System.out.println("Ваш ответ неверен. Правильный ответ: " +productOfNumbersTrue);
        }
    }
}
