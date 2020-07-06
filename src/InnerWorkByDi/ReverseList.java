package InnerWorkByDi;
/**
 * 反转单链表：
 * 原链表：1-->2-->3
 * 反转链表：3->2->1
 */

public class ReverseList {
    static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args) {
            Node n1=new Node();
            Node n2=new Node();
            Node n3=new Node();
            Node head=new Node();
            n1.data=1;
            n1.next=n2;
            n2.data=2;
            n2.next=n3;
            n3.data=3;
            n3.next=null;
            head.next=n1;

            Node node=reverseList(n1);

            while (node!=null){
                System.out.println(node.data);
                node=node.next;
            }
    }
    public static Node reverseList(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newList = reverseList(head.next);
        Node t1 = head.next;
        t1.next = head;
        head.next = null;
        return newList;
    }
}
