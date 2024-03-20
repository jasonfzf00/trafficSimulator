package src.trafficsimulator.gui;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public class MetricGUI extends GUI {

    public MetricGUI() {
    }


    @Override
    public Road createRoad(String name, Road.Heading hdg, double len, double x, double y) {
        return new Road(name, hdg, len, x, y);
    }

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / mpsToKph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed() * mpsToKph;
    }
}
