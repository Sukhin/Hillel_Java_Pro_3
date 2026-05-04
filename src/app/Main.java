package app;

public class Main {

    private static final double FAHRENHEIT_TO_CELSIUS_MULTIPLIER = 0.56;
    private static final double CELSIUS_TO_FAHRENHEIT_MULTIPLIER = 1.8;
    private static final double CONVERSION_OFFSET = 32;

    public static void main(String[] args) {

        System.out.println("Welcome to the program for converting units of temperature!");
        double fahrenheitInput = 70.2;
        double celsiusInput = 40.5;
        double celsiusOutput = convFahtoCel(fahrenheitInput);
        double fahrenheitOutput = convCeltoFah(celsiusInput);
        System.out.printf("Value of temperature in %.3f degrees Fahrenheit, converting to %.3f degrees Celsius. %n", fahrenheitInput, celsiusOutput);
        System.out.printf("Value of temperature in %.3f degrees Celsius, converting to %.3f degrees Fahrenheit. %n", celsiusInput, fahrenheitOutput);

    }

     private static double convFahtoCel(double fahrenheit) {

        return FAHRENHEIT_TO_CELSIUS_MULTIPLIER * (fahrenheit - CONVERSION_OFFSET);
    }

     private static double convCeltoFah(double celsius) {

        return CELSIUS_TO_FAHRENHEIT_MULTIPLIER * celsius + CONVERSION_OFFSET;
    }
}