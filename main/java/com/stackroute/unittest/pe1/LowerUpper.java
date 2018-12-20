package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        LowerUpper obj = new LowerUpper();
        System.out.println(obj.check(c));
    }
    public String check(char c){
        if(c >= 'a' && c <= 'z'){
            return c + " is Lower case letter.";
        }
        else if (c >= 'A' && c <= 'Z'){
            return c + " is Upper case letter.";
        }
        else if (Character.isDigit(c)){
            return c + " is Digit.";
        }
        else {
            return c + " is Special Character.";
        }
    }
}
