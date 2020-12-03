package lianbiao;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class ListNode {
    private String data;
    private ListNode next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(){

    }

    public ListNode(String data){
        this.data = data;
    }

    public ListNode(String data,ListNode next){
        this.data = data;
        this.next = next;
    }
}
