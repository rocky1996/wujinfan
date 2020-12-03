package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class Test6 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode("1");
        ListNode listNode2 = new ListNode("2");
        ListNode listNode3 = new ListNode("3");
        ListNode listNode4 = new ListNode("4");
        ListNode listNode5 = new ListNode("5");
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
//        print(listNode1);
        print(function(listNode1,2));
    }

//    //删除倒数第n个
//    private static ListNode function(ListNode listNode,int n){
//        ListNode quick = listNode;
//        ListNode slow = listNode;
//
//        for(int i=0;i<n;i++){
//            quick = quick.getNext();
//        }
//
//        if(quick == null){
//            return null;
//        }
//
//        while(quick.getNext() != null){
//            quick = quick.getNext();
//            slow = slow.getNext();
//        }
//
//        slow.setNext(slow.getNext().getNext());
//        System.out.println("slow:"+slow.getData());
//        return listNode;
//    }

    private static ListNode function(ListNode node,int n){
        ListNode quick = node;
        ListNode slow = node;

        for(int i=0;i<n;i++){
            quick = quick.getNext();
        }

        while(quick.getNext() != null){
            slow = slow.getNext();
            quick = quick.getNext();
        }
        slow.setNext(slow.getNext().getNext());
        return node;
    }


    private static ListNode function2(ListNode node,int n){
        ListNode quickNode = node;
        ListNode slowNode = node;

        for(int i=0;i<n;i++){
            quickNode = quickNode.getNext();
        }

        while(quickNode.getNext() != null){
            slowNode = slowNode.getNext();
            quickNode = quickNode.getNext();
        }

        slowNode.setNext(slowNode.getNext().getNext());
        return node;
    }

    private static void print(ListNode listNode){
        while(listNode != null){
            System.out.print(listNode.getData());
            listNode = listNode.getNext();
        }
    }
}
