using Sysem;
using Sysem.Collections.Generic;

/**----------------------------{ Synopsis of HashMaping in Csharp }----------------------------

Create: new Dictionary<TKey, TValue>()
Add: dict.Add(key, value) or dict[key] = value (upsert)
Get: dict[key] (throws if missing) or dict.TryGetValue(key, out val)
Contains: dict.ContainsKey(key), dict.ContainsValue(value)
Remove: dict.Remove(key)
Count: dict.Count
Keys/Values: dict.Keys, dict.Values
Clear: dict.Clear()

*/


class HashMap{
    public static void main(String []args){

        //Defining Dictionary as Hashmap in Csharp....
        var dict = new Dictionary<string,int>();
        
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

          
    }
}
