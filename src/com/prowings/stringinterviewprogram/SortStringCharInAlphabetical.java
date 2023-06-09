package com.prowings.stringinterviewprogram;

import java.util.Arrays;

public class SortStringCharInAlphabetical {
    public static void main(String[] args) {
        String s="vaibhav";
        char[] ch=s.toCharArray();
        char temp=0;
        for (int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if (ch[i]>ch[j]){
                  temp=ch[i];
                 ch[i]=ch[j];
                 ch[j]=temp;
                }
            }
        }
        //second way to sort string  by alphabetical order
        System.out.println(new String(ch));
        Arrays.sort(ch);
        System.out.println();
        System.out.println(ch);
    }
}
