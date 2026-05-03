package app;

public class Main {

    private static final double CONV_K1 = 0.56;
    private static final double CONV_K2 = 1.8;

    public static void main(String[] args) {

        System.out.println("Welcome to the program for converting units of temperature!");
        System.out.print("\n");
        double FahrenheitInput = 70.2;
        double CelsiusInput = 40.5;
        double CelsiusOutput = convFtoC(FahrenheitInput);
        double FahrenheitOutput = convCtoF(CelsiusInput);

        System.out.printf("Value of temperature in %.3f degrees Fahrenheit, converting to %.3f degrees Celsius.", FahrenheitInput, CelsiusOutput);
        System.out.print("\n");
        System.out.printf("Value of temperature in %.3f degrees Celsius, converting to %.3f degrees Fahrenheit.", CelsiusOutput, FahrenheitOutput);

    }

    private static double convFtoC(double fahrenheit) {

        return CONV_K1 * (fahrenheit - 32);

    }

    private static double convCtoF(double celsius) {

        return CONV_K2 * celsius + 32;

    }

}