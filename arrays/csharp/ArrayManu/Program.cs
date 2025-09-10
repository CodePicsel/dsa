int[] arr = {1,2,3,4,5};

//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444

//555555555
//544444445
//543333345
//543222345
//543212345
//543222345
//543333345
//544444445
//555555555

        int n = arr.Length;
        int size = 2 * n - 1;         // 7 when n = 4
        int center = n - 1;           // center index (0-based)

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                int dist = Math.Max(Math.Abs(i - center), Math.Abs(j - center));
                Console.Write(arr[dist]);
            }
            Console.WriteLine();
        }
