
import java.util.ArrayList;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luu Thieu Gia
 */
public class Palindrome {
     private ArrayList<Character> list = new ArrayList();

    public ArrayList<Character> getList() {
        return list;
    }
    
    public void setList(ArrayList<Character> list) {
        this.list = list;
    }
    
    public void Enqueue(Character x)
    {
        list.add(x);
    }
    
    public Character DeQueue()
    {
        return list.remove(0);
    }
    
    
    //print all elements in queue and remove all elements
    public void removeAll()
    {
        while (!list.isEmpty())
        {
            DeQueue();
            //System.out.println(DeQueue()+ " ");
        }
    }
    
    public boolean checkPalind(String str)
    {
        //CDSPalindrome queue = new CDSPalindrome();
        Stack stack = new Stack();
        
        for (char c: str.toCharArray())
        {
            Enqueue(c);
            stack.push(c);
        }
        
  
        
        //Check Palindrome
        
        boolean result = true;
        while(!stack.isEmpty())
        {
            if (Character.toUpperCase((char) stack.pop()) != Character.toUpperCase(DeQueue()))
            {
                result = false;
                break;
            }
        }

        
        if (result)
        {
            return true;
        } else
        {
            return false;
        }
        
        
        
    }
    
    
}
