import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        double cost;
        boolean cont = false;
        double total = 0;
        //inputs
        do {
            cost = InputHelper.getRangedDouble(scan, "Enter price of your item you got at the $10 store", 0.5, 9.99);
            total += cost;
            cont = InputHelper.getYNConfirm(scan, "Would you like to enter another item? [Y/N]");
        } while (!cont);

        //output
        System.out.printf("Total cost in $:%8.2f", total);

    }
}
