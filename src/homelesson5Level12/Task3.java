package homelesson5Level12;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println ("введите число");
        int a;
        a = scan.nextInt();
        System.out.println(isDividedFor7And5(+a));

    }
    static boolean isDividedFor7And5(int val){
        return val % 7 == 0 && val %5==0;
    }
}
