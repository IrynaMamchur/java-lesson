package homelesson4.level1;

import java.util.Scanner;

public class ConversionDegree {

    public static void main (String[] args){
        double constSecond = 1.8;
        int constFirst = 32;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите величину градусов по Цельсию");
        double degrees  = scan.nextDouble();
        double farengateResult = (degrees - constFirst) / constSecond;

        System.out.println("введите величину градусов по Фарингейту");
        double farengate  = scan.nextDouble();
        double degreesResult = farengate * constSecond + constFirst;

        System.out.println("величина градусов по Фарингейту составляет " + farengateResult);
        System.out.println("величина градусов по Цельсию составляет " + degreesResult);




    }
}
