public class Array6{
    public static void Main(string[] args){
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        longestSubarrayOfSumKUsingHashMap(arr, k);
    }
    void longestSubarrayOfSumKUsingHashMap(int[] arr,int k){
        var dict = new Dictionary<int, int>();
        int s =0, n=arr.Length, maxxLen=0;
        for(int i = 0; i<n; i++){
            s+=arr[i];
            dict.Add(s, i);
            int diff=s-k;
            if(s>k){
                if(dict.ContainsKey(diff)){
                    maxLen=max(maxLen, i-dict[diff]);
                }
            }
        }
        Console.WriteLine(maxLen);
    }
    int max(int i, int j){
        if(i<j)return j; 
        else if(i>j)return i;
        else return i;
    }
}