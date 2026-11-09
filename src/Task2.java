import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int favInt = InputHelper.getInt(scan, "Enter your favorite integer");
        double favDouble = InputHelper.getDouble(scan,"Enter your favorite double");

        //outputs
        System.out.println("Your favorite Integer is " + favInt + " and your favorite double is " + favDouble);



    }
}
