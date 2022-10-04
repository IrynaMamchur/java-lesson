package homelesson4.level1;

public class House {
    int length;
    int width;
    int height;
    int floor;
    String colorOfWall;
    String colorOfCeiling;
    String colorOfFloor;
    int numberOfWindows;
    int numderOfDoors;

    public House(int length, int width, int height, int floor, String colorOfWall, String colorOfCeiling, String colorOfFloor, int numberOfWindows, int numderOfDoors){
        this();
        this.length = length;
        this.width = width;
        this.height = height;
        this.floor = floor;
        this.colorOfWall = colorOfWall;
        this.colorOfCeiling = colorOfCeiling;
        this.colorOfFloor = colorOfFloor;
        this.numberOfWindows = numberOfWindows;
        this.numderOfDoors = numderOfDoors;


    }
    public House(){
        System.out.println("Конструктор дома создан");
    }

    @Override
    public String toString() {
        return "House{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", floor=" + floor +
                ", colorOfWall='" + colorOfWall + '\'' +
                ", colorOfCeiling='" + colorOfCeiling + '\'' +
                ", colorOfFloor='" + colorOfFloor + '\'' +
                ", numberOfWindows=" + numberOfWindows +
                ", numderOfDoors=" + numderOfDoors +
                '}';
    }
}

