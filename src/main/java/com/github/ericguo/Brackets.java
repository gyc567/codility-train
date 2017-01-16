package com.github.ericguo;

import java.util.Stack;


/**
 * Created by eric567 [email:gyc567@126.com]
 * on 1/6/2017.
 */
public class Brackets {


    public static int solution(String S)
    {





        if(S.length()==0||null==S||S.equals(""))return 1;
        char[] nested=S.toCharArray();

        Stack stack=new Stack();


        for(int i=0;i<nested.length;i++)
        {
            char currentChar = nested[i];
            if(currentChar=='{'||currentChar=='['||currentChar=='(')
            {
                stack.push(currentChar);
            }else {
                if(stack.empty()) return 0;
                char topChar = (char) stack.peek();
                if (currentChar == ')' && topChar == '('
                        || currentChar == ']' && topChar == '[' || currentChar == '}' && topChar == '{') {
                    stack.pop();
                }

            }

        }


        return stack.isEmpty() ? 1 : 0;
    }




}
