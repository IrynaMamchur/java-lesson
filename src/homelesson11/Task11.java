package homelesson11;

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random=new Random();
        int [] arr = new int[10];
        int maxBound=100;
        for (int i =0; i< arr.length; i++){
            arr[i] = random.nextInt(maxBound);
        }
        int firstPositiveNumber = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > firstPositiveNumber){
                firstPositiveNumber = arr[i];
                count = count +i;
                break;
            }
        }
        System.out.println((Arrays.toString(arr)));
        System.out.println(firstPositiveNumber);
        System.out.println(count);

    }
}
