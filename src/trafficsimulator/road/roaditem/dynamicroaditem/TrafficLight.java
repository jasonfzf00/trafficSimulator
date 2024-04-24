package src.trafficsimulator.road.roaditem.dynamicroaditem;

import src.trafficsimulator.road.RoadItem;
import src.trafficsimulator.sui.CharMatrix;
import src.trafficsimulator.sui.IPrintDriver;

public class TrafficLight extends RoadItem {
    private char status; // red 3s, yellow 2s, green 4s

    // Light Internal timer, updated by stimulator timer
    private int lightTimer;

    public TrafficLight(double x, double y){
        this.setLocation(x,y);
        status = 'X';
        lightTimer = 0;
    }

    public char getStatus(){
        return status;
    }

    public void updateLightTimer(){
        // Increment timer everytime this method is called
        lightTimer ++;
        if (lightTimer > 9) {
            lightTimer = 0; // reset to 0 when green light ends
            updateStatus('X');
        }else if (lightTimer > 5){
            updateStatus('O');
        } else if (lightTimer > 3){
            updateStatus('-');
        }
    }

    public void updateStatus(char status){
        this.status = status;
    }

    public void print(IPrintDriver print, CharMatrix cm) {
        // Call to print traffic light to map
        print.printTrafficLight(this,cm);
    }
}
