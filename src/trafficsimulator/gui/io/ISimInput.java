package src.trafficsimulator.gui.io;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public interface ISimInput {
    public void setSpeedLimit(Vehicle v, double speed);
}
