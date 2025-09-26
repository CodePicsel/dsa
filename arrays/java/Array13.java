class Array13{
    public static void main(String[] args){
        int[] arr = {10, 22, 12, 3, 0, 6};
        //brute(arr);
        optimal(arr);
    }

    static void optimal(int[] arr){
        int[] ans = new int[arr.length];
        int currentMax=0, pos=0;
        for(int i = arr.length-1; i>=0; i--){
            int prev = Math.max(currentMax, arr[i]);
            if(prev>currentMax){
                ans[pos]=arr[i];
                pos++;
                currentMax=prev;
            }
        }
        for(int n:ans) System.out.println(n);
    }

    static void brute(int[] arr){
        int[] ans = new int[arr.length];
        int ansPos=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    break;
                }
                else if(j==arr.length-1){
                    ans[ansPos]=arr[i];
                    ansPos++;
                }
            }
        }
        for(int n:ans) System.out.println(n);
    }

} 