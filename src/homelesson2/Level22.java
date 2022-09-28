package homelesson2;

import java.util.Scanner;

public class Level22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите сторону a1 прямоугольника");
        int a1 = scan.nextInt();
        System.out.println("введите сторону a2 прямоугольника");
        int a2 = scan.nextInt();
        int P = a1*2 + a2*2;
        int S = a1*a2;
        System.out.println(+P);
        System.out.println(+S);
        System.out.print("Периметр прямоугольника со сторонами " +a1);
        System.out.print(" и " +a2);
        System.out.println(" равен " +P);
        System.out.print("Площадь прямоугольника со сторонами " +a1);
        System.out.print(" и " +a2);
        System.out.println(" равна " +S);



    }
}
