import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberNatur = random.nextInt(999);
        if (numberNatur<=0){
            return;
        }
        System.out.print("Наибольшей цифрой в числе " + numberNatur);
        int largestFigure = 0;
        while (numberNatur >0){
            int number = numberNatur %10;
            if (largestFigure<= number){
                largestFigure = number;
            }
            numberNatur/=10;
        }

System.out.println(" является цифра " + largestFigure);

    }
}
