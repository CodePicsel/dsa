
class ArrayManu1{
    public static void main(String []args){
        int[] nums={1,2,3,4,5};
        ArrayManu1 am = new ArrayManu1();

        //Rotating Array by 1 Place...
        am.rotateBy1(nums);
    }

    void rotateBy1(int[] nums){
        int initial = nums[0];
        for(int i=0;i<nums.length; i++){
            if(i+1<nums.length)nums[i]=nums[i+1];
            else nums[nums.length-1]=initial;
        }
        System.out.println(java.util.Arrays.toString(nums));        
    }

}