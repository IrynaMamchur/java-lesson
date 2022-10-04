package homeLesson4Level2;

public class Task2 {
    static double add(double first, double second) {
        return first + second;
    }
    static double divicion(double first, double second) {
        return first / second;
    }
    static double minus (double first, double second) {
        return first - second;
    }
    static double multiplication(double first, double second) {
        return first * second;
    }

    public static void main(String[] args){
Task2 task2 = new Task2();
System.out.println(Task2.add(6,2.5));
        System.out.println(Task2.divicion(6,2.5));
        System.out.println(Task2.minus(6,2.5));
        System.out.println(Task2.multiplication(6,2.5));
    }
}
