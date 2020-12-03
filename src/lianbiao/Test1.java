package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class Test1 {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode("3");
        ListNode listNode2 = new ListNode("2");
        ListNode listNode1 = new ListNode("1");

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        printNode(listNode1);
        ListNode mubiaoNode = resverseNode(listNode1);
        printNode(mubiaoNode);
    }

//    private static void printNode(ListNode node){
//        while (node != null){
//            System.out.print(node.getData());
//            node = node.getNext();
//        }
//    }

    private static void printNode(ListNode node){
        while(node != null){
            System.out.print(node.getData());
            node = node.getNext();
        }
    }

//    private static ListNode reverseListNode(ListNode node){
//        if(node == null || node.getNext() == null){
//            return node;
//        }
//
//        ListNode currentNode = node;
//        ListNode preNode = null;
//        ListNode nextNode = null;
//
//        while(currentNode != null){
//            nextNode = currentNode.getNext();
//            currentNode.setNext(preNode);
//            preNode = currentNode;
//            currentNode = nextNode;
//        }
//        return preNode;
//    }

    private static ListNode reverseListNode(ListNode node){
        if(node == null || node.getNext() == null){
            return node;
        }

        ListNode currentNode = node;
        ListNode preNode = null;
        ListNode nextNode = null;

       while(currentNode != null){
           nextNode = currentNode.getNext();
           currentNode.setNext(preNode);
           preNode = currentNode;
           currentNode = nextNode;
       }
       return preNode;
    }


    private static ListNode resverseNode(ListNode node){
       if(node == null || node.getNext() == null){
           return node;
       }

       ListNode currentNode = node;
       ListNode preNode = null;
       ListNode nextNode = null;

       while(currentNode != null){
           nextNode = currentNode.getNext();
           currentNode.setNext(preNode);
           preNode = currentNode;
           currentNode = nextNode;
       }
       return preNode;
    }
}
