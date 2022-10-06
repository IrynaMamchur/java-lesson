package homelesson5Level12;

public class Task2 {

    public static void main(String[] args){
        boolean a = false;
        boolean b = true;
        boolean isEdekaOpen = a || b;
        boolean isReweOpen = a||b;
        boolean canBay = isEdekaOpen || isReweOpen;
        if (canBay == true)
            System.out.println("Я могу купить еду это 'true'");


    }
}
