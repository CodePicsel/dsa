class Array11{
    public static void main(String[] args){
        int[] arr = {3,2,1};
        int min=Integer.MAX_VALUE, minPos=0, nextMin=Integer.MAX_VALUE;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                min=arr[i];
                minPos=i;
                break;
            }
        }    
        if(min==Integer.MAX_VALUE){
            sort(arr, 0);
        }else{
            for(int i=arr.length-1; i>=0; i--){
                if(arr[i]>min){
                    nextMin=arr[i];
                    swap(arr, minPos, i);
                    break;
                }
            }
            sort(arr, minPos+1);
        }
        // for(int i = 0; i<arr.length; i++){
        //         if(arr[i]!=0){
        //             min=Math.min(min, arr[i]);
        //             if(arr[i]==min) minPos=i;
        //         }
        //     }
        //     for(int i = minPos+1; i<arr.length; i++){
        //         if(arr[i]!=0){
        //             if(min<Math.min(nextMin, arr[i])){
        //                 nextMin=Math.min(nextMin, arr[i]);
        //                 if(arr[i]==nextMin) nextMinPos=i;
        //             }
        //         }
        //     }
        //     swap(arr, minPos, nextMinPos);
        //      (arr, minPos+1);
            for(int n:arr) System.out.println(n);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort(int[] arr, int start){
        if (arr == null) return;
        int n = arr.length;
        if (start < 0) start = 0;
        if (start >= n - 1) return; // nothing to sort

        int left = start;
        int right = n - 1;

        while (left < right) {
            int minIdx = left;
            int maxIdx = left;

            // find min and max between left..right
            for (int i = left + 1; i <= right; i++) {
                if (arr[i] < arr[minIdx]) minIdx = i;
                if (arr[i] > arr[maxIdx]) maxIdx = i;
            }

            // place min at left
            if (minIdx != left) {
                swap(arr, minIdx, left);
                if (maxIdx == left) {
                    maxIdx = minIdx;
                }
            }

            // place max at right
            if (maxIdx != right) {
                swap(arr, maxIdx, right);
            }

            left++;
            right--;
        }
    }
}