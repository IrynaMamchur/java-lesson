package homeLesson6Level12;



import java.util.Scanner;

public class Task13 {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько Вы хотите купить печенья");
        double amountCookie = scan.nextInt();
        System.out.println("Сколько у Вас денег");
        double amountMoney = scan.nextInt();
        boolean calculationOfNumberOfCookies = calculationOfNumberOfCookies (amountCookie, amountMoney);
        if (calculationOfNumberOfCookies) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя ");
        }
    }
         static boolean calculationOfNumberOfCookies (double amountCookie, double amountMoney){
            return  (amountMoney / amountCookie) >= 0.5;}


}
