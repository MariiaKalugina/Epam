package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите минуту: ");
        Scanner in_minute = new Scanner(System.in);
        int minute = in_minute.nextInt();
        System.out.println("Сигнал светофора " + getColorOfTrafficLights(minute));
    }

    static String getColorOfTrafficLights(int minute){
        int trafficLights;
        trafficLights = minute%10;
        if(trafficLights>=0 && trafficLights<2) {
            return "красный";
        } else if(trafficLights>=2 && trafficLights<5) {
            return "желтый";
        } else {
            return "зеленый";
        }
    }
}
