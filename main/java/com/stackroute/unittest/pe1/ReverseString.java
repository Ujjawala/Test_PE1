package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        StringBuilder st = new StringBuilder(scan.nextLine());
        ReverseString obj = new ReverseString();
        System.out.println(obj.strReverse(st));
    }
    public StringBuilder strReverse(StringBuilder st){
        return st.reverse();
    }
}
