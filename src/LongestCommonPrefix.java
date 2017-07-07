/**
 * Created by liunian on 2017/4/11.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String mins="";int minlen=999;
        for (int i=0; i<strs.length; i++){
            if(strs[i].length()<=minlen) {
                minlen = strs[i].length();
                mins = strs[i];
            }

        }
        for (int j=0; j<minlen;j++){
            for (int k=0; k<strs.length; k++){
                if (strs[k].charAt(j)!= mins.charAt(j))
                    return mins.substring(0,j);

            }
        }
        return mins;
    }
}
