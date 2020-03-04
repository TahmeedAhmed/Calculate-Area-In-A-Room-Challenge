import java.util.Scanner;

public class CalculateAreaInRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of room in feet: ");
        int length = sc.nextInt();

        System.out.println("Enter Width of room in feet: ");
        int width = sc.nextInt();

        displayArea(length, width);
    }

    public static void displayArea(int length, int width){
        int sqrFeet = length * width;
        double sqrMeters = sqrFeet * 0.09290304;

        System.out.println("Area in square feet: " + sqrFeet);
        System.out.println("Area in square metres: " + sqrMeters);
    }
}
/*
create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.
 */