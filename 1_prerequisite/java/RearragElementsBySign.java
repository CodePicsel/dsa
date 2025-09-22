import java.util.ArrayList;

 class RearragElementsBySign{
    public static void main(String[] args){
        int[] arr={-1, 1};
        // brute(arr);
        optimal(arr);
    }

    // static void brute(int[] arr){
    //     // ArrayList<Integer> posArr = new ArrayList();
    //     // ArrayList<Integer> negArr = new ArrayList();
    //     for(int i=0; i<arr.length;i++){
    //         int temp=0;
    //         if(arr[i]>0){ 
    //             posArr.add(arr[i]);
    //         }else{
    //             negArr.add(arr[i]);
    //         }
    //     }
    //     for(int i=0; i<arr.length/2;i++){
    //             arr[2*i]=posArr.get(i);
    //             arr[2*i+1]=negArr.get(i);
    //     }
    //     for(int a:arr){
    //         System.out.println(a);
    //     }
    // }

    static void optimal(int[] arr){
        int neg=1, pos=0, i=0;
        int[] ans = new int[arr.length];
        while(neg<arr.length || pos<arr.length-1){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }else{
                ans[neg]=arr[i];
                neg+=2;
            }
            i++;
        }
        for(int a:ans){
            System.out.println(a);
        }
    }

}

