public class BuySellStock{
    public static void main(String[] args){
        int[] prices = {7,2,5,3,6,4};
        int maxProfit=0;
        int min =prices[0];

        for(int i=0; i<prices.length;i++){
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-min);
        }
        System.out.println(maxProfit);
    }
}