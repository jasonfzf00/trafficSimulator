package src.trafficsimulator.road.roaditem.dynamicroaditem;



public class TrafficLight extends DynamicRoadItem{

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
