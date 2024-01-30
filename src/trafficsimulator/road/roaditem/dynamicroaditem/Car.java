/**
 * @author Jason Fu     01/22/2024
 */

package src.trafficsimulator.road.roaditem.dynamicroaditem;

public class Car extends Vehicle {

    public Car(){}
    public Car(int speed){}
    public Car(int xAxis, int yAxis){}
    public Car(int speed, int xAxis, int yAxis){}
    public Car(int speed, int direction, int xAxis, int yAxis){}

    @Override
    public void accelerate(int toSpeed){}

    @Override
    public void decelerate(int toSpeed){}

    @Override
    public void makeTurn(int direction, int angle){}

    public static void main(String[] args){
        System.out.println("Hi");
    } 

}