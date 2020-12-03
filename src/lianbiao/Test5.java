package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class Test5 {
    public static void main(String[] args) {
        ListNode listNodeA = new ListNode("0");
        ListNode listNodeB = new ListNode("1");
        ListNode listNodeC = new ListNode("1");
        ListNode listNodeD = new ListNode("1");
        ListNode listNodeE = new ListNode("2");
        ListNode listNodeF = new ListNode("2");
        ListNode listNodeG = new ListNode("2");


        listNodeA.setNext(listNodeB);
        listNodeB.setNext(listNodeC);
        listNodeC.setNext(listNodeD);
        listNodeD.setNext(listNodeE);
        listNodeE.setNext(listNodeF);
        listNodeF.setNext(listNodeG);

        ListNode newList = quchong1(listNodeA);
        printNode(newList);
    }

    private static ListNode quchong1(ListNode pHead){
        if(pHead == null){
            return null;
        }

        ListNode root = new ListNode();
        root.setNext(pHead);

        ListNode preNode = root;
        ListNode currentNode = null;

        while(preNode != null){
            currentNode = preNode.getNext();
            if(currentNode != null && preNode.getData() == currentNode.getData()){
                preNode.setNext(currentNode.getNext());
            }else {
                preNode = preNode.getNext();
            }
        }
        return root.getNext();
    }

    private static ListNode deleteDuplication(ListNode pHead){
        if(pHead == null){
            return null;
        }

        ListNode first = new ListNode();
        first.setNext(pHead);
        ListNode preNode = first;
        ListNode p = pHead;


        while(p != null && p.getNext() != null){
            if(p.getData() == p.getNext().getData()){
                String value = p.getData();
                while(p != null && p.getData() == value) {
                    p = p.getNext();
                }

                preNode.setNext(p);
            }else {
                preNode = p;
                p = p.getNext();
            }
        }

        while(first.getNext() != null) {
            System.out.print(first.getNext().getData() + " ");
            first = first.getNext();
        }
        return first.getNext();
    }

    private static void printNode(ListNode node){
        while(node != null){
            System.out.print(node.getData());
            node = node.getNext();
        }
    }
}
