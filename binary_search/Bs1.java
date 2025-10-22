class Bs1{
    public static void main(String[] args){
        int[] arr = {3,4,6,7,12,16,17};
        int target = 6;
        linearSearch(arr, target);
        // binarySearch(arr, target);
    }
    static void linearSearch(int[] arr, int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target "+target+" exists at: "+i);
                break;
            }else if(i==arr.length-1 && arr[i]!=target){
                System.out.println("Target "+target+" doesnt exists in given Array.");
            }
        }
    }
}