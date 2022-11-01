package homelesson12;

import java.util.Scanner;


public class Task23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, если Вам надо подсчитать площадь прямоугольника");
        System.out.println("Введите 2, если Вам надо подсчитать площадь треугольника");
        System.out.println("Введите 3, если Вам надо подсчитать площадь круга");
        int choice = scanner.nextInt();
        if (choice !=1 || choice !=2 || choice !=3) {
            System.out.println("Вы ввели невалидное значение");
            return;
        }
        if (choice == 1) {
            System.out.println("Введите две стороны прямоугольника");
            double firstSide = scanner.nextDouble();
            double secondSide = scanner.nextDouble();
            if (firstSide <= 0 || secondSide <= 0) {
                System.out.println("Вы ввели невалидное значение");
                return;
            } else {
                double area = firstSide * secondSide;
                System.out.println("Площадь прямоугольника со сторонами " + firstSide + " и " + secondSide + " равна " + area);
            }
        } else if (choice ==2) {
            System.out.println("Введите три стороны треугольника");
            double firstSide = scanner.nextDouble();
            double secondSide = scanner.nextDouble();
            double thirdSide = scanner.nextDouble();
            if (firstSide <= 0 || secondSide <= 0 || thirdSide<=0) {
                System.out.println("Вы ввели невалидное значение");
                return;
            } else {
                double s = (firstSide + secondSide +thirdSide)/2;
                double area = Math.sqrt(s * (s - firstSide) * (s-secondSide) * (s-thirdSide));
                System.out.println("Площадь треугольника со сторонами " + firstSide + ", " + secondSide + " и " + thirdSide + " равна " + area);
            }
        } else{
            System.out.println("Введите диаметр круга");
            double diameter = scanner.nextDouble();
            if (diameter <= 0) {
                System.out.println("Вы ввели невалидное значение");
                return;
            }else{
                double pi = 3.14;
                double area = pi * diameter * diameter/4;
                System.out.println("Площадь круга с диаметром " + diameter + " равна " + area);
            }
    }
    }
}
