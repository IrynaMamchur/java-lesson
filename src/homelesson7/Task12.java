package homelesson7;

import java.util.Random;


public class Task12 {
    public static void main(String[] args){


        Random random = new Random();
        int result = random.nextInt(4) + 1;
        System.out.println(result);
        switch (result) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("весна");
                break;
            case 3:
                System.out.println("лето");
                break;
            default:
                System.out.println("осень");

        }
    }
}
