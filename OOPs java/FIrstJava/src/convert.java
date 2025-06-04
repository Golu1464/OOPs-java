import java.util.*;
public class convert {
    public static void main(String[] args) {
        char ch;
        char i;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a character");
        ch = ob.next().charAt(0);
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)){
               i = Character.toLowerCase(ch);
               System.out.println("It is a uppercase letter");
               System.out.println("It's Lowercase ="+i);
            } else if (Character.isLowerCase(ch)) {
                i = Character.toUpperCase(ch);
                System.out.println("It is a Lowercase letter");
                System.out.println("It's Uppercase ="+i);
            }
        else {
                System.out.println("Invalid input");
            }
        }
    }
}
