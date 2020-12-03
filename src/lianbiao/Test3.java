package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class Test3 {
    public static void main(String[] args) {
        ListNode listNodeA = new ListNode("A");
        ListNode listNodeB = new ListNode("B");
        ListNode listNodeC = new ListNode("C");
        ListNode listNodeD = new ListNode("D");
        ListNode listNodeE = new ListNode("E");

        listNodeA.setNext(listNodeB);
        listNodeB.setNext(listNodeC);
        listNodeC.setNext(listNodeD);
        listNodeD.setNext(listNodeE);
        listNodeE.setNext(listNodeC);
        listNodeC.setNext(listNodeD);

        ListNode point = entryNodeOfLoop2(listNodeA);
        System.out.println(point.getData());

        if(hasCycle(listNodeA)){
            System.out.println("有环");
        }else {
            System.out.println("没有环");
        }
    }


//    public static ListNode entryNodeOfLoop(ListNode listNode){
//        if(listNode == null || listNode.getNext() == null){
//            return null;
//        }
//        ListNode listNode1 = listNode;
//        ListNode listNode2 = listNode;
//
//        while(listNode2 != null || listNode2.getNext() != null){
//            listNode1 = listNode1.getNext();
//            listNode2 = listNode2.getNext().getNext();
//
//            if(listNode1 == listNode2){
//                listNode2 = listNode;
//                while(listNode1 != listNode2){
//                    listNode1 = listNode1.getNext();
//                    listNode2 = listNode2.getNext();
//                }
//                if (listNode1 == listNode2){
//                    return listNode2;
//                }
//            }
//        }
//        return null;
//    }
//
//    public static boolean hasCycle(ListNode listNode) {
//        ListNode quick = listNode;
//        ListNode slow = listNode;
//
//        while(quick != null || quick.getNext() != null){
//            quick = quick.getNext().getNext();
//            slow = slow.getNext();
//            if(quick == slow){
//                return true;
//            }
//        }
//        return false;
//    }

    private static ListNode entryNodeOfLoop(ListNode node){
        if(node == null || node.getNext() == null){
            return null;
        }

        ListNode listNode1 = node;
        ListNode listNode2 = node;

        while(listNode2 != null && listNode2 != null){
            listNode1 = listNode1.getNext();
            listNode2 = listNode2.getNext().getNext();

            if(listNode1 == listNode2){
                listNode2 = node;

                while(listNode1 != listNode2){
                    listNode1 = listNode1.getNext();
                    listNode2 = listNode2.getNext();
                }

                if(listNode1 == listNode2){
                    return listNode2;
                }
            }
        }
        return null;
    }

    public static boolean hasCycle(ListNode listNode) {
        if(listNode == null || listNode.getNext() == null){
            return false;
        }

        ListNode listNode1 = listNode;
        ListNode listNode2 = listNode;

        while(listNode2 != null && listNode2.getNext() != null){
            listNode1 = listNode1.getNext();
            listNode2 = listNode2.getNext().getNext();

            if(listNode1 == listNode2) {
                return true;
            }
        }
        return false;
    }

    private static ListNode entryNodeOfLoop2(ListNode node){
        if(node == null || node.getNext() == null){
            return node;
        }

        ListNode listNode1 = node;
        ListNode listNode2 = node;

        while(listNode2 != null && listNode2.getNext() != null){
            listNode1 = listNode1.getNext();
            listNode2 = listNode2.getNext().getNext();

            if(listNode1 == listNode2){
                listNode2 = node;

                while(listNode1 != listNode2){
                    listNode1 = listNode1.getNext();
                    listNode2 = listNode2.getNext();
                }
                if(listNode1 == listNode2){
                    return listNode2;
                }
            }
        }
        return listNode2;
    }
}
