package src.trafficsimulator.sui;

import src.trafficsimulator.Config;

public class Conversions {
    public static int wcPointToCCpoint(double val) {
        return (int) (val * (Config.CharMapSize / Config.WorldSize) + (Config.CharMapSize / 2));
        // val * 1/5 + 20
    }

    public static int wcLengthToCClength(double val) {
        return (int) (val * (Config.CharMapSize / Config.WorldSize));
        // cal * 1/5
    }
}
