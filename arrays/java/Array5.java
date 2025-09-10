import java.util.HashMap;
import java.util.Map;

public class Array5{
    public static void main(String []args){
        int[] arr={1, 1, 2, 3, 3, 4, 4, 5, 5};
        missingInTwice(arr);
        missingInTwiceOptimal(arr);
    }

    static void missingInTwice(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                temp++;
                map.put(arr[i], temp);
            }else{
                map.put(arr[i], 1);
            }
        }
        // O(n)

        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            //  System.out.println(e.getKey() + " => " + e.getValue());
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break; //Dont use Break For multiple Missing Twins
            } 
        }
        //O(n/2)


        //Total time Complexity: O(n)+O(n/2) = O(2n)
        //Total space Complexity: O(n)

    }
        //-------- Optimal Solution --------//
    static void missingInTwiceOptimal(int[] arr){
        int xorr=0;
        for(int i = 0; i<arr.length; i++){
            xorr=xorr^arr[i];
        }
        System.out.println(xorr);
    }
}