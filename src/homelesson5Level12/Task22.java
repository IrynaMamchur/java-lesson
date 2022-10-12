package homelesson5Level12;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println ("введите первое число");
        int a;
        a = scan.nextInt();
        System.out.println ("введите второе число");
        int b;
        b = scan.nextInt();
        System.out.println(isDividedForAAndB(+a, +b));

    }
    static boolean isDividedForAAndB(int a, int b) {
        return a % b == 0;
    }
}
