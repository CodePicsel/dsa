import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> s = new HashSet<>();
            boolean dup = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (s.contains(x)) dup = true;
                s.add(x);
            }
            System.out.println(dup ? "YES" : "NO");
        }
        sc.close();
    }
}
