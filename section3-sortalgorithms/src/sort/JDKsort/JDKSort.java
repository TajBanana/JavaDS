package sort.JDKsort;

import java.util.Arrays;

public class JDKSort {
    public static void main(String[] args) {
        int[] intArray = new int[10000];

        for (int i=0; i < 9999; i++){
            intArray[i]= (int) (Math.random()*10000);
        }

//        good for smaller data sets
        long sortStart = System.nanoTime();
        Arrays.sort(intArray);
        long sortEnd = System.nanoTime();
        System.out.println(sortEnd);
        System.out.println(sortStart);
        System.out.println(sortEnd-sortStart);
        System.out.println("");

//        good for lager data sets
        int[] intArray2 = new int[100];

        for (int i=0; i < 9999; i++){
            intArray[i]= (int) (Math.random()*10000);
        }
        long parallelSortStart = System.nanoTime();
        Arrays.parallelSort(intArray2);
        long parallelSortEnd = System.nanoTime();
        System.out.println(parallelSortEnd-parallelSortStart);

/*        for (int i:intArray) {
            System.out.println(i);
        }*/
    }
}