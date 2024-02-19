package src.trafficsimulator.gui;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public class MetricGUI extends GUI{

    public MetricGUI(){};
    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed/mpsToKph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getSpeed()*mpsToKph;
    }
}
