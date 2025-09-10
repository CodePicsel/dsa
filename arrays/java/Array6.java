import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

class Array6{

    public static void main(String []args){

        // Print Max Length of SubArray of Array "arr" whoes elements summation results in k (k=3).

        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        // longestSubarrayOfSumK(arr, k);
        longestSubarrayOfSumKUsingHashing(arr, k);
    }

    static void longestSubarrayOfSumKUsingHashing(int[] arr, int k){
        //[summation per n, n]
        Map<Integer, Integer> map = new HashMap<>();
        int s =0, n = arr.length, maxLen= 0;
        for(int i = 0; i<n; i++){
            s+=arr[i];
            map.put(s, i);
            int diff=s-k;
            if(s>k){
                if(map.containsKey(diff)){
                    maxLen=max(maxLen, i-map.get(diff));
                }
            }
        }
        System.out.println(maxLen);
    }

    static void longestSubarrayOfSumK(int[] arr,int k){
        int n = arr.length;
        int lenMax=0;
        
        for(int i=0; i<n;i++){
            int s=0;
            for(int j = i; j<n;j++){
                s+=arr[j];
                if(s>=k) {
                    int tmp = max(lenMax, j-i+1);
                    lenMax = tmp;
                }
                
            }
        }
        // System.out.println(max(5, 2));
        System.out.println(lenMax);
    }

    static int max(int i, int j){
        if(i<j)return j; 
        else if(i>j)return i;
        else return i;
    }
}