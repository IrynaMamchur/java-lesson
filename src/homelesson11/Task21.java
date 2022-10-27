package homelesson11;

import java.util.Arrays;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        //Все элементы массива поделить на значение наибольшего элемента этого массива.
        //Задача состоит из двух подзадач:
        //•	Поиск максимума.
        //•	Деление на него элементов массива.
        Random random=new Random();
        double [] arr = new double[10];
        int maxBound=100;
        for (int i =0; i< arr.length; i++){
            arr[i] = random.nextInt(maxBound);
        }
        System.out.println((Arrays.toString(arr)));
        double  max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        double [] arrOne = new double [100];
        for (int i = 0, j = 0; i < arr.length; i++,j++) {
            arrOne[j] = arr[i] / max;
        }

        System.out.println((Arrays.toString(arrOne)));

    }
}
