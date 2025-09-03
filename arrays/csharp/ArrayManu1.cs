using System;

class ArrayManu1
{
    public static void Main(string[] args)
    {
        int[] nums = { 1, 2, 3, 4, 5 };
        
        //Rotating Array by 1 Place...
        RotateBy1(nums);
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

}
