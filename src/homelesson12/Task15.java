package homelesson12;

public class Task15 {
    public static void main(String[] args) {

        String homeLessonStr = "Я всегда делаю домашнее задание";
        char y = ' ';
        int result = 1;
        for (int i = 0; i < homeLessonStr.length(); i++) {
            char fromHomelesson = homeLessonStr.charAt(i);
            if (fromHomelesson == y){
                result = result +1;
            }
        }
        System.out.println(result);
    }
}
