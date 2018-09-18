/*
 * This program defines color of traffic lights.
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        int minute;

        System.out.print("Введите минуту: ");
        Scanner in_minute = new Scanner(System.in);
        minute = in_minute.nextInt();
        TrafficLights someTrafficLights = new TrafficLights();
        System.out.println("Сигнал светофора " + someTrafficLights.getColorOfTrafficLights(minute));
    }
}
