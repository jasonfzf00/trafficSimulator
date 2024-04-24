package src.trafficsimulator.road.roaditem.dynamicroaditem;

public class Car extends Vehicle {

    private final String vehicleType = "Car";

    public Car(){
        this.setSpeed(0);
    }

    public Car(double speed){
        this.setSpeed(speed);
    }
    
    // public Car(int speed, int direction, int xAxis, int yAxis){
    //     this.setSpeed(speed);
    //     this.setDirection(direction);
    //     this.setLocation(xAxis, yAxis);
    // }
    
    @Override
    public String getType(){
        return vehicleType;
    }

    @Override
    public void accelerate(int second) {
        double curSpeed = getSpeed();
        this.setSpeed(curSpeed + (getAccRate() * second));
    }

    @Override
    public void decelerate(int second) {
        double curSpeed = getSpeed();
        this.setSpeed(curSpeed - (getAccRate() * second));
    }
}