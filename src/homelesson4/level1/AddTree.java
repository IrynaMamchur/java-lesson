package homelesson4.level1;

import java.util.Scanner;

public class AddTree {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите величину first");
        int first  = scan.nextInt();
        System.out.println("введите величину second");
        int second  = scan.nextInt();
        System.out.println("введите величину third");
        int third  = scan.nextInt();
        int amount = first +second + third;
        System.out.println(+amount);


    }
}
