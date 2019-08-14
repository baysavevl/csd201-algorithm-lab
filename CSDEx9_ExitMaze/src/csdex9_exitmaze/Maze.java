/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex9_exitmaze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Stack;

/**
 *
 * @author Luu Thieu Gia
 */
public class Maze {

    int rows = 0, cols = 0;
    char[][] array;

    MazeCell current = new MazeCell();
    MazeCell exit = new MazeCell();
    MazeCell mouse = new MazeCell();

    Stack mazeStack = new Stack();
    String res = "";

    public Maze() {
        int row = 0, col = 0;
        Stack mazeRows = new Stack();

        String filename = "input.txt";

        try {

            File f = new File(filename);
            if (!f.exists()) {
                return;
            }
            String str = "";
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while (str != null) {
                row++;
                cols = str.length();

                str = "1" + str + "1";

                mazeRows.push(str);
                if (str.indexOf("e") != -1) {
                    exit.x = row;
                    exit.y = str.indexOf("e");
                }

                if (str.indexOf("m") != -1) {
                    mouse.x = row;
                    mouse.y = str.indexOf("m");
                }

                str = br.readLine();

            }
            br.close();
            fr.close();

        } catch (Exception e) {

        }

        rows = row;
        array = new char[rows + 2][];

        array[0] = new char[cols + 2];

        while (!mazeRows.isEmpty()) {
            array[row] = ((String) mazeRows.pop()).toCharArray();
            row--;
        }

        array[rows + 1] = new char[cols + 2];
        for (col = 0; col <= cols + 1; col++) {
            array[0][col] = '1';
            array[rows + 1][col] = '1';
        }
    }

    public void pushUnvisited(int row, int col) {
        if (array[row][col] == '0' || array[row][col] == 'e') {
            mazeStack.push(new MazeCell(row, col));

        }
    }

    public void exitMaze() {
        current = mouse;

        while (!current.checkEqual(exit)) {
            int row = current.x;
            int col = current.y;

            //display(System.out);
            if (!current.equals(mouse)) {
                array[row][col] = '.';
            }

            pushUnvisited(row - 1, col);
            pushUnvisited(row + 1, col);
            pushUnvisited(row, col - 1);
            pushUnvisited(row, col + 1);

            if (mazeStack.isEmpty()) {
                res = "FALSE";
                //System.out.println(res);

                try {
                    Formatter f = new Formatter("output.txt");
                    f.format(res);
                    f.close();
                } catch (FileNotFoundException e) {

                }
                return;

            } else {
                current = (MazeCell) mazeStack.pop();
            }
        }
        res = "TRUE";

        try {
            Formatter f = new Formatter("output.txt");
            f.format(res);
            f.close();
        } catch (FileNotFoundException e) {

        }

        //System.out.println(res);
    }

}
