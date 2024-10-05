package org.example.practice;

public class ListNode {

    int val;
    ListNode next;

    ListNode()
    {

    }
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(ListNode next, int val)
    {
        this.next = next;
        this.val = val;
    }


    public static void main(String[] args) {


        ListNode head= new ListNode(1);
        head.next= new ListNode(2);
        head.next.next = new ListNode(3);
        printLinkedList(head);

        ListNode reverse = reverseLinkedList(head);
        System.out.println("reverse linked list  is"+reverse);
        printLinkedList(reverse);

    }
    public static ListNode reverseLinkedList(ListNode head)
    {

        ListNode current= head;
        ListNode prev = null;
        ListNode tmp;

        while(current!=null)
        {
            tmp= current.next;
            current.next = prev;
            prev= current;
            current = tmp;
        }
        return prev;
    }

    public static void printLinkedList(ListNode head)
    {
        ListNode current = head;

        while(current!=null)
        {
            System.out.println(current.val);
            current= current.next;
        }
    }
}
