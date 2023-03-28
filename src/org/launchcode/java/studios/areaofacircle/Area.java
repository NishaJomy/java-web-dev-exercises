package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        try {
            double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("please enter a positive number");
                radius = input.nextDouble();
            }
            System.out.println("area of circle is " + Circle.getArea(radius));
        }catch(InputMismatchException e){
            System.out.println("invalid input" );
        }



    }
}
