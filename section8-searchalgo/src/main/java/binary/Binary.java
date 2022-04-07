package binary;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Binary {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Arrays.sort(intArray);

/*        System.out.println(Arrays.toString(intArray));
        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(iterativeBinarySearch(intArray, 0));*/

        System.out.println(Arrays.toString(intArray));
        System.out.println(recursiveBinarySearch(intArray, 55));
        System.out.println(recursiveBinarySearch(intArray, 0));

    }

    public static int iterativeBinarySearch(int[] inputArray, int value) {
        int start = 0;
        int end = inputArray.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("midpoint: " + midpoint);
            if (inputArray[midpoint] == value) {
                return midpoint;
            }
            else if (inputArray[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] inputArray, int value) {
        return recursiveBinarySearch(inputArray, 0, inputArray.length, value);
    }

    public static int recursiveBinarySearch(int[] inputArray, int start, int end, int value){
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        System.out.println("midpoint: " + midpoint);

        if (inputArray[midpoint] == value) {
            return midpoint;
        }
        else if (inputArray[midpoint] < value) {
            return recursiveBinarySearch(inputArray, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(inputArray, start, midpoint, value);
        }
    }
}