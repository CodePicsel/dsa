var dict = new Dictionary<string, int>();
        
        //Two types of insertion methods...
        dict.Add("apple", 3);
        dict["banana"] = 5;

        //Contains and count...
        Console.WriteLine(dict.ContainsKey("banana")); // true
        Console.WriteLine(dict.Count); // 2

        //Printing Style...
         foreach (var kvp in dict) Console.WriteLine($"{kvp.Key} => {kvp.Value}");

         //Remove & Clear function...
          dict.Remove("apple");
          dict.Clear();