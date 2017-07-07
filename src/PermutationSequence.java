import java.util.ArrayList;

/**
 * Created by liunian on 2017/4/24.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        //N=n！，序列是按照规律排列的找到规律的 ,之所以没做下去是因为k的取之， 这里的k是第几个 ，应该用k-1 来代替k，因为函数里k从0开始 0到k-1

        StringBuilder canlist  = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            numbers.add(i);
        }
        //ArrayList<Integer> canlist = new ArrayList<>();
        while (n>=1){
            int chushu =helper(n-1);
            canlist.append(String.valueOf(numbers.get(k/chushu)));
            numbers.remove(k/chushu);
            k = k%chushu;
            n=n-1;
        }
        return String.valueOf(canlist);

    }
    public int helper(int n){
        if (n==1||n==0)return 1;

        int sum=1;
        while (n>0){
            sum = sum*(n);
            n=n-1;
        }
        return sum;
    }
}
