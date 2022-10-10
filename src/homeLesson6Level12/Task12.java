package homeLesson6Level12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите год");
        int year = scan.nextInt();
        boolean highYearCalculation = highYearCalculation(year);
        if (highYearCalculation) {
            System.out.println("Этот год " + year + " высокосный");
        } else {
            System.out.println("Этот год " + year + " невысокосный");
        }
    }
        static boolean highYearCalculation(int year){
            return year % 4 == 0;

    }
}
