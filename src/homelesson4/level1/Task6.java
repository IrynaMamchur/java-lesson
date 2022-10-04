package homelesson4.level1;

public class Task6 {

    static double amountFirst(double PI, double radius, double calories) {
        return PI *radius *radius *calories;
    }
    static double amountSecond(double PI, double radiusSecond, double calories) {
        return PI *radiusSecond *radiusSecond *calories;
    }
  static double difference(double amountFirst, double amountSecond) {
      return amountFirst - amountSecond;
  }

    public static void main(String[] args){
Task6 task6 = new Task6();
        double amountFirst = Task6.amountFirst(3.14,14,40);
        double amountSecond = Task6.amountSecond(3.14, 12,40);
        System.out.println(+amountFirst);
System.out.println(+amountSecond);
System.out.println(Task6.difference(amountFirst, amountSecond));

    }
}
