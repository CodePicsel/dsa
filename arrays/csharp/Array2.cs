class Array2{
    public static void Main(string[] args){
        //Move all the zero to the end of the arrays using two pointer
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int j =-1;
        for(int i=0; i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) Console.WriteLine("No Zeroz in Array");
        esle{
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    swap(arr, i,j);
                    j++;
                }
            }
        }

        void swap(int[] arr, int index1, int index2){
            if(arr!=null && index1!=index2){
                int temp = arr[index1];
                arr[index1]=arr[index2];
                arr[index2]=temp;
            }
        }
    }
}