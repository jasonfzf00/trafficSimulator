package src.trafficsimulator.sui;

import src.trafficsimulator.Config;

public class Conversions {
    public static int wcPointToCCpoint(double val) {
        return (int) (val * (Config.CharMapSize / Config.WorldSize) + (Config.CharMapSize / 2));
    }

    public static int wcLengthToCClength(double val) {
        return (int) (val * (Config.CharMapSize / Config.WorldSize));
    }
}
