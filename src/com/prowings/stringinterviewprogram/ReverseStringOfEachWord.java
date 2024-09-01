package com.prowings.stringinterviewprogram;

public class ReverseStringOfEachWord {
    public static void main(String[] args) {
        String s="java is robust java is secure";
        String[] words=s.split(" ");
        String reversingString="";

        for(int i=0;i< words.length;i++){
            String word=words[i];
            String reverseWord="";
            for(int j=word.length()-1;j>=0;j--){
                reverseWord=reverseWord+word.charAt(j);

            }
            reversingString=reversingString+reverseWord+" ";


        }
        System.out.println(reversingString);

    }

}
