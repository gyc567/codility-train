package com.github.ericguo;

import java.util.Stack;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 1/16/2017.
 */
public class Nesting {
    public static int solution(String S)
    {
        Stack<Character> stack=new Stack<>();
        char[] chars=S.toCharArray();
        for (int i = 0; i < chars.length; i++) {


            if(!stack.isEmpty()&&chars[i]==')'&&stack.peek()=='(')
            {
                stack.pop();
            }else if(chars[i]==')'||chars[i]==')')
            {
                stack.push(chars[i]);
            }
        }

        return stack.size()==0?1:0;
    }
}
