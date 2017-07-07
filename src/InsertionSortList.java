/**
 * Created by liunian on 2017/5/3.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        //插入排序，n的平方的复杂度；
        ListNode rt = new ListNode(0);

       // rt.next = head;
        if (head==null||head.next==null)return head;
        ListNode copy = head;
      //  ListNode prev = head;
        //写的老子头痛操蛋
//        while (copy!=null){
//            ListNode p = rt.next;
//            ListNode dum = rt;
//            ListNode temp =copy.next;
//            boolean flag=false;
//            while(p!=copy){
//               // if (flag==false){
//                    if (copy.val<=p.val){
//                    //paixu
//                    dum.next = copy;
//
//                    copy.next = p;
//                  //  prev.next=temp;
//                    flag=true;
//                    //
//                    }
//
//                dum = dum.next;
//               // if (p.next==copy){break;}
//                p=p.next;
//
//            }
//            dum.next = temp;
//
//            prev=prev.next;
//            copy=temp;
//        }

        while (copy!=null){
            ListNode p=rt.next;
            ListNode dum = rt;
            ListNode temp = copy.next;
            while (p!=null&&copy.val>p.val){
               p=p.next;
                dum =dum.next;
            }
            dum.next = copy;
            copy.next = p;
            copy=temp;
        }
        return rt.next;
    }
}
