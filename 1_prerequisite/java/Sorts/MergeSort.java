/*
Merge sort is a divide-and-conquer algorithm:
    Divide the array into two halves.
    Conquer: recursively sort each half.
    Merge the two sorted halves into one sorted array.

Properties:
    Time complexity: O(n log n) (best/average/worst).
    Space complexity: O(n) extra (for temporary arrays).
    Stable (if merge preserves equal-order).
    Good for large data and predictable performance.
*/

public class MergeSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        mSort(arr, 0, arr.length - 1);
    }

    private static void mSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mSort(arr, low, mid);
        mSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];
        for (int t = 0; t < temp.length; t++) {
            arr[low + t] = temp[t];
        }
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        MergeSort.sort(arr);
        for (int n : arr) System.out.println(n);
    }
}
