/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex7_stacksbyqueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Luu Thieu Gia
 */
public class CSDEx7_StacksByQueues {

    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    
    //Queue<String> que;
    

    public void push(int number) {
        queue1.add(number);
    }

    public void pop() {
        if (queue1.size() == 0) 
        {
            System.out.println("Stack empty");
            return;
        }

        //no-
        
        while (queue1.size() > 1) 
        {
            queue2.add(queue1.poll());
            
            
        }
        
        System.out.println(queue1.poll());
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDEx7_StacksByQueues stack = new CSDEx7_StacksByQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        
        System.out.println("The complexity of the Enqueue and Dequeue is O(n)");
       
    }

}


