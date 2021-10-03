package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] input = {42, 46, 92, 78, 91, 43, 34, 51, 55, 10, 11, 15, 68, 62};
        System.out.println(Arrays.toString(input));
        bucketSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void bucketSort(int[] input) {
        int size = 10;
        List<Integer>[] buckets = new List[size];

        // scatter phase: values of bucket [i - 1] < values of bucket[i] < values of bucket[i + 1]
        for (int i = 0; i < size; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        // sort each bucket: usually use insertion sort, here we use merge sort
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // merge phase: collect values from sorted buckets
        int pos = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                input[pos++] = buckets[i].get(j);
            }
        }
    }

    public static int hash(int value) {
        return (value / 10)  % 10;
    }
}
