package homelesson10;

public class Task21 {
    public static void main(String[] args) {

        double percentageAnnual = 0.05;
        double deposit = 200;
        double amountFinalWithoutKap;
        double amountFinalWithKapInYear = 200;
        double amountFinalWithKapInYearWithKapOfMonth = 200;
        double amountFinalWithKapInMonth = 200;
        int numbersOfYears = 10;
        int numbersOfMonthInYear = 12;
        amountFinalWithoutKap = deposit * percentageAnnual * numbersOfYears + deposit;
        System.out.println("Сумма за 10 лет без капитализации составляет: " +amountFinalWithoutKap);
        for (int i = 1; i <= numbersOfYears; i++) {
            amountFinalWithKapInYear = amountFinalWithKapInYear + amountFinalWithKapInYear * percentageAnnual;
            System.out.println("Сумма с капитализацией за каждый год, но без учета месяцев составляет: " +amountFinalWithKapInYear);
        }
        for (int i = 1; i <= numbersOfYears; i++) {
            for (int j = 1; j <= numbersOfMonthInYear; j++) {
                amountFinalWithKapInMonth = amountFinalWithKapInMonth + amountFinalWithKapInMonth * percentageAnnual/numbersOfMonthInYear;
                System.out.println("Сумма с капитализацией помесячно составляет: " +amountFinalWithKapInMonth);
            }amountFinalWithKapInYearWithKapOfMonth = amountFinalWithKapInMonth;
            System.out.println("Сумма с капитализацией за каждый год с учетом помесячной капитализации составляет: " +amountFinalWithKapInYearWithKapOfMonth);
        }
    }
}
