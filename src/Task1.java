import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan, "Enter your username");

        System.out.println("The username you entered is :" +  name);
    }
}

