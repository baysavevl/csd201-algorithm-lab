/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex5_stackqueuebyarraylist;

/**
 *
 * @author Luu Thieu Gia
 */
public class CSDEx5_StackQueueByArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //STACK BY ARRAYLIST
        System.out.println("STACK");
        StackBArrayList<Integer> stack = new StackBArrayList();
        
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.size();
        System.out.println("is Stack emply : " + (stack.isEmpty()));
        
        stack.clear();
        System.out.println("is Stack emply : " + stack.isEmpty());
        
        stack.topEl();
        stack.push(7);
        stack.push(8);
       
        stack.pop();
        
        stack.pop();
        stack.pop();
        
        stack.removeAll();
        stack.pop();
        
        System.out.println("");
        System.out.println("QUEUE");
        //QUEUE BY ARRAYLIST
        QueueByArrayList<Integer> queue = new QueueByArrayList();
        queue.Enqueue(5);
        queue.Enqueue(10);
        queue.Enqueue(15);
        
        queue.size();
        queue.DeQueue();
        queue.size();
        
        queue.Enqueue(20);
        queue.Enqueue(25);
        queue.size();
        queue.clear();
        queue.size();
        
        
        queue.Enqueue(25);
        queue.Enqueue(30);
        queue.removeAll();
        queue.size();
        
        queue.DeQueue();
    }
    
}
