package homelesson4.level1;

public class AddThree1 {
    int add(int first, int second, int three) {
        return first + second + three;
    }

    public static void main(String[] args) {
        AddThree1 addThree1 = new AddThree1();
        System.out.println(addThree1.add(2, 3, 4));
    }
}
