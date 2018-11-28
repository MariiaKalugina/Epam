/**
 * Class of map with ships.
 */

public class Field {
    int[][] map = new int[10][10];
    Field() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
    }
}
