package org.example;

public class LinkedListReversal {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // 存储下一个节点
            next = current.next;
            // 反转当前节点的指针
            current.next = prev;
            // 移动 prev 和 current 指针
            prev = current;
            current = next;
        }

        return prev;  // prev 会是新的头节点
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建链表：1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("原链表：");
        printList(head);

        head = reverseList(head);

        System.out.println("反转后的链表：");
        printList(head);
    }
}