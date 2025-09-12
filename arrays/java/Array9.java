public class Array9{
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int k = 7;
        maximumSubarraySum(arr, k);
    }
    static void maximumSubarraySum(int[] arr, int k){
        int maximum=Integer.MIN_VALUE;
        int sum=0, saStart=0, saEnd=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum>maximum){
                maximum=sum;
                saEnd=i;
            }
            if(sum<0){
                sum=0;
                saStart=i+1;
            }
        }
        System.out.print(maximum+", "+saStart+", "+saEnd);
    }
}