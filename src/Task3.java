import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        int yr;
        int month;
        int day;
        int hr;
        int min;


        //inputs
        yr = InputHelper.getRangedInt(scan, "Enter Birth year (1950-2010)", 1950, 2010);
        month = InputHelper.getRangedInt(scan, "Enter Birth month (1-12)", 1, 12);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = InputHelper.getRangedInt(scan,"Enter Birthday (1-31)", 1, 31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = InputHelper.getRangedInt(scan, "Enter Birth day (1-30)", 1, 30);
        } else {
            day = InputHelper.getRangedInt(scan, "Enter Birth day (1-29)", 1, 29);
        }

        hr = InputHelper.getRangedInt(scan, "Enter birth hour (1-24)", 1, 24);
        min = InputHelper.getRangedInt(scan, "Enter birth minute (1-59)", 1, 59);

        //outputs
        System.out.println("Year " + yr);
        System.out.println("Month " + month);
        System.out.println("Day " + day);
        System.out.println("Hour " + hr);
        System.out.println("Minute " + min);
    }
}
