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
public class QueueByArrayList<Q> {
    
    
    private ArrayList<Q> list = new ArrayList();

    public ArrayList<Q> getList() {
        return list;
    }

    public void setList(ArrayList<Q> list) {
        this.list = list;
    }
    
    public QueueByArrayList()
    {    
    }
    
    public void Enqueue(Q x)
    {
        list.add(x);
    }
    
    public Q DeQueue()
    {
        if (list.isEmpty())
            System.out.println("Queue emply"); else
        return list.remove(0);
        
        return null;
    }
    
    public void topEl()
    {
        if (list.isEmpty())
            System.out.println("Queue empty"); else
        {
            System.out.println(list.get(0));
        }
    }
    
    public void isEmpty()
    {
        if (list.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
    
    public void clear()
    {
        list.removeAll(list);
    }
    
    
    public void size()
    {
        if (list.isEmpty())
            System.out.println("Size = 0");
        else
            System.out.println("Size = " + list.size());
    }
    
    
    
    //print all elements in queue and remove all elements
    public void removeAll()
    {
        while (!list.isEmpty())
        {
            System.out.println(DeQueue()+ " ");
        }
    }
    
    
}
