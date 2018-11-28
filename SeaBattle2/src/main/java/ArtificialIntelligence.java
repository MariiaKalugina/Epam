/**
 * Class for computer playing: random shot, try to kill ship when hurt it.
 */

import ships.Ship;

import java.util.Random;

public class ArtificialIntelligence {
    int x;
    char y;
    int initX;
    char initY;
    private boolean isShipFound;
    private boolean isShipVertical;
    private boolean isFirstCheck;
    private Coordinate coordinate;
    private FieldGeneration field;
    private Ship[] ships;
    private int lastShip;

    public ArtificialIntelligence() {
        isShipFound = false;
        isShipVertical = false;
        isFirstCheck = true;
    }

    public boolean getShot(FieldGeneration field, Ship[] ships) {
        this.field = field;
        this.ships = ships;
        if (isShipFound && ships[lastShip].isLife()) {
            if (isShipVertical) {
                return checkVertical();
            } else {
                return checkHorizontal();
            }
        } else {
            randomCoordinate();
            System.out.printf("I'm shot to " + y + " " + x + "!\n");
            System.out.print("And my result: ");
            lastShip = field.getCell(coordinate.getX(), coordinate.getY());
            lastShip--;
            if (coordinate.getShot(field, ships)) {
                isShipFound = true;
                return true;
            }
            return false;
        }
    }

    private void randomCoordinate() {
        while (true) {
            Random random = new Random();
            initY = (char) (random.nextInt('k' - 'a') + 'a');
            initX = 1 + (int) (Math.random() * 10);
            coordinate = new Coordinate(initY, initX);
            if (field.getCell(coordinate.getX(), coordinate.getY()) >= 0)
                break;
        }
        x = initX;
        y = initY;
        isShipFound = false;
        isShipVertical = false;
        isFirstCheck = true;
    }

    private boolean checkHorizontal() {
        if (isFirstCheck) {
            if (y != 'a') {
                y--;
            } else {
                y = initY;
                isFirstCheck = false;
            }
        }
        if (!isFirstCheck) {
            if (y != 'j') {
                y++;
            } else {
                y = initY;
                isFirstCheck = true;
                isShipVertical = true;
            }
        }
        if (isShipVertical) {
            return checkVertical();
        }
        if (!checkCoordinate(y, x)) {
            isShipVertical = !isFirstCheck;
            isFirstCheck = isShipVertical;
            y = initY;
            return false;
        }
        return true;
    }

    private boolean checkCoordinate(char y, int x) {
        coordinate = new Coordinate(y, x);
        System.out.printf("I'm shot to " + y + " " + x + "!\n");
        System.out.print("And my result: ");
        if (!coordinate.getShot(field, ships)) {
            y = initY;
            x = initX;
            return false;
        }
        return true;
    }

    private boolean checkVertical() {
        if (x == 1) {
            x = initX;
            isFirstCheck = false;
        }
        if (isFirstCheck) {
            x--;
            if (!checkCoordinate(y, x)) {
                isFirstCheck = false;
                return false;
            } else return true;
        } else {
            x++;
            return checkCoordinate(y, x);
        }
    }
}

