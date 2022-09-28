package homelesson2;

import java.util.Scanner;

public class Level23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите размер склада в м.кв.");
        int warehouseArea = scan.nextInt();
        System.out.println("введите ширину товара в м");
        int productWidth = scan.nextInt();
        System.out.println("введите длину товара в м");
        int productLength = scan.nextInt();
        int productAmount = warehouseArea / productWidth / productLength;
        System.out.println( +productAmount);
    }
}
