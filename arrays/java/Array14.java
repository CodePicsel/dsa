import java.util.HashSet;
import java.util.Set;

class Array14{
    public static void main(String[] args){
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 5, 105, 104, 103, 1};
        // brute(arr);
        // better(arr);
        optimal(arr);
    }

    // N/P without HashMap->(n^2) or while loop->(n^3) 
    static void brute(int[] arr){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int temp=1;
            int x = arr[i];
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==x+1){
                    x++;
                    temp++;
                    cnt=Math.max(temp, cnt);
                }
            }
        }
        System.out.println(cnt);
    }
    
    static void better(int[] arr){
        sort(arr);
        int longest = 1, cnt=0, lastSmallest=-5000;
        for(int i=0; i<arr.length; i++){
            if(arr[i]-1==lastSmallest){
                cnt++;
                lastSmallest=arr[i];
            }else if(arr[i]!=lastSmallest){
                cnt=1;
                lastSmallest=arr[i];
            }
            longest=Math.max(longest, cnt);
        }
        System.out.println(longest);
    }
    
    static void optimal(int[] arr){
        Set<Integer> hashSet = new HashSet<>();
        int ans=0;
        for(int n : arr) hashSet.add(n);
        for(int i=0; i<arr.length; i++){
            int temp=0;
            if(hashSet.contains(arr[i]-1)==true){
                // System.out.println("Called: "+i);
                continue;
            }else if(hashSet.contains(arr[i]+1)==true){
                temp+=2;
                while(hashSet.contains(arr[i]+temp)) temp++;
            }
            ans = Math.max(ans, temp);
        }
        System.out.println(ans);
    }

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
}