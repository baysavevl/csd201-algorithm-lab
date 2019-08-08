/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex4_radixsystem;

import java.util.Stack;

/**
 *
 * @author Luu Thieu Gia
 */
public class RadixSystem {

    Stack<String> Base2 = new Stack<>();
    Stack<String> Base8 = new Stack<>();
    Stack<String> Base16 = new Stack<>();

    /**
     *
     * 
     */
    public String covertBase2(long number) {
        long temp = number;

        while (temp > 0) {
            long surplus = temp % 2;
            String str = String.valueOf(surplus);
            Base2.push(str);
            temp /= 2;
        }

        String res = "";
        while (!Base2.isEmpty()) {
            res = res + Base2.pop();
        }

        return res;
    }

    public String covertBase8(long number) {
        long temp = number;

        while (temp > 0) {
            long surplus = temp % 8;
            String str = String.valueOf(surplus);
            Base2.push(str);
            temp /= 8;
        }

        String res = "";
        while (!Base2.isEmpty()) {
            res = res + Base2.pop();
        }

        return res;
    }

    public String covertBase16(long number) {
        long temp = number;
        String str = "";
        while (temp > 0) {
            long surplus = temp % 16;

            if (surplus < 10) {
                str = String.valueOf(surplus);
            } else {
                if (surplus == 10) {
                    str = "A";
                }
                if (surplus == 11) {
                    str = "B";
                }
                if (surplus == 12) {
                    str = "C";
                }
                if (surplus == 13) {
                    str = "D";
                }
                if (surplus == 14) {
                    str = "E";
                }
                if (surplus == 15) {
                    str = "F";
                }

            }
            Base2.push(str);
            temp /= 16;
        }

        String res = "";
        while (!Base2.isEmpty()) {
            res = res + Base2.pop();
        }

        return res;
    }

}
