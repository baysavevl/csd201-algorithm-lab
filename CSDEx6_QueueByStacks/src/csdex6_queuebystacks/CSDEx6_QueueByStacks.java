/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex6_queuebystacks;

import java.util.Stack;

/**
 *
 * @author Luu Thieu Gia
 */
public class CSDEx6_QueueByStacks {

    private Stack stA;
    private Stack stB;

    public CSDEx6_QueueByStacks() {
        stA = new Stack();
        stB = new Stack();
    }

    public void enQueue(int x) {
        stA.push(x);
    }

    public void convert() {
        stB.clear();
        while (!stA.empty()) {
            stB.push(stA.pop());
        }
    }

    public int deQueue() {

        return (int) stB.pop();
    }

    public void print() {
        System.out.println("Queue printed : ");
        while (!stB.isEmpty()) {
            System.out.print((int) stB.pop() + " ");
        }

        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CSDEx6_QueueByStacks arr = new CSDEx6_QueueByStacks();

        //EXAMPLE
        arr.enQueue(5);
        
        arr.enQueue(8);
        
        arr.enQueue(7);
       

        arr.convert();
        arr.deQueue();
        
        arr.print();

        arr.enQueue(8);
        arr.convert();
        arr.print();

        
        System.out.println("The complexity of the Enqueue and Dequeue is O(1)");
        
        
        /*
        int choice = 0;

        do {
            System.out.println("1.EnQueue");
            System.out.println("2.DeQueue & Print");
            System.out.println("3.Exit");
            //
            Scanner sc = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("Please input your choice: ");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        System.out.println("out of range");
                    }
                } catch (Exception ex) {
                    System.out.println("Choice must be integer");
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("Input a number = ");
                    int num = Integer.parseInt(sc.nextLine());
                    arr.enQueue(num);
                    break;

                case 2:
                    arr.convert();
                    arr.print();
                    break;
                
                
                    
            }
        } while (choice != 3);
            */
    }

        
    }
    

