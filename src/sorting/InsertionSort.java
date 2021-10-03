package sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int elm = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= elm) break;
                swap(arr, j, j + 1);
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 35, -12, 1, 43, 50, 10};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
