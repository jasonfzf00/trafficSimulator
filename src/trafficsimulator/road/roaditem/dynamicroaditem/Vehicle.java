/**
 * @author Jason Fu     01/22/2024
 */

package src.trafficsimulator.road.roaditem.dynamicroaditem;


/**
 * This class serve as an interface and should not create an object of Vehicle.
 */
public class Vehicle {

    int speed;
    int direction;
    int locationX;
    int locationY;

    public Vehicle(){}

    /**
     * 
     * @param toSpeed set speed to toSpeed
     */
    public void accelerate(int toSpeed){}

    /**
     * 
     * @param toSpeed set speed to toSpeed
     */
    public void decelerate(int toSpeed){}

    /**
     * 
     * @param direction: 0 - Left; 1 - Right
     * @param angle: We will assume it is the multiple of 90 degree for now, 180 e.g.
     * e.g. (0, 90) indicates going straight.
     */
    public void makeTurn(int direction, int angle){}

    public static void main(String [] args){
        Vehicle test = new Vehicle();
    }

}