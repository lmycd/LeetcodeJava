/**
 * Created by liunian on 2017/5/3.
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        //相当于一个数组，用nlogn的时间排序，对于数组简单一点，可以用快排序之类的，还可以用分治法，
        //链表只能用分治法，对于链表确定中点就用快慢指针
        ListNode fast = head, slow = head;
        ListNode prev = null;
        if (head==null||head.next==null)return head;
        //分段
        while (fast!=null & fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // 排序 
        ListNode l1 = sortList(head);//递归到最底层，然后开始合并，真的
        ListNode l2 = sortList(slow);


        //合并

        return merge(l1,l2);

    }
    public ListNode merge(ListNode head, ListNode slow){
        ListNode rt = new ListNode(0);
        ListNode dump = rt;
        while(head!=null & slow!=null){
            if (head.val<slow.val){
                dump.next = head;
                dump = dump.next;
                head = head.next;
            }
            else
            {
                dump.next = slow;
                dump = dump.next;
                slow = slow.next;
            }
        }

        if (head!=null){
            dump.next = head;
        }
        if (slow!=null){
            dump.next = slow;
        }
        return rt.next;
    }
}
