package search;

public class BinarySearch {
    // find position of a value in array arr, if not found, return -1
    public static int binarySearch(int[] arr, int value) {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }
}
