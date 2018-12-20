package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pattern obj = new Pattern();
        System.out.print(obj.times(n));
    }
    public String times(int n){
        String s = "";
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++)
                s = s + i;
        }
        return s;
    }
}