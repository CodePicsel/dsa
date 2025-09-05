import java.util.*;

class Array3{
    public static void main(String[] args){
        int[] arr1={1,1,2,3,4,5};
	    int[] arr2={2,3,4,4,5,6};
	    unionOfArray(arr1, arr2);
    }

//Union using two Pointer method.
    static void unionOfArray(int[] arr1, int[] arr2){
	    int n1=arr1.length;
	    int n2=arr2.length;
	    int j=0;
	    int i=0;
        List<Integer> union = new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                // int lastElement = union.get(union.size()-1);
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) union.add(arr1[i]);
                i++;
            }else{
                // int lastElement = union.get(union.size()-1);
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) union.add(arr2[j]);
                j++;
            }
        }
        while(i<n1){
            // int lastElement = union.get(union.size()-1);
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) union.add(arr1[i]);
                i++;
        }
        while(j<n2){
            // int lastElement = union.get(union.size()-1);
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) union.add(arr2[j]);
                j++;
        }
        System.out.println(union); 

    }
}