package org.example.linked;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(8);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(listNode);
        // 反转链表
        Main mian = new Main();
        ListNode reverseLinked = mian.reverseLinked(listNode);
        System.out.println("program is over");
        //main.reverseLinked(listNode);
    }
    // 反转链表
    public ListNode reverseLinked(ListNode node) {
           ListNode prev = null;
           ListNode curr = node;
           while (curr != null) {
               ListNode nextTemp = curr.next;
               curr.next = prev;
               prev = curr;
               curr = nextTemp;
           }
       return prev;
    }
}
