package org.example;
import org.example.ListNode;

import java.util.Collection;

public class PalindromeLinkedList {

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = head.next.next;
            slow = head.next;
        }
        ListNode secondHalf = reverseLinkedList(slow);
        ListNode firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }

    public static void main(String[] args) {
        ListNode current = new ListNode(1);
        current.next = new ListNode(2);
        current.next.next = new ListNode(1);
        if (isPalindrome(current)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not  a palindrome");
        }

    }
}





