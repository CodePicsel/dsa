int[] nums = { 1, 2, 3, 4, 5 };
int initial = nums[0];
    for (int i = 0; i < nums.Length; i++)
    {
        if (i + 1 < nums.Length)
            nums[i] = nums[i + 1];
        else
            nums[nums.Length - 1] = initial;
    }
    foreach (int i in nums)
        Console.WriteLine(i);
    