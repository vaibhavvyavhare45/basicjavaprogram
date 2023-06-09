package com.prowings.basicjava8program;

import java.util.Arrays;

public class FindStartWithGivenCharInString {
    public static void main(String[] args) {
        String s="java is object oriented lang java is object robust java is secure and simple lang";
        String words[]=s.split(" ");
        char stringChar='o';
        Arrays.stream(words).filter(str->str.startsWith(String.valueOf(stringChar))).forEach(System.out::println);

        //finding  duplicate  word in string
        Arrays.stream(words).distinct().forEach(System.out::println);
    }


}
