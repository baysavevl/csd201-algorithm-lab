/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex9_exitmaze;

/**
 *
 * @author Luu Thieu Gia
 */
public class MazeCell {
    
    int x;
    int y;

    public MazeCell() {
    }

    public MazeCell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean checkEqual(MazeCell cell)
    {
        return (x == cell.x && y== cell.y);
    }
    
}
