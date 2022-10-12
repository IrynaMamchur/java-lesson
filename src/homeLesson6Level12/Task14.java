package homeLesson6Level12;

import java.util.Random;

public class Task14 {
    private static Task14 coinChecker;

    public static void check(boolean coin) {
        boolean eagle = true;
        boolean tails = false;
        if (coin == eagle) {
            System.out.println("true");
        } else if (coin == tails){
            System.out.println("false");
        }
    }
    public static void main (String[] args) {
        Task14 task14 = new Task14();
        Random random = new Random();
        boolean coin = random.nextBoolean();
        Task14.check(coin);
    }
    }
