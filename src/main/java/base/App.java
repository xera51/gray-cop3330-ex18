/*
 *  UCF COP3330 Summer 2021 Exercise 18 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        double oldTemp;
        double newTemp;

        // If user enters character other than 'C', 'c', 'F', 'f', behaviour is undefined
        char temperatureSystem = myApp.readTemperatureSystem();

        if(temperatureSystem == 'F') {
            oldTemp = myApp.readTemp("Celsius");
            newTemp = myApp.convertCToF(oldTemp);
            myApp.displayOutput("Fahrenheit", newTemp);
        } else {
            oldTemp = myApp.readTemp("Fahrenheit");
            newTemp = myApp.convertFToC(oldTemp);
            myApp.displayOutput("Celsius", newTemp);
        }
    }


    private char readTemperatureSystem() {
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%n" +
                "Press F to convert from Celsius to Fahrenheit.%n" +
                "Your choice: ");
        char out = in.nextLine().charAt(0);
        out = Character.toUpperCase(out);

        return out;
    }

    private double readTemp(String temperatureSystem) {
        System.out.printf("Please enter the temperature in %s: ", temperatureSystem);
        return Double.parseDouble(in.nextLine());
    }

    public double convertCToF(double C) {
        return (C * 9 / 5) + 32;
    }

    public double convertFToC(double F) {
        return (F - 32) * 5 / 9;
    }

    public void displayOutput(String temperatureSystem, double temperature) {
        System.out.printf("The temperature in %s is %.0f.%n",
                temperatureSystem, temperature);
    }
}
