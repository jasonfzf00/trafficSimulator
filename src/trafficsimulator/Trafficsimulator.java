package src.trafficsimulator;

import src.trafficsimulator.gui.*;
import src.trafficsimulator.map.Map;
import src.trafficsimulator.road.Road;
import static src.trafficsimulator.road.Road.Heading;
import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.ConsolePrint;
import src.trafficsimulator.sui.IPrintDriver;

public class Trafficsimulator {

    public static void main(String[] args) {
        GUI simInput;
        Map map = new Map();
        IPrintDriver cp = new ConsolePrint();
        CharMatrix cm = new CharMatrix(Config.CharMapSize);

        simInput = new MetricGUI();
        Road uptown = simInput.createRoad("Uptown", Heading.North, .180,
                0.0, -0.09);
        map.addRoad(uptown);
        Road crosstown = simInput.createRoad("Uptown", Heading.East, .180,
                -0.09, 0.0);
        map.addRoad(crosstown);

        map.print(cp,cm);

        for (int i = 0; i < Config.CharMapSize; i++)
        {
            String s = new String(cm.map[i]);
            System.out.println(s);
        }
    }
}
