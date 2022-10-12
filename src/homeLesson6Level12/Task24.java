package homeLesson6Level12;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args){

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
        if (examination) {
            System.out.println("Грузовым автомобилям воспрещен въезд в город в выходной день");
        } if(isWeekend){
            if(isLorry) {
                if (numberCar % 2 == 0) {
                } else {
                    System.out.println("Грузовым автомобилям воспрещен въезд в город в выходной день");
                }
            }else{
                if (numberCar %2 ==0){
                } else{
                    System.out.println("Легковые автомобили с нечетными номерами не могут заезжать в город в выходной день");
                }

            }

        }else {
            if (isLorry) {
                if (numberCar % 2 == 0) {
                } else {
                }
            } else {
            }
            if (numberCar % 2 == 0) {
                System.out.println("Легковые автомобили с четными номерами не может заезжать в город в будний день");
            } else {
            }
        }


    }





        static boolean examination(boolean hasIsWeekend, boolean hasIsLorry, int numberCar) {
            return hasIsWeekend && hasIsLorry && numberCar % 2 == 0;
        }
    }

