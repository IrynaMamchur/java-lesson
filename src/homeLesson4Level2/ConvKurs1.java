package homeLesson4Level2;

public class ConvKurs1 {

    static double amountEuro (double dollars, double exchange){
        return dollars *exchange;
    }
    static double amountDollars (double amountEuro, double exchange){
        return amountEuro/exchange;
    }

    public static void main(String[] args){
        ConvKurs1 convKurs1= new ConvKurs1();
        System.out.println(ConvKurs1.amountEuro(120,2));
        System.out.println(ConvKurs1.amountDollars(240,2));

    }
}
