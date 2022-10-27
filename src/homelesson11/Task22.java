package homelesson11;

import java.util.Arrays;
import java.util.Random;

public class Task22 {
    public static void main(String[] args) {


        Random random = new Random();
        int[] arr = new int[10];
        int maxBound = 100;
        int numderMoreAverage;
        int sum = 0;
        int amount = 0;
        int average;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxBound);
            sum = sum + arr[i];
            amount++;}
            System.out.println((Arrays.toString(arr)));
            System.out.println(" Общая сумма : " + sum);
            average = sum / amount;
            System.out.println("Среднее арифметическое: " + average);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                numderMoreAverage = arr [i];
                System.out.println("Элемент массива, превышающий среднее арифметическое: " + numderMoreAverage);
            }
        }
    }
 }


