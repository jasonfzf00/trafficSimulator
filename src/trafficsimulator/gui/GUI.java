package src.trafficsimulator.gui;

import src.trafficsimulator.gui.io.ISimInput;
import src.trafficsimulator.gui.io.ISimOutput;
import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public interface GUI extends ISimInput, ISimOutput {
    Road createRoad(String name, Road.Heading hdg, double len, double x, double y);

    void setSpeedLimit(Vehicle v, double speed);
    double getSpeed(Vehicle v);

}
