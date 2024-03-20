package src.trafficsimulator.gui;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;
import src.trafficsimulator.Config;

public class ImperialGUI implements GUI {

    @Override
    public Road createRoad(String name, Road.Heading hdg, double len, double x, double y) {
        return new Road(name, hdg, len / Config.MetersToMiles,
                x / Config.MetersToMiles, y / Config.MetersToMiles);
    }

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / Config.MpsToMph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed() * Config.MpsToMph;
    }
}
