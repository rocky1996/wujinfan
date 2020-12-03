package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */

import java.util.List;
import java.util.ArrayList;

/**
 * 链表去重
 */
public class Test4 {
    public static void main(String[] args) {
        ListNode listNodeA = new ListNode("A");
        ListNode listNodeB = new ListNode("B");
        ListNode listNodeC = new ListNode("C");
        ListNode listNodeD = new ListNode("D");
        ListNode listNodeE = new ListNode("C");
        ListNode listNodeF = new ListNode("B");
        ListNode listNodeG = new ListNode("C");

        listNodeA.setNext(listNodeB);
        listNodeB.setNext(listNodeC);
        listNodeC.setNext(listNodeD);
        listNodeD.setNext(listNodeE);
        listNodeE.setNext(listNodeF);
        listNodeF.setNext(listNodeG);

        printNode(listNodeA);
        function(listNodeA);
        printNode(listNodeA);
    }

    private static void function(ListNode listNode){

        List<String> list = new ArrayList<>();
        list.add(listNode.getData());

        ListNode currentNode = listNode.getNext();
        while(currentNode != null){
            if (list.contains(currentNode.getData())){
                listNode.setNext(currentNode.getNext());
            }else {
                list.add(currentNode.getData());
                listNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }








//        List<String> list = new ArrayList<>();
//        list.add(listNode.getData());
//
//        ListNode currentNode = listNode.getNext();
//        while(currentNode != null){
//            if(list.contains(currentNode.getData())){
//                listNode.setNext(currentNode.getNext());
//            }else {
//                list.add(currentNode.getData());
//                listNode = currentNode;
//            }
//            currentNode = currentNode.getNext();
//        }

//        List<String> list = new ArrayList<>();
//        list.add(listNode.getData());
//
//        ListNode currentNode = listNode.getNext();
//        while(currentNode != null){
//            if(list.contains(currentNode.getData())){
//                listNode.setNext(currentNode.getNext());
//            }else {
//                list.add(currentNode.getData());
//                listNode = currentNode;
//            }
//            currentNode = currentNode.getNext();
//        }

        //A->B->C->D->C->B->C

//        List<String> list = new ArrayList<>();
//        list.add(listNode.getData());
//
//        ListNode currentNode = listNode.getNext();
//        while(currentNode != null){
//            if(list.contains(currentNode.getData())){
//                listNode.setNext(currentNode.getNext());
//            }else {
//                list.add(currentNode.getData());
//                listNode = currentNode;
//            }
//            currentNode = currentNode.getNext();
//        }
    }

    private static void printNode(ListNode node){
        while(node != null){
            System.out.print(node.getData());
            node = node.getNext();
        }
        System.out.println("----");
    }
}
