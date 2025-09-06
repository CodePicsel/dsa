import java.util.HashMap;
import java.util.Map;

/**----------------------------{ Synopsis of HashMaping in Csharp }----------------------------

Create: new HashMap<K, V>()
Put: map.put(key, value) (returns previous value or null)
Get: map.get(key) (returns null when missing — ambiguous if null values allowed) or map.getOrDefault(key, default)
Contains: map.containsKey(key), map.containsValue(value)
Remove: map.remove(key)
Size: map.size()
Keys/Values/Entries: map.keySet(), map.values(), map.entrySet()
Useful Java 8+ methods: putIfAbsent, computeIfAbsent, compute, merge
Iterate: for (Map.Entry<K,V> e : map.entrySet()) { ... }

*/


class HashMapPractice{
    public static void main(String[] args){

        //Defining HashMap...
        Map<String, Integer> map = new HashMap<>();

        //Inserting elements...
        map.put("Apple", 4);
        map.put("Pineapple", 6);

        //Get Calls of Hash...
        System.out.println(map.get("apple")); // null
        System.out.println(map.getOrDefault("no", 42)); // 42

        //Contains and count...
        System.out.println(map.containsKey("banana")); //false
        System.out.println(map.containsValue(6)); //true

        //Printing Style...
        for (Map.Entry<String,Integer> e : map.entrySet()) System.out.println(e.getKey() + " => " + e.getValue());

    }
}