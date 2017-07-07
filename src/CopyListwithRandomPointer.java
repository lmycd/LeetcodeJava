import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by liunian on 2017/4/17.
 */
public class CopyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode copy = head;
        //建立hash表，先把所有的节点都new出来
        while (copy!=null){
             map.put(copy,new RandomListNode(copy.label));
             copy = copy.next;
        }
        RandomListNode cp = head;
        while (cp!=null){
            map.get(cp).next = map.get(cp.next);
            map.get(cp).random = map.get(cp.random);
            cp = cp.next;
        }
        return map.get(head);

    }
}
