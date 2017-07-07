import java.util.Arrays;

/**
 * Created by liunian on 2017/4/18.
 */
//算法思路：dp，解分为两个部分：一个交易的最大利润和两个交易的最大利润
    //两个交易的最大利润：将数组分为两部分，两个部分的最大值的和 ，所有的分法的最大值就是所得的解
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int doublep = 0;
        //int singleP = 0; //所谓的两个部分的极限就是一个部分，所以解就是分为前一半和后一半，后一半可能是空的，代表就是一整个：一个交易
        //我重复计算了，所以超市了，计算整个数组的时候会把所有小的计算一遍，！！！！只要把中途计算的数据存入数组，就不用在计算
        //现在的复杂度是o（n的平方），！！！！！如果利用数组，就是o（n），空间复杂度也是o（n）
        if (prices.length==0)return 0;
        //singleP=singleProfit(prices);
        int rightp=0;
        int[] forward = new int[prices.length];forward[0]=0;
        int[] backword = new int[prices.length];backword[prices.length-1]=0;

        int singleP = 0;
        int minprice =prices[0];
        for (int i=1;i<prices.length;i++){
            singleP = Math.max(prices[i]-minprice,singleP);
            forward[i] = singleP;
            if(prices[i]<minprice)
                minprice = prices[i];

        }

        int minpr = 0;
        int maxp = prices[prices.length-1];
        for (int i=prices.length-2;i>=0;i--){
            minpr = Math.min(prices[i+1]-maxp, minpr);
            backword[i] = minpr*(-1);
            if (prices[i+1]>maxp)
                maxp = prices[i+1];
        }

        int rt =0;

        for (int i=0; i<prices.length;i++){
            rt = Math.max(rt,forward[i]+backword[i]);
        }
        return rt;

    }
//    public int singleProfit(int[] prices){
//
//        for (int i=1;i<prices.length;i++){
//
//
//        }
//        return singleP;
//
//    }
}
