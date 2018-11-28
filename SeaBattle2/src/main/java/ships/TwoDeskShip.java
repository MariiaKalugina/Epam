package ships;

public class TwoDeskShip extends Ship {

    public TwoDeskShip(int i) {
        size = 2;
        index = i;
        coordinateX = new int[size];
        coordinateY = new int[size];
        lifes = size;
    }
}
