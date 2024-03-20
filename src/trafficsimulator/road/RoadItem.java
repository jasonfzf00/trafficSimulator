package src.trafficsimulator.road;

public abstract class RoadItem {

    private double locX;
    private double locY;

    public double getLocX(){
        return locX;
    }
    public double getLocY() { return locY;}

    public void setLocation (double x, double y){
        locX = x;
        locY = y;
    }
}
