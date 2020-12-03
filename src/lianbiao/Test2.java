package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class Test2 {
    public static void main(String[] args) {
        ListNode listNodeA = new ListNode("1");
        ListNode listNodeB = new ListNode("3");
        ListNode listNodeC = new ListNode("5");
        listNodeA.setNext(listNodeB);
        listNodeB.setNext(listNodeC);

        ListNode listNode1 = new ListNode("2");
        ListNode listNode2 = new ListNode("4");
        ListNode listNode3 = new ListNode("6");
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ListNode lastNode = Merge(listNodeA,listNode1);
        while(lastNode != null){
            System.out.println(lastNode.getData());
            lastNode = lastNode.getNext();
        }
    }

    public static ListNode Merge(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode lastNode = null;
        if(Integer.parseInt(list1.getData()) < Integer.parseInt(list2.getData())){
            lastNode = list1;
            lastNode.setNext(Merge(list1.getNext(),list2));
        }else{
            lastNode = list2;
            lastNode.setNext(Merge(list1,list2.getNext()));
        }
        return lastNode;
    }
}
