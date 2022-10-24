package homelesson10;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // распечатать треугольник из символов ^. Высоту выбирает пользователь. Например: высота = 5, на экране
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника");
        int high = scanner.nextInt();
        for (int i =1; i<=high; i++){
            for (int j = 1; j<= high -i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i *2 -1; j++){
                System.out.print("^");
            }
        System.out.println ("");
        }

    }
}
