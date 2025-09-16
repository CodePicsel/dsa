public class BuySellStock{
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int maxProfit=0;
        int min =prices[0];

        for(int i=0; i<prices.length;i++){
            int cost = prices[i]-min;
            maxProfit=Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);
        }
        System.out.println(maxProfit);
    }
}