/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex12_nqueen;

import java.io.PrintStream;

/**
 *
 * @author Luu Thieu Gia
 */
public class Queen {
 
    int n;
    final boolean available = true;

    int[] rows = null;
    boolean[] columns = null;
    boolean[] leftDiagonals = null;
    boolean[] rightDiagonals = null;

    int count = 0;

    public Queen(int n) {
        this.n = n;
        //initiate
        int i;
        rows = new int[n];
        columns = new boolean[n];

        for (i = 0; i < n; i++) {
            rows[i] = -1;
            columns[i] = available;
        }
            leftDiagonals = new boolean[2 * n - 1];
            rightDiagonals = new boolean[2 * n - 1];

            for (i = 0; i < 2*n - 1; i++) {
                leftDiagonals[i] = rightDiagonals[i] = available;
            }
            count = 0;
        }

    

    //check the position (row, col) is able to put a chessman
    private boolean validPosition(int row, int col) {
        return (columns[col] == available)&& (leftDiagonals[row + col] == available)&& (rightDiagonals[row - col + n - 1] == available);
    }

    //print the chess board
    public void printBoard(PrintStream stream) {
        System.out.println("");
        if (count<= 0)
            return;
        stream.println("Solution " + count + " :");
        for (int i = 0; i< n; i++)
        {
            for (int j = 0; j< n; j++)
                stream.print((rows[i]==j)?"Q " : "- ");
            stream.println();
        }

    }
    
    //Backtrack to put the chessman on  the line r
    public void putQueen(int row)
    {
        int col;
        for (col= 0; col< n ; col++)
            if (validPosition(row, col))
            {
                rows[row] = col;
                columns[col] = (!available);
                leftDiagonals[row+col] = (!available);
                rightDiagonals[row-col + n-1] = (!available);
                
                if (row<n-1)
                    putQueen(row+1);
                //not arranged yet
                else
                {
                    count++;
                    printBoard(System.out);
                    //able to modify the type of screen out
                }
            
            
        columns[col] = available;
        leftDiagonals [row+col] = available;
        rightDiagonals[row-col+n-1] = available;
           }    
    }
    
    
    //Solve problem
    public void solve()
    {
        count = 0;
        putQueen(0);
    }
                
}
