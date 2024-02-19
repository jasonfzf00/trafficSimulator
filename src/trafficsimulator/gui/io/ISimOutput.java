package src.trafficsimulator.gui.io;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public interface ISimOutput {
    public double getSpeed(Vehicle v);
}
