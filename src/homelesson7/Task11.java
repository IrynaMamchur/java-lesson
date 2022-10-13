package homelesson7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int namberOfFlat = scanner.nextInt();
        if (namberOfFlat <=20){
            System.out.println("Это первый подъезд");
        } else if (namberOfFlat <=48){
            System.out.println("Это второй подъезд");
        } else if (namberOfFlat<=90){
            System.out.println("Это третий подъезд");
        }else if (namberOfFlat<=0 ||namberOfFlat >90){
            System.out.println("Вы ввели неправильное значение.Введите номера от 1 до 90");
        }
    }
}
