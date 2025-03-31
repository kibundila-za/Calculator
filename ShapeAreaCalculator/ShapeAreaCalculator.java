/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeareacalculator;

/**
 *
 * @author PASSW
 */
public class ShapeAreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        // Rectangle
        double rectangleLength = 6.0;
        double rectangleWidth = 5.0;
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle with length " + rectangleLength + 
                           " and width " + rectangleWidth + " is: " + rectangleArea);
        
        // Square
        double squareSide = 4.0;
        double squareArea = calculateSquareArea(squareSide);
        System.out.println("Area of the square with side " + squareSide + " is: " + squareArea);
        
        // Circle
        double circleRadius = 3.0;
        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("Area of the circle with radius " + circleRadius + " is: " + circleArea);
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    
    
    }
    
}
