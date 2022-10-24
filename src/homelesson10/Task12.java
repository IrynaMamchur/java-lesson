package homelesson10;

public class Task12 {
    public static void main(String[] args) {
        for (int i = 11; i <= 99; i++) {
            for (int j = 99; j > (11+ (100-10)/2); j--) {
                int first = i % 10;
                int firstSecond = j / 10 % 10;
                if (first == firstSecond) {
                    int second = i / 10 % 10;
                    int secondSecond = j % 10;
                    if (second == secondSecond) {
                        int resalt = (i + j) / 11;
                        if (resalt == 11) {
                            System.out.println(i + " " + j + " ");
                        }
                    }
                }
            }
        }
    }
}