using System;
using System.Collections.Generic;

public class Array5{
    public static void Main(string []args){
        int[] arr={1, 1, 2, 3, 3, 4, 4, 5, 5};
        MissingInTwice(arr);
    }

    void MissingInTwice(int[] arr){
        var dict = new Dictionary<int, int>();
        int n = arr.Length;
        // Console.WriteLine(dict.ContainsValue(0));
        for(int i = 0; i<n; i++){
            int key = arr[i];
            int temp;
            if(dict.ContainsKey(key)){
                dict.TryGetValue(key, out temp);
                temp++;
                dict[key] = temp;
            }else{
                dict.Add(key, 1);
            }
        }
         foreach (var kvp in dict) {
            //  Console.WriteLine($"{kvp.Key} => {kvp.Value}");
            if(kvp.Value==1){
                Console.WriteLine(kvp.Key);
                break;
            }
         }
    }

}