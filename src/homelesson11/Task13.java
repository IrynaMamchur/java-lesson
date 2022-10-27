package homelesson11;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        //я сначала хотела сделать через Random, но не знаю, как задать в нем уменьшение,
        // поэтому решила задать сама значения. Можно было создать массив от 0 часов до 24 часов (то есть [23]),
        // тогда в подсчете часов стояло б i +1.
        // Возможно, мыслю примитивно, но в 3 ночи по другому не получается...


        int[] arr = {5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7};
        int firstNegativeTemperature  = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstNegativeTemperature) {
                firstNegativeTemperature = arr[i];
                count = count + i+ 8;
                break;
            }
        }
        System.out.println(firstNegativeTemperature);
        System.out.println(count);
    }
}
