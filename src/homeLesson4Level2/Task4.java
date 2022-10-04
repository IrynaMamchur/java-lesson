package homeLesson4Level2;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {
        String iStudyJStr = "I study Java!";
        System.out.println(iStudyJStr.substring(7 ));
        iStudyJStr = new String(iStudyJStr.substring(7 ));
        System.out.println(iStudyJStr.charAt(3));
    }

}
