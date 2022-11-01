package homelesson12;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String pswdStr = scanner.next();
            for (int i = 1; i < pswdStr.length(); i++)
            {
                int lenght = pswdStr.length();
                if (lenght != 8) {
                    System.out.println("Ваш пароль не соответствует требованиям, поскольку в нем количество цифр не ровно 8");
                    return;
                }
            }

            String str1 = pswdStr.toLowerCase();
            if (str1.equals(pswdStr) == true) {
                System.out.println("Ваш пароль не соответствует требованиям, поскольку в нем отсутствуют заглавные буквы");
                return;
            }
            String str2 = pswdStr.toUpperCase();
            if (str2.equals(pswdStr) == true) {
                System.out.println("Ваш пароль не соответствует требованиям, поскольку в нем отсутствуют строчные буквы");
                return;

            }

        for (int i = 0; i < pswdStr.length(); i++) {
            int num = Character.getNumericValue(pswdStr.charAt(i));
            if (num < 10) {
                System.out.print("Ваш пароль идеален");
                return;
            }

        }
        System.out.println("Ваш пароль не соответствует требованиям, поскольку в нем отсутствуют цифры");
        }

    }




