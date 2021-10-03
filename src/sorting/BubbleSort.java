package sorting;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean hasChange = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    hasChange = true;
                }
            }
            if (!hasChange) break;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 35, -12, 1, 43, 50, 10};
        BubbleSort bbs = new BubbleSort();
        bbs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
