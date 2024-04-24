package src.trafficsimulator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Timer;
import java.util.TimerTask;

import src.trafficsimulator.gui.*;
import src.trafficsimulator.map.Map;
import src.trafficsimulator.road.Road;
import static src.trafficsimulator.road.Road.Heading;

import src.trafficsimulator.road.RoadItem;
import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.ConsolePrint;
import src.trafficsimulator.sui.IPrintDriver;
import src.trafficsimulator.road.roaditem.dynamicroaditem.TrafficLight;

public class Trafficsimulator {
    private Timer timer;
    private int currentTime;
    private Map map;
    private Deque<RoadItem> items; // We use Deque to store items
    private IPrintDriver cp;
    private CharMatrix cm;
    private GUI simInput;

    Trafficsimulator(){
        // Initialize when construct simulation
        //this.timer = new Timer();
        this.currentTime = 0;
        this.items = new ArrayDeque<>();
        this.simInput = new MetricGUI();
        this.map = new Map();
        this.cp = new ConsolePrint();
        this.cm = new CharMatrix(Config.CharMapSize);
        // Add road
        Road uptown = simInput.createRoad("Uptown", Heading.North, .09,
                0.0, -0.08);
        map.addRoad(uptown);
    }

    public void startSimulation(){
        map.print(cp,cm);

        for (int i = 0; i < Config.CharMapSize; i++)
        {
            String s = new String(cm.map[i]);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Trafficsimulator simulator = new Trafficsimulator();
        simulator.startSimulation();

////        Road crosstown = simInput.createRoad("Crosstown", Heading.East, .180,
////                -0.08, -0.02);
////        map.addRoad(crosstown);

        //TrafficLight test = new TrafficLight();
    }
}
