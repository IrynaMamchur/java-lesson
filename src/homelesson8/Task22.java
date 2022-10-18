package homelesson8;

public class Task22 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        int numberOfOddNumbersInRange = 100/2;
        int meanOfOddNumbers = sum/numberOfOddNumbersInRange;
        System.out.println(meanOfOddNumbers);
    }

}
