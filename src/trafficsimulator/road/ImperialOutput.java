package src.trafficsimulator.road;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public class ImperialOutput implements ISimOutput {
    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed();
    }
}
