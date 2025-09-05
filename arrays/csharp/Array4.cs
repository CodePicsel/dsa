public class Array4{
    public static void Main(string []args){
        int[] arr1={1, 2, 3, 4, 5};
	    int[] arr2={2, 4, 6, 8}; // o/p: 2, 4
        IntersectionOfArrays(arr1, arr2);
    }

    void IntersectionOfArrays(int[] arr1, int[] arr2){
        int n1=arr1.Length, n2=arr2.Length;
        List<int> intersection = new List<int>();
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                intersection.Add(arr1[i]);
                i++; j++;
            }else if(arr[i]<arr[j]) i++;
            else j++;
        }
        foreach(int k in intersection) Console.WriteLine(k);
    }

}