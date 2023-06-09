package com.prowings.stringinterviewprogram;

public class RemoveSpaceInString {
    public static void main(String[] args) {
        String s=" v ai  bh a  v ";
        String str=s.replaceAll("\\s","");
        System.out.println(str);
    }
}
