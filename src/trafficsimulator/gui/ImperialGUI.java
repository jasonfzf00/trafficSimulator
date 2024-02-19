package src.trafficsimulator.gui;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public class ImperialGUI extends GUI{
    public ImperialGUI(){};
    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed/mpsToMph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed()*mpsToMph;
    }
}
