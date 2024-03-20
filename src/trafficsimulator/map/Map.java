package src.trafficsimulator.map;

import src.trafficsimulator.road.Road;
import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.IPrintDriver;

import java.util.ArrayDeque;
import java.util.Deque;

public class Map {
    private Deque<Road> roads;

    public Map(){
        roads = new ArrayDeque<>();
    }

    public void addRoad(Road road){
        try{
            roads.add(road);
        }catch(IllegalStateException e){
            System.out.println("Failed to add road");
        }
    }

    public void print(IPrintDriver pd, CharMatrix cm){
        for(Road r : roads){
            r.print(pd,cm);
        }
    }
}
