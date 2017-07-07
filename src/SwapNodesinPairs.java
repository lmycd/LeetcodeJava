/**
 * Created by liunian on 2017/4/12.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dp = new ListNode(0);
        dp.next=head;
        ListNode dup =dp;
        if(dup.next==null||dup.next.next==null)
            return head;
        else {
            ListNode p = dup.next;
            ListNode q = p.next;
            while (true) {
                //用三个指针
                dup.next = q;
                p.next = q.next;
                q.next = p;
                //genggaimingcheng

                if (p.next!=null &&p.next.next != null) {
                    q = p.next.next;
                    p = p.next;
                    dup = dup.next.next;
                } else break;


            }

            return dp.next;
        }
    }
}
