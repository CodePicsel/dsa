class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {14, 9, 15, 12, 6, 8, 13};
        for (int i = 1; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
                j--;
            }
        }
        for (int x : arr) System.out.print(x + " ");
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
