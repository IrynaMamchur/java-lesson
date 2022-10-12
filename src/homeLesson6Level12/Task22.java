package homeLesson6Level12;

import java.util.Random;

public class Task22 {

    public void check (int seconds){
        int amountOfHours = seconds/3600;
        System.out.println(seconds);
        System.out.println("До конца рабочего дня осталось полных рабочих часов:" + amountOfHours);


    }

    public static void main(String[] args){
        Task22 task22 = new Task22();
        Random random = new Random();
        int seconds = random.nextInt(28800);
        task22.check(seconds);
        }
}
