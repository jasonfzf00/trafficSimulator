package src.trafficsimulator.road.roaditem.dynamicroaditem;

import src.trafficsimulator.road.RoadItem;

public class TrafficLight extends RoadItem {

    private int status; // 0: red, 1: yellow, 2: green

    public TrafficLight(){
        status = 0;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }
}
