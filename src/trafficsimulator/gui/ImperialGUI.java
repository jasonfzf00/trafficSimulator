package src.trafficsimulator.gui;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;
import src.trafficsimulator.Config;

public class ImperialGUI extends GUI {
    public ImperialGUI() {
    }

    @Override
    public Road createRoad(String name, Road.Heading hdg, double len, double x, double y) {
        return new Road(name, hdg, len, x, y);
    }

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / mpsToMph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed() * mpsToMph;
    }
}
