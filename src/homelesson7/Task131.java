package homelesson7;

import java.util.Random;

public class Task131 {
    public static void main(String[] args){
        Random random = new Random();
        int month = random.nextInt(12) + 1;
        System.out.println(month);
        if (month >=3 || month <=5){
            System.out.println("весна");
        } else if (month >=6 || month <=8){
            System.out.println("лето");
            } else if (month >=9 || month <=11){
                System.out.println("осень"); }
        else { System.out.println("зима");
            }

        }
    }
