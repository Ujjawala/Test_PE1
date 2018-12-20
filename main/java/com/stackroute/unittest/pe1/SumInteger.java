package com.stackroute.unittest.pe1;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SumInteger
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        System.out.println("Total no. of input = " + s.length);
        SumInteger obj = new SumInteger();
        int[] re = obj.sum(s);
        System.out.println("Sum of integer inputs = " + re[0]);
        System.out.println("Total no. of non-integer input = " + re[1]);
    }
    public int[] sum(String[] s){
        int[] re = {0,0};
        int c = 0, sum = 0;
        for (int i = 0; i < s.length; i++){
            if (StringUtils.isNumeric(s[i])){
                re[0] += Integer.parseInt(s[i]);
            }
            else re[1]++;
        }
        return re;
    }
}
