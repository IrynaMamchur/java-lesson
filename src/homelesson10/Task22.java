package homelesson10;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number= -1;
        int digitNumber = 0;
        double average;
        while (number!=0) {
            System.out.println("Вводите числа");
            number = scanner.nextInt();
            digitNumber++;
            sum = sum + number;
        }
        average = sum/digitNumber;
        System.out.println("Общее количество введенных цифр составляет: " + digitNumber);
        System.out.println("Общая сумма введенных цифр составляет: " + sum);
        System.out.println("Среднее арифметическое введенных цифр составляет: " +average);

    }


    }

