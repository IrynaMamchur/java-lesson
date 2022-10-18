package homelesson8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый год");
        int firstYear = scanner.nextInt();
        System.out.println("Введите второй год");
        int secondYear = scanner.nextInt();
        double amountLeapYear = (secondYear - firstYear)/4;
        if (amountLeapYear % 4 ==0) {
            System.out.println("Количество високосных годов между " +firstYear + " и " +secondYear + " равно "+ amountLeapYear);
        } else {
            int amountLeapYearInt = (int) amountLeapYear + 1;
            System.out.println("Количество високосных годов между " +firstYear + " и " +secondYear + " равно "+ amountLeapYearInt);

        }


}

    }

// 1)  пользователь вводит с консоли (Scanner) 2 числа (года) написать программу,
// которая считает сколько годов между двумя числами високосные Например (2000,2022) -> 6