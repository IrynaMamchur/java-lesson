package homelesson5Level12;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("введите температуру первой колбы");
        int temperature1;
        temperature1= scan.nextInt();
        System.out.println ("введите температуру второй колбы");
        int temperature2;
        temperature2= scan.nextInt();
        boolean a = false;
        boolean b = true;
        boolean deviceIsWorking = temperature1>100 && temperature2<100;
        System.out.println(deviceIsWorking);
    }
}
