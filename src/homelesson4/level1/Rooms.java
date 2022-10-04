package homelesson4.level1;

public class Rooms {
    public static void main(String[] args){

        House roomFirst = new House(8, 4, 5,1,"Green", "White", "Brown",2,2);
        House roomSecond = new House(6, 3,3,2,"Red", "Pink", "Brown", 1, 1);
        House kitchen = new House(8,5,3,1,"Orange", "Yellow", "Brown", 3, 2);
        House wall = new House(5,2,3,1,"Grey", "Blue", "Grey", 0, 3);
        System.out.println(roomFirst);
        System.out.println(roomSecond);
        System.out.println(kitchen);
        System.out.println(wall);
    }
}
