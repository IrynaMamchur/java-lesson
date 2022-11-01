package homelesson12;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        //1.	Вводятся длины трех сторон предполагаемого треугольника.
        // Определить, может ли существовать треугольник с такими сторонами при условии что,
        // треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.
        // Например 10 11 12 существует 10 11 22 не существует - так как 22 больше чем сумма 10 и 11
        Random random=new Random();
        int [] arr = new int[3];
        int maxBound=100;
        for (int i =0; i< arr.length; i++) {
            arr[i] = random.nextInt(maxBound);
        }
        System.out.println((Arrays.toString(arr)));
        int max =0;
        int sum = 0;
            for (int i =0; i< arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        System.out.println (max);
                for (int i =0; i< arr.length; i++){
                    if (arr[i] < max) {
                        sum = sum + arr [i];
                    }
                    }
                System.out.println (sum);

            if (max>sum){
                System.out.println ("Такой треугольник существует");
            } else{
                System.out.println ("Такого треугольника не существует");
            }
        }
    }

