import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Your Birthdate (yyyy-mm-dd):");
        String BirthStr = ob.nextLine();
        LocalDate Birthdate = LocalDate.parse(BirthStr);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(Birthdate, currentDate);

        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("Your age is " +years+ " Years " +months+ " Months " +days+ " days");
    }
}
