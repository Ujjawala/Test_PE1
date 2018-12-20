package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class StringNTimes {
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        String st =scanner.nextLine();
        int n = scanner.nextInt();
        StringNTimes obj = new StringNTimes();
        System.out.println(obj.times(st, n));
    }
    public String times(String s, int n){
        StringBuilder st = new StringBuilder(s);
        int l = st.length();
        int x = l - n;
        for (int i = 0; i < n; i++){
            st.append(st.substring(x,l));
        }
        return new String(st);
    }
}
