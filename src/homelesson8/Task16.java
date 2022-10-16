package homelesson8;

public class Task16 {
    public static void main(String[] args) {
        int productOfNumbers = 1;
        for (int i=13; i<100; i++){
            if (i %13 ==0 && i%2!=0){
                productOfNumbers = productOfNumbers *i;
            }
        }
        System.out.println(productOfNumbers);
    }
}
