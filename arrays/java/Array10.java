public class Array10{
    public static void main(String[] args){
        int[] arr = {-1,2,3,4,-3,1};
        arrangingPositiveNegativeAndRemainings(arr);
    }
    static void arrangingPositiveNegativeAndRemainings(int[] arr){
        int[] pos=new int[arr.length];
        int posArrPos=0;
        int[] neg=new int[arr.length];
        int negArrPos=0;
        for(int n:arr){
            if(n>0){
                pos[posArrPos]=n;
                posArrPos++;
            }else{
                neg[negArrPos]=n;
                negArrPos++;
            }
        }
        int lpos=0, lneg=0;
        for(int i=0; i<arr.length; i++){
            if(i%2!=0 && neg[lneg] != 0){
                arr[i] = neg[lneg];
                lneg++;
            }else if(i%2==0 && pos[lpos] != 0){
                arr[i]=pos[lpos];
                lpos++;
            }
        }
        for(int n:arr) System.out.println(n);
        // for(int n:pos) System.out.println(n);
        // for(int n:neg) System.out.println(n);
    }
}

