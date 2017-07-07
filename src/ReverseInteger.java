/**
 * Created by liunian on 2017/4/10.
 */
public class ReverseInteger {

    public int reverse(int x) {
        int s=0,w=0;

        while (x!=0){

            w=x%10;

            if(w<0){s=-(s*10-w);}
            int news=s*10+w;
            if((news-w)/10!=s){return 0;}
            s=news;
            x=x/10;
        }
        return s;
    }
}
