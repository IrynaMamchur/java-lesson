package homeLesson6Level12;

import java.util.Scanner;

public class Task15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isLorry = scanner.nextBoolean();
            int numberCar = scanner.nextInt();
            boolean examination = examination(isLorry, numberCar);

            if (examination) {
                System.out.println("Автомобиль не может заезжать в город");
            } else {
                System.out.println("Автомобиль может заехать в город");

            }
        }

        static boolean examination (boolean hasIsLorry, int numberCar) {
            return hasIsLorry || numberCar % 2 != 0;
        }
    }

