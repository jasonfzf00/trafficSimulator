package src.trafficsimulator.gui;

import src.trafficsimulator.gui.io.ISimInput;
import src.trafficsimulator.gui.io.ISimOutput;
import src.trafficsimulator.road.roaditem.dynamicroaditem.Vehicle;

public abstract class GUI implements ISimInput, ISimOutput{
    public final double mpsToMph  = 2.237;
    public final double mpsToKph = 3.6;
}
