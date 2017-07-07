import java.util.List;

/**
 * Created by liunian on 2017/4/12.
 */
//用递归，函数返回的是拍好的k个node的头节点，跟k=2一样可以用迭代，方法一样 一个头节点，链接k个反序节点
public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode dup =head;
        while (dup!=null){
            count+=1;
            dup=dup.next;
            if (count==k)
                break;
        }
        if (count==k){
            //需要逆置
            ListNode curr = reverseKGroup(dup, k);
            head.next = curr;
            ListNode p = head.next;
            while (count==1){
                ListNode temp =p.next;
                p.next=head;
                head = p;
                p=temp;
                count--;
            }

        }
        else //有少于k个节点为空，则不会倒序
            return head;


        return head;

    }

}
