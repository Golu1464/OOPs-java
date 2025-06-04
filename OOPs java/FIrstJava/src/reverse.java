import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        String s1;
        System.out.println("Input a string");
        s1=ob.next();
        if (s1.length()%2 == 0 ) {
            String s=" ";
            int i;
            for (i = s1.length()-1; i >= 0 ; i--) {
                s= s + s1.charAt(i);
        }
            System.out.println("The reversed string is"+s);
    }
}}
