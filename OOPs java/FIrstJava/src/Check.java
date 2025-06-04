import java.util.*;
public class Check {
    public static void main(String[] args) {
        char ch;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input a Character");
        ch =ob.next().charAt(0);
        if (Character.isLetter(ch))
        {
            System.out.println("Given character is a letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Given character is a Digit");
        } else if (Character.isWhitespace(ch)) {
            System.out.println("Given character is a Whitespace");
        }
        else {
            System.out.println("Given character is a Symbol");
        }
    }
}
