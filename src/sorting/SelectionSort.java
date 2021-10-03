package sorting;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int mpos = i;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[mpos]) {
                    mpos = j;
                }
            }
            if (mpos != i) {
                swap(arr, mpos, i);
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
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
