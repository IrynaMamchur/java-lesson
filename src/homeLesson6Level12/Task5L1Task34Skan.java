package homeLesson6Level12;

import java.util.Scanner;

public class Task5L1Task34Skan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = scanner.nextBoolean();
        boolean isLorry = scanner.nextBoolean();
        int numberCar = scanner.nextInt();
        boolean examination = examination(isWeekend, isLorry, numberCar);

        if (examination) {
            System.out.println("Автомобиль не может заезжать в город");
        } if(isWeekend){
            if(isLorry) {
                if (numberCar % 2 == 0) {
                } else {
                    System.out.println("Автомобиль не может заезжать в город");
                }
            }else{
                if (numberCar %2 ==0){
                    System.out.println("Автомобиль может заезжать в город");
                } else{
                    System.out.println("Автомобиль не может заезжать в город");
                }

            }

        }else {
            if (isLorry) {
                if (numberCar % 2 == 0) {
                    System.out.println("Автомобиль может заезжать в город");
                } else {
                    System.out.println("Автомобиль может заезжать в город");
                }
            } else {
            }
            if (numberCar % 2 == 0) {
                System.out.println("Автомобиль не может заезжать в город");
            } else {
                System.out.println("Автомобиль может заезжать в город");
            }
        }
    }





    static boolean examination(boolean hasIsWeekend, boolean hasIsLorry, int numberCar) {
        return hasIsWeekend && hasIsLorry && numberCar % 2 == 0;
    }
}


