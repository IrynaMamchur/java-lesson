package homelesson12;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        //1.	Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’}
        // и char[] second = {‘f’,’g’,’h’,’i’,’g’} создать массив соединяющий два этих массива в один новый
        char[] first = {'a','b','c','d','e'};
        char[] second = {'f','g','h','i','g'};
        char[] result = new char[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            result[i + first.length] = second[i];
        }
        System.out.println((Arrays.toString(result)));
    }
}
