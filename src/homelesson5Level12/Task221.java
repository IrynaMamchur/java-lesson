package homelesson5Level12;


public class Task221 {



    public static void main(String[] args){

        Task221 task221 = new Task221();
        System.out.println(task221.isDividedForAAndB(16, 3));

    }
    static boolean isDividedForAAndB(int a, int b) {
        return a % b == 0;
    }

}
