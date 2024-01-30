/**
 * @author Jason Fu     01/22/2024
 */

package trafficsimulator.roaditem.dynamicroaditem;

public class Car extends Vehicle {

    Car(){}
    Car(int speed){}
    Car(int xAxis, int yAxis){}
    Car(int speed, int xAxis, int yAxis){}
    Car(int speed, int direction, int xAxis, int yAxis){}

    @Override
    public void accelerate(int toSpeed){}

    @Override
    public void decelerate(int toSpeed){}

    @Override
    public void makeTurn(int direction, int angle){}

}