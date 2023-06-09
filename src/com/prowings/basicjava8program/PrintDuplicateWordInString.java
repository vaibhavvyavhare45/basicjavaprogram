package com.prowings.basicjava8program;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateWordInString {
    public static void main(String[] args) {
        String s="java is object oriented lang java is object robust java is secure and simple lang";
        String[] word=s.split(" ");
        Map<String,Long> duplicateEle =Arrays.stream(word)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        duplicateEle.forEach((element,count)->System.out.println(element));
    }
}
