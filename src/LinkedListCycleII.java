/**
 * Created by liunian on 2017/5/1.
 */
public class LinkedListCycleII {
    //重点，开头到第一次相遇的地方相差好几个圈，x+k=nc,x=nc-k,这样一个在开头出发走x步，一个在相遇的点出发走nc-k步，相对走了n圈退回k步，就是起点，相遇

    //牛逼 想出来方法的不是人
    public ListNode detectCycle(ListNode head) {
        boolean iscycle =false;
        ListNode slow =head;
        ListNode fast =head;

        while(fast!=null&&fast.next!=null){
            fast =fast.next.next;
            slow = slow.next;
            if (fast==slow)
                iscycle = true;
        }
        if (iscycle==false)
            return null;
        fast = head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
