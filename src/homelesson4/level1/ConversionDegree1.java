package homelesson4.level1;

public class ConversionDegree1 {


    static double degrees(double first, double second, double three) {
        return (first - second) / three;
    }
    static double faringate(double first, double second, double three) {
        return first * second + three;
    }

    public static void main(String[] args) {
        ConversionDegree1 conversionDegree1 = new ConversionDegree1();
        System.out.println(ConversionDegree1.degrees(60, 32, 1.8));
        System.out.println(ConversionDegree1.faringate(10,1.8,32));
    }

}
