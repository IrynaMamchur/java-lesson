package homelesson8;

public class Task25 {
    public static void main(String[] args) {
        String numberStr = "354651";
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            if (i < 3) {
                int y;
                y = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
                sum = sum + y;
            }
            if (i > 2) {
                int x;
                x = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
                sum1 = sum1 + x;
            }

        }
        if (sum == sum1){
        System.out.println("да");}
        else{
            System.out.println("нет");
        }
    }
}