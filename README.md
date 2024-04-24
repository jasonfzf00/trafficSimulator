# Traffic Simulator

This project aims to create a traffic simulator which implements the idea of Object-oriented programming.

## Usage
In any IDE, run the main of `Trafficsimulator.java`.

## Code Structure

```bash
trafficsimulator
├── Config.java # Constants
├── Trafficsimulator.java # Main program with Timer
├── gui
│   ├── GUI.java
│   ├── ImperialGUI.java
│   ├── MetricGUI.java
│   └── io
│       ├── ISimInput.java
│       └── ISimOutput.java
├── map
│   └── Map.java
├── road
│   ├── Road.java
│   ├── RoadItem.java
│   └── roaditem
│       ├── dynamicroaditem
│           ├── Car.java
│           ├── TrafficLight.java
│           ├── Truck.java
│           └── Vehicle.java
├── sui
│   ├── CharMatrix.java
│   ├── ConsolePrint.java
│   ├── Conversions.java
│   └── IPrintDriver.java
```
## Update 04/24
Traffic lights are now available.

## Update 02/05

Vehicles now support updating speed. You can find example code from test.java. An example output is as following.

<img src="/img/vehicles-speed-example.png" alt="vehicles-speed-example" height="500"/>

## Update 03/20

Now support printing out map with roads. Example output:

<img src="/img/roadPrint.png" alt="roadPrint" height="500"/>
