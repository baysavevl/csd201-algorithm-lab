/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex3_delimitermatching;

import java.util.Stack;

/**
 *
 * @author Luu Thieu Gia
 */
public class DelimiterMatching {
     Stack<Character> delimiterMatching = new Stack<Character>();
    
    
    public boolean checkDelimiterMatching(String input)
    {
    for (int index = 0; index < input.length(); index++) 
    {
      char ch = input.charAt(index);
      switch (ch) {
                    case '{': 
                    case '[':
                    case '(':
                                delimiterMatching.push(ch);
                                break;
                    case '}': 
                    case ']':
                    case ')':
                                if (!delimiterMatching.isEmpty()) 
                                {
                                        char chx = delimiterMatching.pop();
                                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
                                        return false;
                                } 
                                else {return false;}
                                break;
                    default:
                                break;
                    }
    }
    if (!delimiterMatching.isEmpty())
           return false;
                                        
    return true;
    }
}
