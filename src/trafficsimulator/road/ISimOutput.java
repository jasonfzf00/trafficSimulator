package src.trafficsimulator.road;

import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public interface ISimOutput {
    double getSpeed(Vehicle v);
}
