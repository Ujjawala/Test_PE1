package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        VowelConsonent obj = new VowelConsonent();
        for(int i = 0; i < n; i++){
            System.out.println(obj.check(s, i));
        }
    }
    public String check(String s, int i){
        if(Character.isLetter(s.charAt(i))){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                return s.charAt(i) + "- Vowel";
            }
            else {
                return s.charAt(i) + "- Consonant";
            }
        }
        else return s.charAt(i) + "- Input is not a letter";
    }
}