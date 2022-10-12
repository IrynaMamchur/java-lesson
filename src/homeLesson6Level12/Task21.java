package homeLesson6Level12;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        boolean comparison1 = first > second && first>third;
        boolean comparison2 = first <=third && second>third;
        boolean comparison3 = first <= second && second<third;
        boolean comparison4 = first >= second && first<third;
        boolean comparison5 = first == second && first == third;
        boolean comparison6 = first > second && first == third;
        boolean comparison7 = first < second && second == third;
        boolean comparison8 = first == second && second > third;

        if (comparison1) {
            System.out.println("максимальное число " + first);
            } else if (comparison2){
                    System.out.println("максимальное число " + second);
                } else if (comparison3) {
            System.out.println("максимальное число " + third);
        } else if (comparison4) {
            System.out.println("максимальное число " + third);
        } else if (comparison5) {
            System.out.println("все числа равны");
        } else if (comparison6) {
            System.out.print("максимальные числа " + first + " и " + third);
        } else if (comparison7) {
            System.out.print("максимальные числа " + second + " и " + third);
        } else if (comparison8) {
            System.out.print("максимальные числа " + second + " и " + first);
        }
        }

    }






