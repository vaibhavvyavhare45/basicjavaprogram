package com.prowings.stringinterviewprogram;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String s="!j#a@v$a&*";
        String str=s.replaceAll("[^a-zA-Z0-9)]","");
        System.out.println(str);


    }
}
