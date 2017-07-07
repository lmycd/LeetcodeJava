/**
 * Created by liunian on 2017/4/27.
 */
public class DecodeWays {
    public int numDecodings(String s) {
        char[] strs = s.toCharArray();
        int len = strs.length;
        int[] rt = new int[len];
        if (len==0)return 0;
        if (strs[0]-'0'!=0)rt[0]=1;
        else return 0;

        for (int i=1;i<len;i++) {
            if (i < 2) {


                if (strs[i] - '0' != 0 && strs[i - 1] - '0' == 0) rt[i] = rt[i - 1];
                else if (strs[i] - '0' == 0 && strs[i - 1] - '0' == 0) return 0;
                else {
                    if (strs[i - 1] - '0' >= 3 && strs[i] - '0' != 0)
                        rt[i] = rt[i - 1];
                    else if (strs[i - 1] - '0' >= 3 && strs[i] - '0' == 0)
                        return 0;
                    else if (strs[i] - '0' >= 7 && strs[i - 1] - '0' == 2)
                        rt[i] = rt[i - 1];

                    else if (strs[i] - '0' != 0)
                        rt[i] = rt[i - 1] + 1;

                    else rt[i] = rt[i - 1];
                }
            }
            else {
                if (strs[i] - '0' != 0 && strs[i - 1] - '0' == 0) rt[i] = rt[i - 1];
                else if (strs[i] - '0' == 0 && strs[i - 1] - '0' == 0) return 0;
                else {
                    if (strs[i - 1] - '0' >= 3 && strs[i] - '0' != 0)
                        rt[i] = rt[i - 1];
                    else if (strs[i - 1] - '0' >= 3 && strs[i] - '0' == 0)
                        return 0;
                    else if (strs[i] - '0' >= 7 && strs[i - 1] - '0' == 2)
                        rt[i] = rt[i - 1];

                    else if (strs[i] - '0' != 0)
                        rt[i] = rt[i - 1] + rt[i-2];
                    else
                        if (strs[i-1]-'0'==0)return 0;
                    else
                        rt[i] = rt[i-2];


                }
            }
        }


        return rt[len-1];
    }
}
