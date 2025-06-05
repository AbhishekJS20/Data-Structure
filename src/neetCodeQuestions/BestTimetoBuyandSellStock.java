package neetCodeQuestions;

public class BestTimetoBuyandSellStock {


        public static int option1(int[] prices) {
            int res =0;
            for (int i = 0; i < prices.length; i++) {
                int buy = prices[i];
                for (int j = i +1 ; j < prices.length; j++) {
                    int sell = prices[j];
                    res =Math.max(res,sell-buy);
                }
            }
            return res;
        }
    public static int option2(int[] prices) {
            int maxP =0;
            int minBuy =prices[0];
            for(int sell: prices){
                maxP = Math.max(maxP, sell - minBuy);
                minBuy = Math.min(minBuy, sell);
            }
        return maxP;

    }
    public static void main(String[] args) {
        int[] price = {10,1,5,6,7,1};
        System.out.println(option1(price));
        System.out.println(option2(price));
    }
}
