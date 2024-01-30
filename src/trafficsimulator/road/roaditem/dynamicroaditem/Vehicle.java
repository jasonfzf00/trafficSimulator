package src.trafficsimulator.road.roaditem.dynamicroaditem;

/**
 * This class is set to be abstract so no object should be created
 * 
 * setSpeed(toSpeed)
 * setSpeed(toSpeed, delay)
 * setDirection(direction)
 * getDirection()
 * makeTurn(direction, angle)
 */

public abstract class Vehicle extends DynamicRoadItem {

    private int speed;
    private int direction; // 0: left, 1: right

    public Vehicle(){}

    public void setSpeed(int toSpeed){
        if (toSpeed >=0){
            speed = toSpeed;
        } else{
            throw new IllegalArgumentException("Invalid toSpeed value");
        }
    }

    /**
     * Override setSpeed to gradually increase/decrease speed
     * @param delay: 
     */
    public void setSpeed(int toSpeed, int delay){
        if (toSpeed >=0){
            // Note that this may need to be changed after the time.java is set
            while(delay!= 0){
                if (toSpeed > speed){
                    speed++;
                }else{
                    speed--;
                }
                delay--;
            }
        } else{
            throw new IllegalArgumentException("Invalid toSpeed value");
        }
    }

    public int getSpeed(){ return speed;}

    public void setDirection(int direction){
        this.direction = direction;
    }

    public int getDirection(){return direction;}

    /**
     * 
     * @param direction: 0 - Left; 1 - Right
     * @param angle: We will assume it is the multiple of 90 degree for now, 180 e.g.
     * e.g. (0, 90) indicates going straight.
     */
    public void makeTurn(int direction, int angle){}

}