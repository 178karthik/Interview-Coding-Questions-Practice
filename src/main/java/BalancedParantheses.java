import java.util.Stack;

public class BalancedParantheses {

    public static void main(String[] args)
    {
        String balanced = "{({})}";

        Stack<Character> stack = new Stack<>();
        char c[] = balanced.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i] == '{' || c[i] =='(')
            {
                stack.push(c[i]);
            }
            else if(c[i]=='}'||c[i]==')')
            {
                stack.pop();
            }
        }

        if(stack.empty())
        {
            System.out.println("It's balanced");
        }
        else
        {
            System.out.println("It's not balanced");
        }
    }
}
