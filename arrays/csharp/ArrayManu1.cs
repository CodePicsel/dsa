using System;

class ArrayManu1
{
    public static void Main(string[] args)
    {
        int[] nums = { 1, 2, 3, 4, 5 };
        int d=2;
        //Rotating Array by 1 Place...
        RotateBy1(nums);
        
        //Rotating Array by D Place...
        RotationByDPlaces(d, nums);
    }

    void RotateBy1(int[] nums){
        int initial = nums[0];
        for (int i = 0; i < nums.Length; i++)
        {
            if (i + 1 < nums.Length) nums[i] = nums[i + 1];
            else nums[nums.Length - 1] = initial;
        }
        foreach (int i in nums) Console.WriteLine(i);
    }

    void RotationByDPlaces(int d, int[] nums){
        int n = nums.length;
        if (n <= 1) return;
        d %= n;
        int[] temp = new int[d];
        for(int i=0;i<d;i++) temp[i]=nums[i];
        for(int i=d;i<nums.Length;i++) nums[i-d]=nums[i];
        for (int i = 0; i < d; i++) nums[n - d + i] = temps[i];
        foreach (int i in nums) Console.WriteLine(i);
    }

    void SpaceOptimalrotationByDPlaces(int d, int[] nums){
        Reverse(nums, 0, d-1);
        Reverse(nums, d, nums.Length-1);
        Reverse(nums, 0, nums.Length-1);
        foreach (int i in nums) Console.WriteLine(i);
    }

    int[] Reverse(int[] nums, int start, innt end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}
