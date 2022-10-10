package homeLesson6Level12;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько Вам лет");
        int age = scanner.nextInt();
        boolean ageLimit = ageLimit(age);
        if (ageLimit)
        {
            System.out.println("Нельзя идти в кино");
        } else {
            System.out.println("Можно идти в кино");
        }
    }
        static boolean ageLimit(int age){
            return age <18;
        }

}
