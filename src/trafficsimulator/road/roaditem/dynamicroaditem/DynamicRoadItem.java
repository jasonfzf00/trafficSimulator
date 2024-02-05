package src.trafficsimulator.road.roaditem.dynamicroaditem;

/**
 * DynamicRoadItem class is set to be abstract to avoid object creation
 * All dynamic items will inherit location from it
 */

public abstract class DynamicRoadItem {

    private int[] location = new int[2];

    public int[] getLocation(){
        return location;
    }

    public void setLocation (int x, int y){
        location[0] = x;
        location[1] = y;
    }
}
