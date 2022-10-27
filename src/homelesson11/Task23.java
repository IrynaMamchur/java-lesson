package homelesson11;

import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        //3) Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
        //Например, дан массив [3, 9, 8, 4, 5, 1].
        // Следует вывести числа 9 и 5, так как перед ними стоят соответственно числа 3 и 4, которые меньше их.
        Random random = new Random();
        int[] arr = new int[10];
        int maxBound = 100;
        int max;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = random.nextInt(maxBound);
        }
        System.out.println((Arrays.toString(arr)));

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                max = arr[i + 1];
                System.out.println(max);
            }

        }
    }
}

