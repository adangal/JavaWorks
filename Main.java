package edu.cscc;
import java.util.Scanner;
import java.lang.Math;
//Ambika Dangal, August 31, 2022, Lab 1 Free Fall Calculator

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        //Variable declarations
        double time, distance, velocity;
        //Input
        System.out.print("Free Fall Calculator\n");
        System.out.print("Enter Time(secs): ");
        time = input.nextDouble();
        //Computation
        distance = (0.5 * 32.0 * (time * time));
        velocity = 32.0 * time;
        //Output
        System.out.println( "Distance:" + distance + " feet \n" + "Velocity: " + velocity + " feet/sec");



    }
}