import java.util.HashSet;
import java.util.Set;

class ImplementingSet{
    public static void main(String[] args){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        System.out.println(hashSet);
        System.out.println("size: " + hashSet.size());  // 2
    }
}