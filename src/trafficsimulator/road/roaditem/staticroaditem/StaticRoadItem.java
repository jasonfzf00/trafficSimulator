package src.trafficsimulator.road.roaditem.staticroaditem;

public class StaticRoadItem {

    private int[] location = new int[2];

    public void setLocation(int x, int y){
        location[0] = x;
        location[1] = y;
    }

    public int[] getLocation(){
        return location;
    }
    
}
