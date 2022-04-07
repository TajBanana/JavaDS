package sort.algorithm.bucket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bucket {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(intArray);

        for (int i: intArray) {
            System.out.println(i);
        }
    }

    private static void bucketSort(int[] inputArray) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //System.out.println(Arrays.toString(buckets));

        for (int i: inputArray) {
            buckets[hash(i)].add(i);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int i : bucket) {
                inputArray[j++] = i;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
