package homelesson2;

public class Level21 {
    public static void main(String[] args) {
    double PI= 3.14;
        int calories = 40;
    int radius;
    radius =14;
    double s1 = PI * radius * radius;
        double amount1 = s1 * calories;
    System.out.println(+amount1);
        radius =12;
        double s2 = PI * radius * radius;
        double amount2 = s2 * calories;
        System.out.println(+amount2);
        double difference = amount1 - amount2;
        System.out.println(+difference);
    }
}
