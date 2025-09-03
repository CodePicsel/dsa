
class ArrayManu1{
    public static void main(String []args){
        int[] nums={1,2,3,4,5};
        int d=2;
        ArrayManu1 am = new ArrayManu1();

        //Rotating Array by 1 Place...
        // am.rotationBy1Places(nums);

        //Rotating Array by D places
        am.rotationByDPlaces(d, nums);
        // am.spaceOptimalRotationByDPlaces(d, nums);

    }

    void rotationBy1Place(int[] nums){
        int initial = nums[0];
        for(int i=0;i<nums.length; i++){
            if(i+1<nums.length)nums[i]=nums[i+1];
            else nums[nums.length-1]=initial;
        }
        System.out.println(java.util.Arrays.toString(nums));        
    }

    void rotationByDPlaces(int d, int[] nums){
        int n = nums.length;
        if (n <= 1) return;
        d %= n;
        int[] temps=new int[d];
        for(int i=0;i<d;i++) temps[i]=nums[i];
        for(int i=d; i<nums.length;i++) nums[i-d]=nums[i];
        for (int i = 0; i < d; i++) nums[n - d + i] = temps[i];
        System.out.println(java.util.Arrays.toString(nums)); 
    }

    void spaceOptimalRotationByDPlaces(int d, int[] nums){
    //no readymade reverse function for arrays in java
        nums = reverse(nums, 0, d-1);
        nums = reverse(nums, d, nums.length-1);
        nums = reverse(nums, 0, nums.length-1);
        System.out.println(java.util.Arrays.toString(nums)); 
    }

    int[] reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }

}