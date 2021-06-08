package Factory;

public class Car {
    private static int carNum = 10000;
    private int privateNum;
    Car(){
        carNum += 1;
        privateNum = carNum;
    }

    public int getCarNum() {
        return privateNum;
    }
}
