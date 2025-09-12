import java.util.Map;
import java.util.HashMap;

public class Array8{
    public static void main(String []args){
        int[] arr = {2,3,3,4,3,3,1};
        // majorityElement(arr);
        // majorityElementBetter(arr);
        majorityElementOptimal(arr);
    }

    //Brute Force
    static void majorityElement(int[] arr){
        int half = arr.length/2;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>half){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    //Better Approach...
    static void majorityElementBetter(int[] arr){
        int half = arr.length/2;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<n;i++){
        //     if(map.containsKey(arr[i])){
        //         int temp = map.get(arr[i]);
        //         temp++;
        //         map.put(arr[i], temp);
        //     }else{
        //         map.put(arr[i], 1);
        //     }
        // }
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        //O(n)
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>half){
                System.out.println(e.getKey());
                break;
            }
        }
        //O(m)
    }
    //Total Time Complexity: O(n+m)

    //Optimal Approach...
    static void majorityElementOptimal(int[] arr){
        int element = 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }else if(arr[i]==element) count++;
            else count--;
        }
        int elementCount = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==element) elementCount++;
        }
        if(elementCount>(arr.length)/2) System.out.println(element);
    }


}