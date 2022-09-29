package homelesson3;

import java.util.Scanner;

public class Level22homelesson3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Назовите Ваше имя");
        String nameStr = scan.next();
        System.out.print("Ваше имя начинается с буквы ");
System.out.println(nameStr.charAt(0));
    }
}
