// Variable Dictionary:
// - radius: the radius of the circle (in cm)
// - radiusCylinder: the radius of the cylinder (in cm)
// - heightCylinder: the height of the cylinder (in cm)
// - lengthPendulum: the length of the pendulum (in cm)
// - areaCircle: the area of the circle (in square cm)
// - surfaceAreaCylinder: the surface area of the cylinder (in square cm)
// - volumeCylinder: the volume of the cylinder (in cubic cm)
// - periodPendulum: the period of the pendulum (in seconds)

import java.lang.Math; // Import the Math library for mathematical operations
import java.util.Scanner; // Import the Scanner library for user input

public class Finalcopyassn1 {
    public static void Finalcopyassn1 (String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object

        // Welcome message
        System.out.println("Welcome to the Geometry and Physics Calculator!"); // Print a welcome message
        System.out.println("This program will calculate the area of a circle, " // Print a description of the program
                + "the surface area and volume of a cylinder, "
                + "and the period of a pendulum.");

        // Calculate area of circle
        // This function calculates the area of a circle given its radius
        System.out.println("Let's calculate the area of a circle:"); // Print a message to indicate the start of the circle calculation
        System.out.print("Enter radius of the circle (in cm): "); // Ask the user to input the radius of the circle
        double radius = scanner.nextDouble(); // Read the user's input for the radius
        double areaCircle = Math.PI * Math.pow(radius, 2); // Calculate the area of the circle using the formula A = πr^2
        System.out.printf("The area of the circle with radius %.2f cm is: %.2f square cm%n", // Print the result with two decimal places
                radius, areaCircle);

        // Calculate surface area and volume of cylinder
        // This function calculates the surface area and volume of a cylinder given its radius and height
        System.out.println("\nLet's calculate the surface area and volume of a cylinder:"); // Print a message to indicate the start of the cylinder calculation
        System.out.print("Enter radius of the cylinder (in cm): "); // Ask the user to input the radius of the cylinder
        double radiusCylinder = scanner.nextDouble(); // Read the user's input for the radius
        System.out.print("Enter height of the cylinder (in cm): "); // Ask the user to input the height of the cylinder
        double heightCylinder = scanner.nextDouble(); // Read the user's input for the height
        double surfaceAreaCylinder = 2 * Math.PI * radiusCylinder * (radiusCylinder + heightCylinder); // Calculate the surface area of the cylinder using the formula A = 2πr(r + h)
        double volumeCylinder = Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder; // Calculate the volume of the cylinder using the formula V = πr^2h
        System.out.printf("The surface area of the cylinder with radius %.2f cm and height %.2f cm is: %.2f square cm%n", // Print the surface area result with two decimal places
                radiusCylinder, heightCylinder, surfaceAreaCylinder);
        System.out.printf("The volume of the cylinder with radius %.2f cm and height %.2f cm is: %.2f cubic cm%n", // Print the volume result with two decimal places
                radiusCylinder, heightCylinder, volumeCylinder);

        // Calculate period of pendulum
        // This function calculates the period of a pendulum given its length
        System.out.println("\nLet's calculate the period of a pendulum:"); // Print a message to indicate the start of the pendulum calculation
        System.out.print("Enter length of the pendulum (in cm): "); // Ask the user to input the length of the pendulum
        double lengthPendulum = scanner.nextDouble(); // Read the user's input for the length
        double periodPendulum = 2 * Math.PI * Math.sqrt(lengthPendulum / 9.8); // Calculate the period of the pendulum using the formula p = 2π √(l/g)
        System.out.printf("The period of the pendulum with length %.2f cm is: %.2f seconds%n", // Print the period result with two decimal places
                lengthPendulum, periodPendulum);

        // Farewell message
        System.out.println("Thank you for using the Geometry and Physics");
      }
    }
