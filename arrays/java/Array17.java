import java.util.Map;
import java.util.HashMap;

class Array17{
    public static void main(String[] args){
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k =3;
        // brute(arr, k);
        optimal(arr);
    }
    static void brute(int[] arr,int k){
        int count=0;
        for(int i = 0; i< arr.length; i++){
            int sum=0;
            for(int j = i; j< arr.length; j++){
                sum+=arr[j];
                if(sum==k) count++;
            }
        }
        System.out.println(count);
    }
    static void optimal(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        
        for (Map.Entry<Integer,Integer> e : map.entrySet()) System.out.println(e.getKey() + " => " + e.getValue());
    }
} 