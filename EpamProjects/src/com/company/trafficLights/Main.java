/*
 * This program defines color of traffic lights.
 */
package com.company.trafficLights;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minute;

        System.out.print("Введите минуту: ");
        Scanner inMinute = new Scanner(System.in);
        minute = inMinute.nextInt();
        TrafficLights someTrafficLights = new TrafficLights();
        System.out.println("Сигнал светофора " + someTrafficLights.getColorOfTrafficLights(minute));
    }
}