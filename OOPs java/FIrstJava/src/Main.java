// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int x,y;
        Scanner ob= new Scanner(System.in);
        System.out.println("Input two numbers");
        x=ob.nextInt();
        y=ob.nextInt();
        if (x==y){
            System.out.println("Numbers are equal");
        } else if (x>y){
            System.out.println(y+" is the smaller number");
        }else {
            System.out.println(x+" is the smaller number");
        }
    }
}