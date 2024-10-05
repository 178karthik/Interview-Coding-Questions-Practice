package org.example.practice;

public class PalindromeLinkedList {


public static void main(String[] args)
{
    ListNode head= new ListNode(1);
    head.next= new ListNode(2);
    head.next.next= new ListNode(1);
    if(isPalindrome(head))
    {
        System.out.println("It's a Palindrome");
    }
    else
    {
        System.out.println("It's not a Palindrome");
    }

}

public static ListNode reverseLinkedList(ListNode head)
{

    ListNode current =head;
    ListNode prev= null;
    ListNode temp;

    while(current!=null)
    {
        temp=current.next;
        current.next= prev;
        prev= current;
        current=temp;
    }

    return prev;
}

public static boolean isPalindrome(ListNode head)
{
    if(head==null || head.next==null)
    {
        return false;
    }

    ListNode fast= head;
    ListNode slow =head;

    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }

    ListNode secondHalf = reverseLinkedList(fast);
    ListNode firstHalf = head;

    while(secondHalf!=null)
    {
        if(firstHalf.val!=secondHalf.val)
        {
            return false;
        }
        firstHalf=firstHalf.next;
        secondHalf=secondHalf.next;
    }
    return true;
}


}





