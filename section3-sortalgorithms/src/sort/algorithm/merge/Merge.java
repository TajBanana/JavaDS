package sort.algorithm.merge;

public class Merge {
    public static void main(String[] args) {
        int [] intArray = { 20, 35, -15, 7, 55, 1, -22};


        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

//      left array
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]) {
            return;
        }
    }

}
