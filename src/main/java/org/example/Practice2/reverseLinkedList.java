package org.example.Practice2;

public class reverseLinkedList {
    public static void main(String[] args) {



        ListNode head= new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next= new ListNode(2);
        head.next.next.next.next= new ListNode(1);
       if(isPalindrome(head))
       {
           System.out.println("It's  a palindrome");
       }
       else {
           System.out.println("It's not a palindrome");
       }

    }

    public static ListNode reversedLinkedList(ListNode head)
    {
        ListNode current = head;
        ListNode prev =null;
        ListNode temp;

        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }

    public static void  print(ListNode head)
    {
        ListNode current= head;
        while (current != null){

            System.out.println(current.val);
            current=current.next;
        }

    }

    public static boolean  isPalindrome(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            fast= fast.next.next;
            slow= slow.next;

        }
        ListNode firstHalf = head;
        ListNode secondHalf= reversedLinkedList(slow);

        while(secondHalf!=null)
        {
            if(secondHalf.val!= firstHalf.val)
            {
                return false;
            }
            secondHalf= secondHalf.next;
            firstHalf= firstHalf.next;
        }
        return true;
    }

}
