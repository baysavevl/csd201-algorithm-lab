/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex12_nqueen;

import java.util.Scanner;

/**
 *
 * @author Luu Thieu Gia
 */
public class CSDEx12_NQueen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (true) {
            try {

                System.out.print("Input the number of Queens on the chess board = ");
                n = Integer.parseInt(sc.nextLine());
                if (n >= 0) break;
            } catch (Exception e) {
                System.out.println("Re-input the right number");
            }
        }

        Queen method = new Queen(n);
        method.solve();
        System.out.println("");
        System.out.println("Number of solutions : " + method.count);

    }

}
