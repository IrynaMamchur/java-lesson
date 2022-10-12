package homelesson5Level12;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");
        String lineStr = scan.nextLine();
        boolean a = false;
        boolean b = true;
        boolean equality = (lineStr.length()) > 10;
        if(equality==true)
            System.out.println ("Длина фразы больше 10");
        if(equality==false)
            System.out.println ("Длина фразы меньше 10");

    }
}
//напишите метод который считывает с коносли строку и проверяет длина введенной строки больше 10 или нет