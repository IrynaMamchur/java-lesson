package homelesson5Level12;

public class Task1 {
    public static void main(String[] args){

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = !isRain && isWeekend;
        if (canWalk == true)
            System.out.println("Canwalk");



    }
}
