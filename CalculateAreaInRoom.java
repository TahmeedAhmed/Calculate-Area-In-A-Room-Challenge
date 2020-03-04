package com.nttdata.techacad.popquiz.calcroomarea;

import java.util.Scanner;

public class CalculateAreaInRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of room in feet: ");
        double length = sc.nextDouble();

        System.out.println("Enter Width of room in feet: ");
        double width = sc.nextDouble();

        displayAreaInSquareFeet(length, width);
        displayAreaInSquareMetres(length, width);
    }

    public static void displayAreaInSquareFeet(double length, double width){
        double sqrFeet = length * width;
        System.out.println("Area in square feet: " + sqrFeet);
    }

    public static void displayAreaInSquareMetres(double length, double width){
        double sqrMeters = length * width * 0.09290304;
        System.out.println("Area in square metres: " + sqrMeters);
    }
}
/*
create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.
 */