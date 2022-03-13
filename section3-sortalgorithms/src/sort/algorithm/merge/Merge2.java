package sort.algorithm.merge;

import java.util.Arrays;
import java.util.Random;

public class Merge2 {
    public static void main(String[] args) {
        int [] intArray = new int[10];

        Random rand = new Random();
        rand.setSeed(225);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }

//        System.out.println("before:");
        System.out.println(Arrays.toString(intArray));

        long startTime = System.currentTimeMillis();
        mergeSort(intArray);
        long endTime = System.currentTimeMillis();

//        System.out.println("after:");
        System.out.println(Arrays.toString(intArray));

        System.out.println("time taken: " + (endTime-startTime));


//        for (int i : intArray) {
//            System.out.println(i);
//        }
    }

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
//            System.out.println("return");
            return;
        }

        int midIndex = inputArray.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i-midIndex] = inputArray[i];
        }

//        System.out.println("mergeSort left half");
        mergeSort(leftHalf);

//        System.out.println("mergeSort right half");
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
