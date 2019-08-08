
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luu Thieu Gia
 */
public class subBigNumber {

    Stack stBigNum = new Stack();
    Stack stSmaNum = new Stack();
    Stack stResult = new Stack();

    public String subBigNumber(String number1, String number2) {
        int Len1 = number1.length();
        int Len2 = number2.length();
        if (Len1 > Len2) {
            for (int i = 0; i < (Len1 - Len2); i++) {
                number2 = "0" + number2;
            }
        } else if (Len1 < Len2) {
            for (int i = 0; i < (Len2 - Len1); i++) {
                number1 = "0" + number1;
            }
        }
        int check = 0;

        if (number1.compareTo(number2) < 0) {
            String temp = number1;
            number1 = number2;
            number2 = temp;

            check = 1;
        }

        //step 2 : convert number 1 to stack 1
        for (char c : number1.toCharArray()) {
            stBigNum.push(c);
        }

        for (char c : number2.toCharArray()) {
            stSmaNum.push(c);
        }

        int carry = 0;
        //step 3 : add 2 numbers
        while (!stBigNum.isEmpty()) {
            int temp1 = Integer.parseInt(stBigNum.pop().toString());
            int temp2 = Integer.parseInt(stSmaNum.pop().toString());
            int res = 0;
            if (temp1 < (temp2 + carry)) {
                res = (temp1 + 10 - temp2 - carry) % 10;
                carry = 1;
            } else {
                res = (temp1 - temp2 - carry) % 10;
                carry = 0;
            }
            stResult.push(res);
        }
        if (check == 1) {
            stResult.push("-");
        }
        //step 4: print out the result

        //while (!(stResult.lastElement().equals("0"))) 
        //stResult.remove(stResult.lastElement());
        String temp = "";
        while (!stResult.empty()) {
            temp = temp + stResult.pop();
            //System.out.print(stResult.pop());
        }
        return temp;

    }

}
