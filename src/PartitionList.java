/**
 * Created by liunian on 2017/4/25.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode big = new ListNode(0);
        ListNode bignode =big;

        ListNode small = new ListNode(0);
        ListNode smallnode = small;
        while (head!=null){
            if (head.val<x){
                smallnode.next = head;
                smallnode = smallnode.next;

            }
            else {
                bignode.next = head;
                bignode = bignode.next;
            }
            head =head.next;

        }
        //smallnode.next =null;
        bignode.next = null;
        smallnode.next = big.next;
        return small.next;


    }
}
