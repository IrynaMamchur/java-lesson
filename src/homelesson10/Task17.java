package homelesson10;

public class Task17 {
    public static void main(String[] args) {

        String homeLessonStr = "Я всегда делаю домашнее задание";
        char y = 'а';
        String newLitera = "А";
            String result = " ";
            for (int i = 0; i < homeLessonStr.length(); i++) {
                char fromHomelesson = homeLessonStr.charAt(i);
                if (fromHomelesson != y){
                    result = result + homeLessonStr.charAt(i);
                } else {
                    result = result + newLitera.charAt(0);
                }

            }
            System.out.println(result);
        }


    }

