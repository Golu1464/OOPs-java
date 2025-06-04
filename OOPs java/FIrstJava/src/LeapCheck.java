import java.util.*;
public class LeapCheck {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int y;
        System.out.println("Enter the year:");
        y= ob.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}
