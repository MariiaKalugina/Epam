package com.company.trafficLights;

public class TrafficLights {
    String getColorOfTrafficLights(int minute) throws IllegalArgumentException {
        String redColor = "красный";
        String yellowColor = "желтый";
        String greenColor = "зеленый";
        int trafficLights;
        trafficLights = minute % 10;
        if(trafficLights >= 0 && trafficLights < 2) {
            return redColor;
        } else if(trafficLights >= 2 && trafficLights < 5) {
            return yellowColor;
        } else if(trafficLights >= 5 && trafficLights < 9){
            return greenColor;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
