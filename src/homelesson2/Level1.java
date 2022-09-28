package homelesson2;

public class Level1 {
    public static void main(String[] args) {
        //       задача 1
        //              637/16 = 39 (13= D)
//        39/16 = 2 (7)
//        2/16 = 0 (2)
//        27D
//        2 x 16x16 +7x16+13x 1= 637

//       задача 2
 //       637/2 = 318 (1)
 //       318/2=159 (0)
 //       159/2 = 79 (1)
 //       79/2= 39 (1)
 //       39/2 = 19 (1)
 //       19/2= 9 (1)
 //       9/2 = 4 (1)
 //       4/2 = 2 (0)
 //       2/2= 1(0)
//        ½ = 0 (1)
 //       1001111101
 //       1 x1 + 0x2 x1 +1x 2(2) + 1x2 (3) + 1x 2(4)+ 1x 2(5) + 1x 2(6) + 0x 2 (7) + 0 x 2(8) + 0 x 2(9) = 1 + 0 + 4 + 8 + 16 + 32 + 64 + 0 + 0 + 512 = 637

        //       задача 3
 int n = 5;
 int sk = n * n;
 System.out.println(sk);

        //       задача 4
 int a = 1000;
 int b = 500;
 int discount;
 discount = 100;
 int amount = 1;
         int price;
         price = a + b - discount;
         price = price * amount;
         discount = discount * amount;
         System.out.println(+ price);
         System.out.println(+discount);

        //       задача 5
int c = 16;
int d = 3;
int x = c + d;
int y = c - d;
System.out.println(x);
System.out.println(y);
    }
}
