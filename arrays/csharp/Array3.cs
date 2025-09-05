public class Array3{
    public static void Main(string []args){
        int[] arr1={1,1,2,3,4,5};
	    int[] arr2={2,3,4,4,5,6};
	    UnionOfArray(arr1, arr2);
    }

    void UnionOfArray(int[] arr1,int[] arr2){
        int n1 = arr1.Length;
        int n2 = arr2.Length;
        List<int> union = new List<int>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(union.Count==0 || union[union.Count-1]!=arr1[i]) union.Add(arr1[i]);
                i++;
            }else{
                if(union.Count==0 || union[union.Count-1]!=arr2[j]) union.Add(arr2[j]);
                j++;
            }
        }
        while(i<n1){
            if(union.Count==0 || union[union.Count-1]!=arr1[i]) union.Add(arr1[i]);
            i++;
        }
        while(j<n2){
            if(union.Count==0 || union[union.Count-1]!=arr2[j]) union.Add(arr2[j]);
            j++;
        }
    }

}