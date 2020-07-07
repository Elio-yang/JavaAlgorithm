package InnerWorkByDi;

/**
 * 反转单链表：
 * 原链表：1-->2-->3
 * 反转链表：3->2->1
 */

public class ReverseList {
    public static void main(String[] args) {
        node node1=new node(1);
        node node2=new node(2);
        node node3=new node(3);
        node1.next=node2;
        node2.next=node3;
        node.Print(node1);
        node newList=node.reserveList(node1);
        node.Print(newList);
    }
}
class node {
    int data;
    node next;
    public node(int val){
        data=val;
        next=null;
    }
    public static node reserveList(node head){
        if(head==null|| head.next==null){
            return head;
        }
        node newList=reserveList(head.next);
        node tmp1=head.next;
        tmp1.next=head;
        head.next=null;
        return newList;
    }
    public static void Print(node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        Print(head.next);
    }
}
