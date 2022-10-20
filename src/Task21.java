public class Task21 {
    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;
        int numberOfLifts = 0;
        int maximumLift = 0;
        while (maximumLift<H){
            numberOfLifts++;
            maximumLift = maximumLift + N;
            if (maximumLift< H){
                maximumLift = maximumLift - M;
            }
            // Я поняла так, что цель достигнута не тогда, когда лифт поднимется/опустится/остановится,
            // а когда поднимется и пересечет высоту Н (без опускания вниз).
        }
        System.out.println(numberOfLifts);

    }
}
