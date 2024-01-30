package src.trafficsimulator.road.roaditem.dynamicroaditem;

public class Truck extends Vehicle{

    private int loadWeight;

    Truck(){}
    Truck(int weight){}
    Truck(int xAxis, int yAxis){}
    Truck(int speed, int xAxis, int yAxis){}
    Truck(int speed, int direction, int xAxis, int yAxis, int weight){}

    @Override
    public void makeTurn(int direction, int angle){}

    /**
     * 
     * @param weight: set loadWeight to weight
     */
    public void setLoadWeight(int weight){}

    public int getLoadWeight(){return loadWeight;}

}
