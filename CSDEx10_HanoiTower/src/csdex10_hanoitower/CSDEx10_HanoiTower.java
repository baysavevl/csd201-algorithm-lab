/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex10_hanoitower;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Luu Thieu Gia
 */


public class CSDEx10_HanoiTower {


    public static void main(String[] args) throws IOException {

        MoveTowers method = new MoveTowers();
        int nDisks = 0;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            try
            {
                System.out.print("Input number of Disk = ");
                nDisks = Integer.parseInt(sc.nextLine());
                if (nDisks>0) break;
            }
            catch(Exception e)
            {
                System.out.println("Re-input number of diskes");
            }
                
        }
        
        method.writeFile(nDisks, 'A', 'B', 'C');
        System.out.println("Result was written on the file output");
              
        
        
        
        
    }
    
}
