package src.trafficsimulatortest;

import java.util.LinkedList;

import src.trafficsimulator.road.roaditem.dynamicroaditem.*;

public class test {
    
    public static void main(String[] args){
        Car car = new Car();
        Truck truck1 = new Truck(30000);
        Truck truck2 = new Truck(70000); 

        car.setDesiredSpeed(50);
        truck1.setDesiredSpeed(65);
        truck2.setDesiredSpeed(65);

        LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
        vehicles.add(car); vehicles.add(truck1); vehicles.add(truck2);
        System.out.println("------------------------------------");
        for (int i  = 0; i < 12 ; i ++){
            for (Vehicle v : vehicles) {
                v.updateSpeed(1);
                String curSpeed = String.format("%.2f", v.getSpeed());
                if (v.getType() == "Truck"){
                    System.out.println("Truck " + "Speed: " + curSpeed);
                }else{
                    System.out.println("Car " + "Speed: " + curSpeed);
                }
            }
            System.out.println("------------------------------------");
        }
    }   
}