package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {-10, 20, 22, 90, 80, 32, 45, -20, 31, -21, 45};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end - 1) return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] < arr[mid]) return;

        int i = start, j = mid;
        int[] tmp = new int[end - start];
        int pos = 0;

        while (i < mid && j < end) {
            tmp[pos++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + pos, mid - i);
        System.arraycopy(tmp, 0, arr, start, pos);
    }
}
