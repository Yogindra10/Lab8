import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        double celsius;
        double fahrenheit;

        //inputs
        Scanner scan = new Scanner(System.in);
        celsius = InputHelper.getDouble(scan, "Enter temperature in celcius");
        fahrenheit = ((double) 9/5) * celsius +32;

        //outputs

        System.out.printf("The equivalent value of " + celsius + "°C to Fahrenheit is " + fahrenheit +"°F" );


    }

    public static double CtoF(double celsius) {

        double fahrenheit;

         fahrenheit = ((double) 9/5) * celsius +32;

         return fahrenheit;
    }
}
