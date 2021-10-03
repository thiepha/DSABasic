package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-10, 20, 22, 90, 80, 32, 45, -20, 31, -21, 45};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end - start <= 1) return;

        int pivotPos = partition(arr, start, end);
        quickSort(arr, start, pivotPos);
        quickSort(arr, pivotPos + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start]; // pivot as element at position 0
        int i = start, j = end;
        while (i < j) {
            while (i < j && arr[--j] > pivot);
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] < pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = pivot;
        return i;
    }
}
