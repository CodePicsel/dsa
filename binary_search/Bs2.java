//Lower Bound => such that smallest index wwill be arr[index]>=target

class Bs2{
    public static void main(String[] ags){
        int[] arr = {1,2,3,3,5,8,8,10,10,11};
        int target=9;
        // brute(arr, target);
        optimal(arr, target);
    }
    static void optimal(int[] arr, int target){
        int answer=-1;
        int left=0, right=arr.length-1, mid=(right+left-1)/2;
        while(left<right){
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]>target){
                right=mid-1;
                low=0;
                mid=(right+left-1)/2;
            }
        }
    }
    static void brute(int[] arr, int target){
        int answer = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>target){
                answer=arr[i];
                break;
            }
        }
        System.out.println(answer);
    }
}