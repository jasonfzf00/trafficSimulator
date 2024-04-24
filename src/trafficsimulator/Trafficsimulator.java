package src.trafficsimulator;

import java.util.Timer;

import src.trafficsimulator.gui.*;
import src.trafficsimulator.map.Map;
import src.trafficsimulator.road.Road;
import static src.trafficsimulator.road.Road.Heading;
import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.ConsolePrint;
import src.trafficsimulator.sui.IPrintDriver;
import src.trafficsimulator.road.roaditem.dynamicroaditem.TrafficLight;

public class Trafficsimulator {
    private Timer timer;

    public static void main(String[] args) {
        GUI simInput;
        Map map = new Map();
        IPrintDriver cp = new ConsolePrint();
        CharMatrix cm = new CharMatrix(Config.CharMapSize);

        simInput = new MetricGUI();
        Road uptown = simInput.createRoad("Uptown", Heading.North, .180,
                0.0, -0.08);
        map.addRoad(uptown);
////        Road crosstown = simInput.createRoad("Crosstown", Heading.East, .180,
////                -0.08, -0.02);
////        map.addRoad(crosstown);

        map.print(cp,cm);

        for (int i = 0; i < Config.CharMapSize; i++)
        {
            String s = new String(cm.map[i]);
            System.out.println(s);
        }

        TrafficLight test = new TrafficLight();
        for (int i = 0; i < 20; i++){
            test.updateLightTimer();
            System.out.println(test.getStatus());
        }
    }
}
