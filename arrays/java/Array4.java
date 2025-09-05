import java.util.*;


class Array4{
    public static void main(String[] args){
        int[] arr1={1, 2, 3, 4, 5};
	    int[] arr2={2, 4, 6, 8}; // o/p: 2, 4
        intersectionOfArrays(arr1, arr2);
    }
    static void intersectionOfArrays(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> intersection = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]) {
                intersection.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]) i++;
            else j++;
        }
        System.out.println(intersection); 
    }
}