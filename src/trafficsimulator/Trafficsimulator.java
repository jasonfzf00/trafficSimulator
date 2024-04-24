package src.trafficsimulator;

import java.util.*;
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
    private Deque<TrafficLight> lights; // We use Deque to store items
    private IPrintDriver cp;
    private CharMatrix cm;
    private GUI simInput;

    Trafficsimulator(){
        // Initialize when construct simulation
        this.timer = new Timer();
        this.currentTime = 0;
        this.lights = new ArrayDeque<>();
        this.simInput = new MetricGUI();
        this.map = new Map();
        this.cp = new ConsolePrint();
        this.cm = new CharMatrix(Config.CharMapSize);
        // Add road
        Road uptown = simInput.createRoad("Uptown", Heading.North, .180,
                0.0, -0.08);
        map.addRoad(uptown);
//        Road crosstown = simInput.createRoad("Crosstown", Heading.East, .180,
//        -0.08, -0.02);
//        map.addRoad(crosstown);
        // Add traffic lights 1/3 and 2/3 of road
        TrafficLight light1 = new TrafficLight(13.0,22.0);
        lights.add(light1);
        TrafficLight light2 = new TrafficLight(26.0,22.0);
        lights.add(light2);
    }

    public void startSimulation(){
        // Initialize map
        map.print(cp,cm);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Increment current time
                currentTime++;
                // Update traffic status
                updateTrafficStatus(currentTime);
                // Console Clear
                System.out.print("\033[H\033[2J");
                System.out.flush();
                // Print map
                for (int i = 0; i < Config.CharMapSize; i++)
                {
                    String s = new String(cm.map[i]);
                    System.out.println(s);
                }

            }
        }, 0, 1000); // Delay of 0 ms, repeat every second
    }

    private void updateTrafficStatus(int time) {
        // Use an iterator to update ever traffic lights
        for (TrafficLight light : lights){
            light.updateLightTimer();
            light.print(cp,cm);
        }
    }

    public static void main(String[] args) {
        Trafficsimulator simulator = new Trafficsimulator();
        simulator.startSimulation();
    }
}
