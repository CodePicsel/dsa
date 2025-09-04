class Array2{
    public static void main(String []args){
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int j =-1;
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(arr[i]==0){
                j=i;                
                break;
            }
        }
        if(j==-1) System.out.println("No Zeros in Given Array");
        else{
            for(int i=j+1;i<n; i++){
                if(arr[i]!=0){
                    swap(arr, i, j);
                    j++;
                }
            }
        }
        
        System.out.println(java.util.Arrays.toString(arr)); 
    }

    static void swap(int[] arr, int index1, int index2){
        if(arr!=null && index1!=index2){
            int temp = arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
    }

}