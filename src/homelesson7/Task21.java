package homelesson7;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите сумму денег");
        int amountOfMoney = scanner.nextInt();
        if (amountOfMoney<1 || amountOfMoney>9999){
            System.out.println("невалидная сумма");
            return;
        }
        if (amountOfMoney % 10 >= 2 && amountOfMoney % 10 <= 4) {
            System.out.println(amountOfMoney + " доллара");
        } else if (amountOfMoney % 10 == 1) {
            System.out.println(amountOfMoney + " доллар");
        } else {
            System.out.println(amountOfMoney + " долларов");

        }
//фантазии, как вывести всю сумму словами у меня за одну ночь не хватило...
    }
}