package src.trafficsimulator.sui;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.*;
import src.trafficsimulator.sui.CharMatrix;

public interface IPrintDriver {
    public void printRoad(Road road, CharMatrix cm);

    public void printCar(Car car);
}
