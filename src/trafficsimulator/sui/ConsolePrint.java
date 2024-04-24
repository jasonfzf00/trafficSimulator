package src.trafficsimulator.sui;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.RoadItem;
import src.trafficsimulator.road.roaditem.dynamicroaditem.TrafficLight;

public class ConsolePrint implements IPrintDriver{
    @Override
    public void printRoad(Road road, CharMatrix cm) {
        int x, y;
        int CharMapSize = cm.map.length;
        int CCx = Conversions.wcPointToCCpoint(road.getLocX());
        int CCy = Conversions.wcPointToCCpoint(-road.getLocY());
        int distance = 0;
        int CCRoadLength = Conversions.wcLengthToCClength(road.getLength());
        switch (road.getHeading()) {
            case North:
                x = (int) CCx;
                if (x >= 0 && x < CharMapSize) {
                    while (distance < CCRoadLength) {
                        y = (int) (CCy - distance);
                        if (y >= 0 && y < CharMapSize) {
                            cm.map[y][x] = '|';
                            cm.map[y][x + 2] = '|';
                            cm.map[y][x + 4] = '|';
                        }
                        distance += 1;
                    }
                }
                break;
            case South:
                break;
            case East:
                y = (int) CCy;
                if (y >= 0 && y < CharMapSize) {
                    while (distance < CCRoadLength) {
                        x = (int) (CCx + distance);
                        if (x >= 0 && x < CharMapSize) {
                            cm.map[y][x] = '-';
                            cm.map[y + 2][x] = '-';
                            cm.map[y + 4][x] = '-';
                        }
                        distance += 1;
                    }
                }
                break;
            case West:
                break;
            default:
                break;
        }
    }

    @Override
    public void printRoadItem(RoadItem item, CharMatrix cm) {
    }
}
