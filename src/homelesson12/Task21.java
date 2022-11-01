package homelesson12;

import java.util.Arrays;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        //1.	Дан массив arr[] и целое число K , где K меньше размера массива, задача состоит в том,
        // чтобы найти K -й наименьший элемент в данном массиве. Дано, что все элементы массива различны.
        // Распечатать индекс и число. Подсказка: сначала отсортировать, и после найти элемент с инлексом K
        Random random = new Random();
        int[] arr = new int[20];
        int maxBound = 100;
        int k = random.nextInt(14) + 1;
        System.out.println(k);
        int result;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxBound);
        }
        System.out.println(Arrays.toString(sortArray(arr)));
        for (int i = 0; i < arr.length; i++) {
        if (i==k){
            result = arr[i];
            System.out.println("index: " + k + ", val: " + result);
        }
            }
        }

    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int swapVal = arr[arr.length - i -1];
            arr[arr.length - i -1] = arr[maxIndex];
            arr[maxIndex] = swapVal;
        }
        return arr;
    }
}



