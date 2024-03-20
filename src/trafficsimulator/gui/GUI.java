package src.trafficsimulator.gui;

import src.trafficsimulator.gui.io.ISimInput;
import src.trafficsimulator.gui.io.ISimOutput;
import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public abstract class GUI implements ISimInput, ISimOutput{
    public final double mpsToMph  = 2.237;
    public final double mpsToKph = 3.6;
    public abstract Road createRoad(String name, Road.Heading hdg,
                                    double len, double x, double y);
    public abstract void setSpeedLimit(Vehicle v, double speed);
    public abstract double getSpeed(Vehicle v);

}
