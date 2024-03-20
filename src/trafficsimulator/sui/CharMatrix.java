package src.trafficsimulator.sui;

public class CharMatrix {
    public char[][] map;

    public CharMatrix(int CharMapSize) {
        map = new char[CharMapSize][];
        for (int i = 0; i < CharMapSize; i++)
        {
            map[i] = new char[CharMapSize];
            for (int j = 0; j < CharMapSize; j++) map[i][j] = ' ';
        }
    }
}
