/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex5_stackqueuebyarraylist;

import java.util.ArrayList;

/**
 *
 * @author Luu Thieu Gia
 */
public class StackBArrayList<T> {
    
    ArrayList<T> ar= new ArrayList<>();;
        
    public StackBArrayList()
    {
        ar = new ArrayList<>();
    }
    
    public boolean isEmpty()
    {
        return (ar.isEmpty());
    }
    
    public void push(T el)
    {
         ar.add(el);
    }
    
    
    public void pop()
    {
        if (ar.isEmpty())
            System.out.println("Stack empty");
        else
        {
            T t = ar.get(ar.size()-1);
            ar.remove(ar.size()-1);
            System.out.println(t);
        }
    }
    
    public void clear()
    {
        ar.removeAll(ar);
    }
    
    public void topEl()
    {
        if (ar.isEmpty())
            System.out.println("Stack empty"); else
        System.out.println(ar.get(ar.size())); 
    }
    
    public void removeAll()
    {
        while (!ar.isEmpty())
        {
            T t = ar.get(ar.size()-1);
            ar.remove(ar.size()-1);
            System.out.println(t);
        }
    }
     
    
    public void size()
    {
        System.out.println("Size of the Stack : " + ar.size());
    }


}
