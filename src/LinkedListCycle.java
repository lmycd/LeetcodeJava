/**
 * Created by liunian on 2017/5/1.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        if (head==null)return false;
        while(fast!=null&&fast.next!=null){
            fast =fast.next.next;
            slow = slow.next;
            if (fast==slow)
                return true;
        }
        return false;

    }
}
