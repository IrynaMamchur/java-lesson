package homelesson10;

import java.util.Scanner;

public class Task151 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int primeNumbers = 0;
        int amountPrimeNumbers = 0;
        int number = 2;
        while (number >= 2) {
            System.out.println("Вводите числа");
            number = scanner.nextInt();
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    break;
                }
                    if (primeNumbers != number){
                        amountPrimeNumbers = amountPrimeNumbers + 1;}
                        if (number % i != 0) {
                    primeNumbers = number;
                }
            }

        }
        System.out.print(+ amountPrimeNumbers);
    }

}


