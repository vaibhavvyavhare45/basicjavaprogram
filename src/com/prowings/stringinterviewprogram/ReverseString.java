package com.prowings.stringinterviewprogram;

public class ReverseString {
    public static void main(String[] args) {
        String s="java is object oriented lang";

        //first way to reverse string using charAt() method
       /* for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }*/

        //second way to reverse String using toCharArray() method
        char[] ch=s.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
            System.out.print(ch[i]);

        // third way to reverse String using StringBuffer class

       /* StringBuffer str=new StringBuffer(s);
        StringBuffer s1=str.reverse();
        System.out.println(s1);*/

        // third way to reverse String using StringBuilder class

        /*StringBuilder str=new StringBuilder(s);
        StringBuilder str1=str.reverse();
        System.out.println(str1);*/
    }
}
