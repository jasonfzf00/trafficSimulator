package src.trafficsimulator.road;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public class MetricOutput implements ISimOutput{
    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed() * 1.6;
    }
}
