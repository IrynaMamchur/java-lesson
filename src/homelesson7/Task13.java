package homelesson7;

import java.util.Random;

public class Task13 {
    public static void main(String[] args){
        Random random = new Random();
        int month = random.nextInt(12) + 1;
        System.out.println(month);
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            default: System.out.println("осень");


        }
    }
}



