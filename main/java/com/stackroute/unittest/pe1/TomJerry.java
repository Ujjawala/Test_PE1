package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class TomJerry {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TomJerry obj = new TomJerry();
        System.out.println(obj.check(n));
    }
    public String check(int n){
        if(n >= 20 && n <= 30){
            if(n % 2 == 0){
                return "Jerry";
            }
            else return "Tom";
        }
        else return "Not in between 20 & 30";
    }
}