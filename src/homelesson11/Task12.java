package homelesson11;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
       // 3) Создайте массив А[1..100]
        // с помощью генератора случайных чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.
        Random random=new Random();
        int [] arr = new int[100];


        for (int i =0; i< 100; i++) {
            arr[i] = random.nextInt();
        }
            System.out.println(Arrays.toString(arr));

        int[] arrOne = new int[100];
        for (int i = 0, j = 0; i < 100; i++,j++) {
            arrOne[j] = arr[i] *2;

        }
        System.out.println(Arrays.toString(arrOne));
    }
}
