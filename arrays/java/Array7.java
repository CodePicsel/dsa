import java.util.HashMap;
import java.util.Map;


public class Array7{
    public static void main(String[] args){
        int[] arr = {0,1,1,0,2,0,1,2}; 
        // sortIn012(arr);
        sortIn012Optimal(arr);
    }
    //(key, value)
    static void sortIn012(int[] arr){
        int[] hash = new int[3];
        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]==0) hash[0]++;
            else if(arr[i]==1) hash[1]++;
            else hash[2]++;
        }
        System.out.println(java.util.Arrays.toString(hash)); 
        for(int i=0; i<n; i++){
            if(hash[0]>0){
                arr[i] = 0;
                hash[0]--;
            }
            else if(hash[1]>0){
                arr[i] = 1;
                hash[1]--;
            }
            else{
                arr[i] = 2;
                hash[2]--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    //National Dutch Flag Algorithm...
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static void sortIn012Optimal(int[] arr){
        int low = 0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++; low++; 
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int index1, int index2){
        if(arr!=null && index1!=index2){
            int temp = arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
    }
}