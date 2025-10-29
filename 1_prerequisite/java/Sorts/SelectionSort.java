class SelectionSort{
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<arr[smallest]) smallest = j;
            }
            swap(arr, smallest, i);
        }
        for (int n : arr) System.out.println(n);
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}