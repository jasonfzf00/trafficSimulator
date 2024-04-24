# Traffic Simulator

This project aims to create a traffic simulator which implements the idea of Object-oriented programming.

## Code Structure

```bash
trafficsimulator
├── Config.java # Constants
├── Trafficsimulator.java # Main program
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
│       │   ├── Car.java
│       │   ├── TrafficLight.java
│       │   ├── Truck.java
│       │   └── Vehicle.java
│       └── staticroaditem
│           ├── Intersection.java
│           ├── SpeedLimit.java
│           ├── StopSign.java
│           └── Yield.java
├── sui
│   ├── CharMatrix.java
│   ├── ConsolePrint.java
│   ├── Conversions.java
│   └── IPrintDriver.java
└── timer
```

## Update 02/05

Vehicles now support updating speed. You can find example code from test.java. An example output is as following.

<img src="/src/img/vehicles-speed-example.png" alt="vehicles-speed-example" height="500"/>

## Update 03/20

Now support printing out map with roads. Example output:

<img src="/src/img/roadPrint.png" alt="roadPrint" height="500"/>
