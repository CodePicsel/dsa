class Array14{
    public static void main(String[] args){
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        brute(arr);
        optimal(arr);
    }

    // N/P without HashMap->(n^2) or while loop->(n^3) 
    static void brute(int[] arr){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int temp=1;
            int x = arr[i];
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==x+1){
                    x++;
                    temp++;
                    cnt=Math.max(temp, cnt);
                }
            }
        }
        System.out.println(cnt));
    }
    static void optimal(int[] arr){
        
    }

}