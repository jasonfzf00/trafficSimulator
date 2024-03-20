package src.trafficsimulator.road;

import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.IPrintDriver;

public class Road {
    public enum Heading {North, South, East, West}

    private String name;
    private Heading heading;
    private double length;
    private double locX;
    private double locY;
    public static int numOfRoads = 0;

    public Road(String name, Heading heading, double length, double x, double y) {
        this.name = name;
        this.heading = heading;
        this.length = length;
        locX = x;
        locY = y;
        numOfRoads++; // Increment road counts every time a road got instantiated
    }

    public double getLength() {
        return length;
    }

    public double getLocX() {
        return locX;
    }

    public double getLocY() {
        return locY;
    }

    public String getName() {
        return name;
    }

    public Heading getHeading() {
        return heading;
    }

    public void print(IPrintDriver print, CharMatrix cm) {
        print.printRoad(this,cm);
    }


}
