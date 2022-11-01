package homelesson12;

import java.util.Arrays;

public class Task181 {
    public static void main(String[] args) {
        //2.	Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
        //•	значение каждой ячейки массива (пройтись циклом)
        //•	значение каждой ячейки всего массива с конца в начало
        //•	сумму значений всех ячеек
        //•	напечатать кого в массиве больше, четных или нечетных?
        int[] arr = {56, 34, 3, 12, 78, 45, 34, 23, 89, 4};
        int sum = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;

        for (int val : arr) {
            System.out.println(val);
            sum += val;
        }
        System.out.println(sum);
        for (int i = 0; i< arr.length; i++) {
                if (arr [i] %2 == 0) {
                    numberOfEven++;
                } else {
                    numberOfOdd++;
                }}

                if (numberOfEven < numberOfOdd) {
                    System.out.println("больше нечетных чисел");
                } if (numberOfEven == numberOfOdd) {
                    System.out.println("Количество четных и нечетных чисел одинаковое");
                } else {
                    System.out.println("больше четных чисел");
                }

        for (int i = 0; i< arr.length/2; i++){
                int j = arr[i];
                arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
            }
        System.out.println((Arrays.toString(arr)));
    }

            }






