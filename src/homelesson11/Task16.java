package homelesson11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task16 {
    public static void main(String[] args) {
        //В массиве, состоящем из N вещественных элементов (вводится из консоли), после заполняется случайными числами,
        // найти максимальный по модулю элемент массива. Подсказка: модуль числа Math.abs(..)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        int max = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println((Arrays.toString(array)));
        for (int i = 0; i < array.length; i++) {
            int y = Math.abs(array[i]);
            if (y > max) ;
             max = y;

        }
        System.out.println("Максимальным по модулю числом массива является: " + max);

    }

    }

