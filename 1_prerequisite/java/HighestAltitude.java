public class HighestAltitude{
    public static void main(String[] a){
        int[] gain = {-5,1,5,0,-7};
        brute(gain);
    }

    static void brute(int[] gain){
        int[] ans = new int[gain.length+1];
        ans[0]=0;
        int maxAlt=0;
        for(int i=1;i<ans.length; i++){
            ans[i]=gain[i-1]+ans[i-1];
            maxAlt=Math.max(maxAlt, ans[i]);
       }
       for(int a:ans){
           System.out.println(a);
       }
    }
}