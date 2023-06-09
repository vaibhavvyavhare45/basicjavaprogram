package com.prowings.stringinterviewprogram;

import java.util.Arrays;

public class InputCharWithReplaceOccurance {
    public static void main(String[] args) {
        String s = "opentext";
        char c = 't';
        //expected output=open1ex2
        //check char present in the String present or not
//        if (s.indexOf(c) == -1) {
//            System.out.println("given character not available in the string input");
//            System.exit(0);
//        }
        //logic to replace char occurance in String
        char[] ch = s.toCharArray();//o p e n t e x t//o p e n 1 e x t//o p e n 1 e x 2
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) { //o==t p==t e==t n==t t==t e==t x==t t==t
                ch[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(ch));

    }
}
