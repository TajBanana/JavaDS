package sort.algorithm.insertion;

import java.util.Arrays;

public class InsertionRecursive {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertionSort(intArray, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void insertionSort(int[] inputArray, int numItems) {
        if ( numItems < 2) {
            return;
        }

        System.out.println("numItems: " + numItems);
        insertionSort(inputArray, numItems - 1);

        int newElement = inputArray[numItems - 1];
        System.out.println("newElement: " + newElement);
        int i = numItems - 1;
        System.out.println("i: " + i);

        while ( i > 0 && inputArray[i-1] > newElement) {
            System.out.println("entered while loop");
            inputArray[i] = inputArray[i-1];
            i--;
        }

        inputArray[i] = newElement;
        System.out.println(Arrays.toString(inputArray));
    }
}
