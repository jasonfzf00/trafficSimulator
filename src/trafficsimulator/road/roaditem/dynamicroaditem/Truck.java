package src.trafficsimulator.road.roaditem.dynamicroaditem;

public class Truck extends Vehicle{

    private int loadWeight; // lbs
    private double accRateLoaded;
    private double decRateLoaded;

    private final String vehicleType = "Truck";


    public Truck(){
        this.setSpeed(0);
        this.loadWeight = 0;
        accRateLoaded = getAccRate();
        decRateLoaded = getDecRate();
    }

    public Truck(int weight){
        this.setSpeed(0);
        this.loadWeight = weight;
        if (weight > 0){
            updateLoadedSpeedRate();
        }
    }

    public Truck(double speed, int weight){
        this.loadWeight = weight;
        this.setSpeed(speed);
        if (weight > 0){
            updateLoadedSpeedRate();
        }
    }

    // public Truck(int speed, int direction, int xAxis, int yAxis, int weight){}

    public void setLoadWeight(int weight){
        this.loadWeight = weight;
        if (weight > 0){
            updateLoadedSpeedRate();
        }
    }

    public int getLoadWeight(){return loadWeight;}

    /**
     * acc & dec rate changes when loadedweight changes && greater than 0
     */
    public void updateLoadedSpeedRate(){
        double accRate = this.getAccRate();
        double decRate = this.getDecRate();

        // A loaded truck weigh around 80,000 lbs 
        this.accRateLoaded = accRate - (Double.valueOf(loadWeight) / 80000);
        this.decRateLoaded = decRate - (Double.valueOf(loadWeight) / 80000);
    }

    @Override
    public String getType(){
        return vehicleType;
    }

    @Override
    public void accelerate(int second) {
        double curSpeed = getSpeed();
        this.setSpeed(curSpeed + (mpsToMph * accRateLoaded * second));
    }

    @Override
    public void decelerate(int second) {
        double curSpeed = getSpeed();
        this.setSpeed(curSpeed + (mpsToMph * decRateLoaded * second));
    }

}
