/**
 * Created by liunian on 2017/4/18.
 */
//调题目，应该是非多项式时间能解出来的，直接用贪心算法也是66666，看不懂
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int profit =0;
        for (int i=0;i<prices.length-1;i++){
            if (prices[i+1]>prices[i])
                profit +=prices[i+1]-prices[i];


        }
        return profit;
    }
}
