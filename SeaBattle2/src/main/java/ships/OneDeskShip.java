package ships;

public class OneDeskShip extends Ship {

    public OneDeskShip(int i) {
        size = 1;
        index = i;
        coordinateX = new int[size];
        coordinateY = new int[size];
        lifes = size;
    }
}
