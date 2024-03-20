package src.trafficsimulator.gui;

import src.trafficsimulator.Config;
import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

import java.awt.*;

public class MetricGUI implements GUI {

    @Override
    public Road createRoad(String name, Road.Heading hdg, double len, double x, double y) {
        return new Road(name, hdg, len / Config.MetersToKm, x / Config.MetersToKm, y / Config.MetersToKm);
    }

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / Config.MpsToKph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed() * Config.MpsToKph;
    }
}
