package src.trafficsimulator.gui;

import src.trafficsimulator.gui.io.ISimInput;
import src.trafficsimulator.gui.io.ISimOutput;
import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public interface GUI extends ISimInput, ISimOutput {
    public Road createRoad(String name, Road.Heading hdg, double len, double x, double y);

    public void setSpeedLimit(Vehicle v, double speed);
    public double getSpeed(Vehicle v);

}
