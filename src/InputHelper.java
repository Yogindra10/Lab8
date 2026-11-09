import java.util.Scanner;

public class InputHelper {
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;

        System.out.println(prompt);

        do {
            s = scan.nextLine();

            if (s.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error, Try Again.");
            }
        } while (!valid);

        return s;
    }

    public static int getInt(Scanner scan, String prompt) {
        int n =0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if(scan.hasNextInt()) {
                n = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error Please Try again");
            }

            scan.nextLine();
        }while(!valid);

        return n;

    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String input;
        boolean valid = false;

        System.out.println(prompt);

        do {
            input = scan.nextLine();

            if (input.equalsIgnoreCase("N")) {
                valid = true;
                return true;
            } else if (input.equalsIgnoreCase("Y")) {
                valid = true;
                return false;
            } else {
                System.out.println("Error, Please Try Again");
            }
        }while (!valid);

        return false;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double d = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                d = scan.nextDouble();
                valid = true;
            }else {
                System.out.println("Error, Please Try Again");
            }

                scan.nextLine();
        }while(!valid);


        return d;
    }

    public static String getRegExString(Scanner scan, String prompt, String regexPattern) {
        String s;
        boolean valid = false;

        System.out.println(prompt);
        do {
            s= scan.nextLine();
            if (s.matches(regexPattern)){
                valid = true;
            }else {
                System.out.println("Error your input must match specified pattern");
            }
        } while (!valid);
        return s;
    }


    public static int getRangedInt(Scanner scan, String prompt, int min, int max){
        int n = 0;
        boolean valid = false;

        System.out.println(prompt);

        do{
            if (scan.hasNextInt()){
                n = scan.nextInt();

                if (n<= max && n>= min){
                    valid = true;
                }else {
                    System.out.println("Error you must enter a value within the range");
                }

            } else {
                System.out.println("Error please try again with integer value");
            }

            scan.nextLine();
        }while(!valid);

        return n;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double d = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                d = scan.nextDouble();

                if (d <= max && d>= min){
                    valid = true;
                }else {
                    System.out.println("Error Try again with a double within the range");
                }
            } else {
                System.out.println("Please enter a Valid double value");
            }

            scan.nextLine();
        }while(!valid);

        return d;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int n = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if(scan.hasNextInt()){
                n=scan.nextInt();

                if (n>0) {
                    valid = true;
                }else {
                    System.out.println("Error please enter a positive non-zero integer");
                }
            } else {
                System.out.println("Error you must enter an integer value");
            }

            scan.nextLine();
        }while(!valid);

        return n;
    }
}