import java.util.Arrays;

/**
 * Created by liunian on 2017/4/17.
 */
//动态规划做
    //分解为子问题：每天卖掉的最大利润，最大的利润肯定是每天卖掉的利润的最大值
    //求每天卖掉的最大利润：d[i]和d[i-1]，d[i]的最大利润要么前一天的最大利润+今天的价格-昨天的价格  要么是昨天买进，今天卖出
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int d[] =new int[prices.length];
        d[0]=0;
        for (int i=1;i<d.length;i++){
            if (i==1)
                d[1] = prices[1]-prices[0];
            d[i] = Math.max(d[i-1]+prices[i]-prices[i-1], prices[i]-prices[i-1]);

        }
        Arrays.sort(d);
        return d[d.length-1];
    }
}
