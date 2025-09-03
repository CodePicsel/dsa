
        int[] nums = { 1, 2, 3, 4, 5 };
        int d = 4;
        RotationByDPlaces(d, nums);
 void RotationByDPlaces(int d, int[] nums){
        int n = nums.Length;
        if (n <= 1) return;
        d %= n;
        int[] temps = new int[d];
        for(int i=0;i<d;i++) temps[i]=nums[i];
        for(int i=d;i<nums.Length;i++) nums[i-d]=nums[i];
        for (int i = 0; i < d; i++) nums[n - d + i] = temps[i];
        foreach (int i in nums) Console.WriteLine(i);
    }