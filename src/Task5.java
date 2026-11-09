import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        String ssn;
        String mNum;
        String mChoice;

        //inputs
        ssn = InputHelper.getRegExString(scan,"Enter Social Security Number [xxx-xx-xxxx] ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your Social Security is " +ssn);
        mNum = InputHelper.getRegExString(scan, "Enter your M number [Mxxxxx]: ", "(M|m)\\d{5}");
        System.out.println("Your M number is " + mNum);
        mChoice = InputHelper.getRegExString(scan, "\nMenu| O - Open, S - Save, V - View, Q- Quit", "[OoSsVvQq]");
        System.out.println("You chose to " + mChoice);
        //outputs

    }
}
