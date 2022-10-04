package homeLesson4Level2;

import java.util.Scanner;

public class ConvKurs {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество долларов США");
        int dollars;
        dollars = scan.nextInt();
        System.out.println("введите курс доллара к евро");
        double exchange;
        exchange = scan.nextDouble();
        double euro = dollars * exchange;
        System.out.println("всего " + euro + " евро");

        System.out.println("введите количество евро");
        int euro1;
        euro1 = scan.nextInt();
        System.out.println("введите курс доллара к евро");
        double exchange1;
        exchange1 = scan.nextDouble();
        double dollars1 = euro1/exchange1;
        System.out.println("всего " + dollars1 + " долларов");
    }

}
