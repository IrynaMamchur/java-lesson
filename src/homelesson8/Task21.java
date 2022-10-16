package homelesson8;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
       int productOfNumbers = 0;
       if (first<=second) {
           for (int i = 1; i <= first; i++) {
               productOfNumbers = productOfNumbers + second;
           }
           System.out.println(productOfNumbers);
       }else{
           for (int i = 1; i <= second; i++) {
               productOfNumbers = productOfNumbers + first;
           }
           System.out.println(productOfNumbers);
       }

    }
}
