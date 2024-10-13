package org.example.Practice2;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String s="{{(())}}";
        Stack<Character> stack = new Stack<>();
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='('||c[i]=='{')
            {
                stack.push(c[i]);
            }
            if(c[i]==')'||c[i]=='}')
            {
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("It's balanced");
        }
        else
        {
            System.out.println("It's not balanced");
        }
    }
}
