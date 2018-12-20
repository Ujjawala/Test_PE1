package com.stackroute.unittest.pe1;

import java.util.Arrays;
import java.util.Scanner;

public class SumNonIncre {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = String.valueOf(n).length();
        String [] s = Integer.toString(n).split("");
        int [] arr = new int[l];
        for (int i = 0; i < l; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.print("Sorted number in non-increasing order : ");
        for (int i: arr) {
            System.out.print(i);
        }
        SumNonIncre obj = new SumNonIncre();
        int sum = obj.sum(arr);
        System.out.println("\nSum of even numbers : " + sum);
        System.out.println(obj.check(sum));
    }
    public int sum(int[] arr){
        int sum = 0;
        for (int i: arr) {
            System.out.print(i);
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
    public boolean check(int sum){
        if (sum > 15) {
            return true;
        }
        else {
            return false;
        }
    }
}
