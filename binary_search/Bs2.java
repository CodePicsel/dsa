//Lower Bound => such that smallest index wwill be arr[index]>=target

class Bs2{
    public static void main(String[] ags){
        int[] arr = {1,2,3,3,5,8,8,10,10,11};
        int target=9;
        // brute(arr, target);
        optimal(arr, target);
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
    static void optimal(int[] arr, int target){
        int answer=-1;
        int i=0;
        int left=0, right=arr.length-1, mid=(right+left-1)/2;
        while(left<right){
            System.out.println("Loop: "+i);
            System.out.println(left);
            System.out.println(mid);
            System.out.println(right);
            i++;
            if(arr[mid]==target){
                answer = arr[mid];
            }else if(arr[mid]>target){
                right=mid-1;
                mid=(right+left-1)/2;
            }else if(arr[mid]<target){
                left=mid+1;
                mid=(right+left-1)/2;
            }
        }
            System.out.println(answer);
    }
}