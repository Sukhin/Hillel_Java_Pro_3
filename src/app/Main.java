package app;

public class Main {

    private static final double CONV_K1 = 0.56;

    public static void main(String[] args) {

        System.out.println("Welcome to the program for converting units of temperature!");
        System.out.print("\n");
        double FahrenheitInput = 70.2;
        double CelsiusOutput = convFtoC(FahrenheitInput);
        System.out.printf("Value of temperature in %.3f degrees Fahrenheit, converting to %.3f degrees Celsius.", FahrenheitInput, CelsiusOutput);

    }

    private static double convFtoC(double fahrenheit) {

        return CONV_K1 * (fahrenheit - 32);

    }

}