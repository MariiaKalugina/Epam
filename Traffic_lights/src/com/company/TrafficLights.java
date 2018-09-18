package com.company;

public class TrafficLights {
    String getColorOfTrafficLights(int minute) throws IllegalAccessException {
        int trafficLights;
        trafficLights = minute % 10;
        if(trafficLights >= 0 && trafficLights < 2) {
            return "красный";
        } else if(trafficLights >= 2 && trafficLights < 5) {
            return "желтый";
        } else if(trafficLights >= 5 && trafficLights < 9){
            return "зеленый";
        } else {
            throw new IllegalAccessException("Error!");
        }
    }
}
