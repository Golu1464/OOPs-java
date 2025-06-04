import java.util.*;
public class LarArr {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = ob.nextInt();
        }
        int lar = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        System.out.println("Largest number in this array:"+lar);
        int slar = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] != lar) {
                if (arr[i] > slar) {
                    slar = arr[i];
                }
            }
        }
        System.out.println("Second Largest number in this array:"+slar);
    }
}
