
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
public class addBigNumber {
    
    Stack stNumber1 = new Stack();
    Stack stNumber2 = new Stack();
    Stack  stResult = new Stack();

    
    public String addBN(String number1, String number2)
    {

        int Len1 = number1.length();
        int Len2 = number2.length();
        if (Len1 > Len2)
        {
            for (int i = 0; i< (Len1 - Len2); i++)
                number2 = "0" + number2;
        }
            else
        {
            for (int i = 0; i< (Len2 - Len1); i++)
                number1 = "0" + number1;
        }    
        
        int carry = 0;

    //step 2 : convert number 1 to stack 1
        for (char c : number1.toCharArray())
                stNumber1.push(c);
        
        
        for (char c : number2.toCharArray())
                stNumber2.push(c);
        
    
       
        //step 3 : add 2 numbers
        while (!stNumber1.isEmpty())
        {
            int temp1 = Integer.parseInt(stNumber1.pop().toString());
            int temp2 = Integer.parseInt(stNumber2.pop().toString());
            
            int res = (temp1+ temp2 + carry)% 10;
            stResult.push(res);
            carry = (temp1 + temp2+ carry) / 10;
        }
        if (carry==1) stResult.push(carry);
        
        
        String tmp = "";
        while (!stResult.empty()) 
        {
            tmp = tmp + stResult.pop();//System.out.print(stResult.pop());
        }
        
        return tmp;
        
    }
    
}
