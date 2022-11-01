package homelesson12;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt(4) + 1;
        System.out.println(result);
        if (result==1){
            System.out.println("зима");
        } else if ( result == 2) {
            System.out.println("весна");
        } else if (result == 3) {
            System.out.println("лето");
        }else {
            System.out.println("осень");
        }
        }
}
