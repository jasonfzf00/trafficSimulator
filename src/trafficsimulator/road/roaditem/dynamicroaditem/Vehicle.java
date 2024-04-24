package src.trafficsimulator.road.roaditem.dynamicroaditem;

import src.trafficsimulator.road.RoadItem;

/**
 * This class is set to be abstract so no object should be created
 * setSpeed(toSpeed)
 * getSpeed()
 * setDesiredSpeed(desiredSpeed)
 * getDesiredSpeed()
 * setDirection(direction)
 * getDirection()
 * makeTurn(direction, angle)
 */

public abstract class Vehicle extends RoadItem {

    private double curSpeed; // meters per second
    private double desiredSpeed; // meters per second
    private int direction; // 0: left, 1: right
    private double accRate = 3.5; // Meters per second
    private double decRate = 7.0; // Meters per second

    public void setSpeed(double toSpeed){
        if (toSpeed >=0){
            if (toSpeed <= desiredSpeed){
                if(toSpeed > desiredSpeed) curSpeed = desiredSpeed;
                else curSpeed = toSpeed;
            }
            else {
                if (toSpeed > desiredSpeed) curSpeed = desiredSpeed;
                else curSpeed = toSpeed;
            }
        } else{
            throw new IllegalArgumentException("Invalid toSpeed value");
        }
    }

    public double getSpeed(){ return curSpeed;}


    public void updateSpeed(int second){
        if (curSpeed < desiredSpeed){
            accelerate(second);
        }else if (curSpeed > desiredSpeed){
            decelerate(second);
        }
    }

    public abstract void accelerate (int second);
    public abstract void decelerate (int second);


    public void setDesiredSpeed(double desiredSpeed){
        if(desiredSpeed >= 0){
            this.desiredSpeed = desiredSpeed;
        } else{
            throw new IllegalArgumentException("Invalid desiredSpeed value");
        }
    }

    public double getDesiredSpeed(){return desiredSpeed;}

    public void setAccRate(double accRate){this.accRate = accRate;}

    public double getAccRate(){return accRate;}

    public void setDecRate(double decRate){this.decRate = decRate;}

    public double getDecRate(){return decRate;}

    public abstract String getType();

    public void setDirection(int direction){
        this.direction = direction;
    }

    public int getDirection(){return direction;}

    public void makeTurn(int direction, int angle){}

}