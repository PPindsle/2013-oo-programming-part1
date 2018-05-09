import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array) {
        // write the code here
        int smallestNumber = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber <= array[i]) {
                
            } else {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }
    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int index = 0;
        int smallestNumber = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallestNumber = array[index];
        
        for (int i = index; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int swap1 = array[index2];
        int swap2 = array[index1];
        
        array[index1] = swap1;
        array[index2] = swap2;
    }
    public static void sort(int[] array) {
        for (int number : array) {
            System.out.print(number);
        }
        System.out.println("");
        
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            for (int number : array) {
                System.out.print(number);
            }
            System.out.println("");
        }
    }
  
}
