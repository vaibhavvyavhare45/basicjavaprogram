package com.prowings;

import java.util.HashSet;
import java.util.Set;

public class SetInteview {

    public static void main(String[] args) {
        String s="Vaibhav Vyavhare";
        s=s.toLowerCase();
        String str[]=s.split(" ");
        int[] charCount=new int[256];
        for(int i=0;i<s.length();i++){
            char curChar=s.charAt(i);
            charCount[curChar]++;
        }
        for(int i=0;i<256;i++){
            if(charCount[i]>1){
                char currentChar=(char)(i);
                for(int j=0;j<charCount[i];j++){
                    System.out.print(currentChar);
                }
                System.out.println();
            }
        }
    }
}
