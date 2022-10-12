package ckassWork;

import java.util.Scanner;

public class ClassWork2 {

    public static void main(String[] args) {

        boolean accept = accept();
        System.out.println(accept);
    }

    static boolean accept(){
        Scanner scanner = new Scanner(System.in);
        boolean hasRoof = scanner.nextBoolean();
        boolean hasWall = scanner.nextBoolean();
        int high = scanner.nextInt();
        return hasRoof && hasWall && high == 14;
    }
    //static boolean accept(boolean hasRoof, boolean hasWall, int high) {
      //  return hasRoof && hasWall && high == 14;
    //}

}
