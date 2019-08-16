/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex10_hanoitower;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;

/**
 *
 * @author Luu Thieu Gia
 */
public class MoveTowers {

    String filename = "Output.txt";
    int count = 0;
    String content = "";
    public void moveTower(int topN, char from, char inter, char to, PrintWriter fileOp) {

            if (topN == 1) {  
                content = "Disk 1 from " + from + " to " + to;
                fileOp.println(content);
                count++;               
                } 
             else {
                moveTower(topN - 1, from, to, inter, fileOp); 
                
                content = "Disk " + topN + " from " + from + " to " + to;
                fileOp.println(content);
               
                moveTower(topN - 1, inter, from, to, fileOp);
                count++;
            }   
    }
    
    public void writeFile(int topN, char from, char inter, char to) throws FileNotFoundException
    {
        PrintWriter fileOP = new PrintWriter(filename);
        this.moveTower(topN, from, inter, to, fileOP);
        fileOP.println("Number of moves = " + count);
        fileOP.close();
    }


}
