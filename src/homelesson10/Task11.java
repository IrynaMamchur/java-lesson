package homelesson10;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        for (int i =1000; i < 10_000; i++) {
         int first = i % 10;
         int second = i/10 % 10;
            if (first !=second) {
                    int third = i / 100 % 10;
                if (third != first && third !=second) {
                    int forth = i / 1000 % 10;
                    if (forth != first && forth != second && forth != third) {
                        System.out.println (i);
                    }
                }
            }
        }

    }
}

