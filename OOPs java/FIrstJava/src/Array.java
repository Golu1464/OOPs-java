//Static array
import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        // Declare and initialize a static array with 5 elements
        int[] staticArray = new int[5];

        // Assign values to the array elements
        staticArray[0] = 10;
        staticArray[1] = 20;
        staticArray[2] = 30;
        staticArray[3] = 40;
        staticArray[4] = 50;

        // Print the array elements
        System.out.println("Static Array Elements:");
        for (int j : staticArray) {
            System.out.print(j + " ");
        }
    }
    //    Dynamic Array (ArrayList)
    public static void arr(String[] args) {
        // Create a dynamic array (ArrayList) with initial capacity 5
        ArrayList<Integer> dynamicArray = new ArrayList<>(5);

        // Add elements to the dynamic array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        // Print the dynamic array elements
        System.out.println("Dynamic Array Elements:");
        for (int element : dynamicArray) {
            System.out.print(element + " ");
        }

        // Dynamically add more elements to the array
        dynamicArray.add(60);
        dynamicArray.add(70);

        // Print the updated dynamic array elements
        System.out.println("\nUpdated Dynamic Array Elements:");
        for (int element : dynamicArray) {
            System.out.print(element + " ");
        }
    }
}





